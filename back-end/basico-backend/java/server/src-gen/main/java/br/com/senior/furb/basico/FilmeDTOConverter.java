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

@Component("furb.basico.FilmeDTOConverter")
@Lazy
public class FilmeDTOConverter extends EntityDTOConverter {

	@Autowired
	private AtorDTOConverter atorConverter;
	@Autowired
	private DiretorDTOConverter diretorConverter;
	@Autowired
	private GeneroDTOConverter generoConverter;

	@Override
	public void setupMapperToEntity(ModelMapper mapper, ConversionContext conversionContext) {
		Converter <List<Ator>, List<AtorEntity>> atoresConverter = new ContextualizedConverter<List<Ator>, List<AtorEntity>>() {
			@Override
			public List<AtorEntity> convert(List<Ator> source) {
				if (source == null) {
					return Collections.emptyList();
				}
				return source.stream().map(d -> toEntity(d, AtorEntity.class, conversionContext)).collect(Collectors.toList());
			}
		};
		Converter<Diretor, DiretorEntity> diretorConverter = new ContextualizedConverter<Diretor, DiretorEntity>() {
			@Override
			public DiretorEntity convert(Diretor source) {
				return toEntity(source, DiretorEntity.class, conversionContext);
			}
		};
		Converter <List<Genero>, List<GeneroEntity>> generosConverter = new ContextualizedConverter<List<Genero>, List<GeneroEntity>>() {
			@Override
			public List<GeneroEntity> convert(List<Genero> source) {
				if (source == null) {
					return Collections.emptyList();
				}
				return source.stream().map(d -> toEntity(d, GeneroEntity.class, conversionContext)).collect(Collectors.toList());
			}
		};

		PropertyMap<Filme, FilmeEntity> filmeMap = new PropertyMap<Filme, FilmeEntity>() {
			@Override
			protected void configure() {
				using(atoresConverter).map(source.atores).setAtores(null);
				using(diretorConverter).map(source.diretor).setDiretor(null);
				using(generosConverter).map(source.generos).setGeneros(null);
			}
		};
		mapper.addMappings(filmeMap);
		if (mapper.getTypeMap(Ator.class, AtorEntity.class) == null) {
			this.atorConverter.setupMapperToEntity(mapper, conversionContext);
		}
		if (mapper.getTypeMap(Diretor.class, DiretorEntity.class) == null) {
			this.diretorConverter.setupMapperToEntity(mapper, conversionContext);
		}
		if (mapper.getTypeMap(Genero.class, GeneroEntity.class) == null) {
			this.generoConverter.setupMapperToEntity(mapper, conversionContext);
		}
		mapper.getTypeMap(Filme.class, FilmeEntity.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}

	@Override
	public void setupMapperToDTO(ModelMapper mapper, ConversionContext conversionContext) {
		
		Converter <List<AtorEntity>, List<Ator>> atoresConverter = new ContextualizedConverter<List<AtorEntity>, List<Ator>>() {
			@Override
			public List<Ator> convert(List<AtorEntity> source) {
				if (conversionContext.isIncludeTranslations()) {
					return source.stream().map(e -> toDTOWithTranslations(e, Ator.class, conversionContext.getRelationshipFields("atores"), conversionContext)).collect(Collectors.toList());
				}
				return source.stream().map(e -> toDTO(e, Ator.class, conversionContext.getRelationshipFields("atores"), conversionContext)).collect(Collectors.toList());
			}
		};
		
		
		Converter<DiretorEntity, Diretor> diretorConverter = new ContextualizedConverter<DiretorEntity, Diretor>() {
			@Override
			public Diretor convert(DiretorEntity source) {
				if (conversionContext.isIncludeTranslations()) {
					return toDTOWithTranslations(source, Diretor.class, conversionContext.getRelationshipFields("diretor"), conversionContext);
				}
				return toDTO(source, Diretor.class, conversionContext.getRelationshipFields("diretor"), conversionContext);
			}
		};
		
		
		Converter <List<GeneroEntity>, List<Genero>> generosConverter = new ContextualizedConverter<List<GeneroEntity>, List<Genero>>() {
			@Override
			public List<Genero> convert(List<GeneroEntity> source) {
				if (conversionContext.isIncludeTranslations()) {
					return source.stream().map(e -> toDTOWithTranslations(e, Genero.class, conversionContext.getRelationshipFields("generos"), conversionContext)).collect(Collectors.toList());
				}
				return source.stream().map(e -> toDTO(e, Genero.class, conversionContext.getRelationshipFields("generos"), conversionContext)).collect(Collectors.toList());
			}
		};
		
		//eager relationships
		PropertyMap<FilmeEntity, Filme> filmeMap = new PropertyMap<FilmeEntity, Filme>() {
			@Override
			public void configure() {
				using(atoresConverter).map(source.getAtores(), destination.atores);
				using(diretorConverter).map(source.getDiretor(), destination.diretor);
				using(generosConverter).map(source.getGeneros(), destination.generos);
			}
		};
		//lazy relationships
		
		mapper.addMappings(filmeMap);
		
		if (mapper.getTypeMap(AtorEntity.class, Ator.class) == null) {
		    this.atorConverter.setupMapperToDTO(mapper, conversionContext);
		}
		if (mapper.getTypeMap(DiretorEntity.class, Diretor.class) == null) {
		    this.diretorConverter.setupMapperToDTO(mapper, conversionContext);
		}
		if (mapper.getTypeMap(GeneroEntity.class, Genero.class) == null) {
		    this.generoConverter.setupMapperToDTO(mapper, conversionContext);
		}
		mapper.getTypeMap(FilmeEntity.class, Filme.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}
}
