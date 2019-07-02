/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import br.com.senior.custom.ConversionContext;
import br.com.senior.custom.ConvertedObjectCondition;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import br.com.senior.custom.EntityDTOConverter;

@Component("furb.basico.AtorDTOConverter")
@Lazy
public class AtorDTOConverter extends EntityDTOConverter {

	@Autowired
	private FilmeDTOConverter filmeConverter;

	@Override
	public void setupMapperToEntity(ModelMapper mapper, ConversionContext conversionContext) {
		Converter<Filme, FilmeEntity> filmeConverter = new ContextualizedConverter<Filme, FilmeEntity>() {
			@Override
			public FilmeEntity convert(Filme source) {
				return toEntity(source, FilmeEntity.class, conversionContext);
			}
		};

		PropertyMap<Ator, AtorEntity> atorMap = new PropertyMap<Ator, AtorEntity>() {
			@Override
			protected void configure() {
				using(filmeConverter).map(source.filme).setFilme(null);
			}
		};
		mapper.addMappings(atorMap);
		if (mapper.getTypeMap(Filme.class, FilmeEntity.class) == null) {
			this.filmeConverter.setupMapperToEntity(mapper, conversionContext);
		}
		mapper.getTypeMap(Ator.class, AtorEntity.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}

	@Override
	public void setupMapperToDTO(ModelMapper mapper, ConversionContext conversionContext) {
		
		Converter<FilmeEntity, Filme> filmeConverter = new ContextualizedConverter<FilmeEntity, Filme>() {
			@Override
			public Filme convert(FilmeEntity source) {
				if (conversionContext.isIncludeTranslations()) {
					return toDTOWithTranslations(source, Filme.class, conversionContext.getRelationshipFields("filme"), conversionContext);
				}
				return toDTO(source, Filme.class, conversionContext.getRelationshipFields("filme"), conversionContext);
			}
		};
		
		//eager relationships
		PropertyMap<AtorEntity, Ator> atorMap = new PropertyMap<AtorEntity, Ator>() {
			@Override
			public void configure() {
				using(filmeConverter).map(source.getFilme(), destination.filme);
			}
		};
		//lazy relationships
		
		mapper.addMappings(atorMap);
		
		if (mapper.getTypeMap(FilmeEntity.class, Filme.class) == null) {
		    this.filmeConverter.setupMapperToDTO(mapper, conversionContext);
		}
		mapper.getTypeMap(AtorEntity.class, Ator.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}
}
