/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Ator.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface AtorCrudService extends CrudService<AtorEntity> {
	
	public AtorEntity createAtor(AtorEntity toCreate);
	
	@Deprecated
	public AtorEntity createMergeAtor(AtorEntity toCreateMerge);
	
	public AtorEntity updateAtor(AtorEntity toUpdate);
	
	@Deprecated
	public AtorEntity updateMergeAtor(AtorEntity toUpdateMerge);
	
	public void deleteAtor(Id id);
	
	public AtorEntity retrieveAtor(Id id);
	
	@Deprecated
	public List<AtorEntity> listAtor(int skip, int top);
	
	public Page<AtorEntity> listAtorPageable(int skip, int top);
	
	public Page<AtorEntity> listAtorPageable(int skip, int top, String orderBy);
	
	public Page<AtorEntity> listAtorPageable(int skip, int top, String orderBy, String filter);
	
	public Page<AtorEntity> listAtorPageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkAtor(List<AtorEntity> entities);

	public AtorBaseRepository getRepository();
	
}
