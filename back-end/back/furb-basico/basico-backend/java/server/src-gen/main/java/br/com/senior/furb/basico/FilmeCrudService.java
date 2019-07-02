/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Filme.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface FilmeCrudService extends CrudService<FilmeEntity> {
	
	public FilmeEntity createFilme(FilmeEntity toCreate);
	
	@Deprecated
	public FilmeEntity createMergeFilme(FilmeEntity toCreateMerge);
	
	public FilmeEntity updateFilme(FilmeEntity toUpdate);
	
	@Deprecated
	public FilmeEntity updateMergeFilme(FilmeEntity toUpdateMerge);
	
	public void deleteFilme(Id id);
	
	public FilmeEntity retrieveFilme(Id id);
	
	@Deprecated
	public List<FilmeEntity> listFilme(int skip, int top);
	
	public Page<FilmeEntity> listFilmePageable(int skip, int top);
	
	public Page<FilmeEntity> listFilmePageable(int skip, int top, String orderBy);
	
	public Page<FilmeEntity> listFilmePageable(int skip, int top, String orderBy, String filter);
	
	public Page<FilmeEntity> listFilmePageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkFilme(List<FilmeEntity> entities);

	public FilmeBaseRepository getRepository();
	
}
