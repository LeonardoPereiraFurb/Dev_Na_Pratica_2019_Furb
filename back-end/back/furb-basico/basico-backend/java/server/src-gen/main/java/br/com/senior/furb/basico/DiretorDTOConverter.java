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

@Component("furb.basico.DiretorDTOConverter")
@Lazy
public class DiretorDTOConverter extends EntityDTOConverter {

	@Autowired
	private FilmeDTOConverter filmeConverter;

	@Override
	public void setupMapperToEntity(ModelMapper mapper, ConversionContext conversionContext) {
		Converter <List<Filme>, List<FilmeEntity>> filmesConverter = new ContextualizedConverter<List<Filme>, List<FilmeEntity>>() {
			@Override
			public List<FilmeEntity> convert(List<Filme> source) {
				if (source == null) {
					return Collections.emptyList();
				}
				return source.stream().map(d -> toEntity(d, FilmeEntity.class, conversionContext)).collect(Collectors.toList());
			}
		};

		PropertyMap<Diretor, DiretorEntity> diretorMap = new PropertyMap<Diretor, DiretorEntity>() {
			@Override
			protected void configure() {
				using(filmesConverter).map(source.filmes).setFilmes(null);
			}
		};
		mapper.addMappings(diretorMap);
		if (mapper.getTypeMap(Filme.class, FilmeEntity.class) == null) {
			this.filmeConverter.setupMapperToEntity(mapper, conversionContext);
		}
		mapper.getTypeMap(Diretor.class, DiretorEntity.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}

	@Override
	public void setupMapperToDTO(ModelMapper mapper, ConversionContext conversionContext) {
		
		Converter <List<FilmeEntity>, List<Filme>> filmesConverter = new ContextualizedConverter<List<FilmeEntity>, List<Filme>>() {
			@Override
			public List<Filme> convert(List<FilmeEntity> source) {
				if (conversionContext.isIncludeTranslations()) {
					return source.stream().map(e -> toDTOWithTranslations(e, Filme.class, conversionContext.getRelationshipFields("filmes"), conversionContext)).collect(Collectors.toList());
				}
				return source.stream().map(e -> toDTO(e, Filme.class, conversionContext.getRelationshipFields("filmes"), conversionContext)).collect(Collectors.toList());
			}
		};
		
		//eager relationships
		PropertyMap<DiretorEntity, Diretor> diretorMap = new PropertyMap<DiretorEntity, Diretor>() {
			@Override
			public void configure() {
				using(filmesConverter).map(source.getFilmes(), destination.filmes);
			}
		};
		//lazy relationships
		
		mapper.addMappings(diretorMap);
		
		if (mapper.getTypeMap(FilmeEntity.class, Filme.class) == null) {
		    this.filmeConverter.setupMapperToDTO(mapper, conversionContext);
		}
		mapper.getTypeMap(DiretorEntity.class, Diretor.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}
}
