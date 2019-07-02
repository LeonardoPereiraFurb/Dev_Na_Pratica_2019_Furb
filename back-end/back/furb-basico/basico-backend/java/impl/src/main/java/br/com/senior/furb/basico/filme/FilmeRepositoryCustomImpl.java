package br.com.senior.furb.basico.filme;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQuery;

import br.com.senior.furb.basico.Filme;
import br.com.senior.furb.basico.FilmeDTOConverter;
import br.com.senior.furb.basico.FilmeEntity;
import br.com.senior.furb.basico.QFilmeEntity;
import br.com.senior.furb.basico.core.RepositoryBaseJpa;

@Repository
public class FilmeRepositoryCustomImpl extends RepositoryBaseJpa implements FilmeRepositoryCustom {

	@Autowired
	FilmeRepository filmeRepository;
	
	@Autowired
	FilmeDTOConverter filmeConverter;
	
	@Override
	public List<FilmeEntity> getAll() {
		// TODO Auto-generated method stub
		QFilmeEntity filmes = QFilmeEntity.filmeEntity;
		JPAQuery<FilmeEntity> query = select(filmes).from(filmes);
		return query.fetch();
	}
}
