/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Genero.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface GeneroCrudService extends CrudService<GeneroEntity> {
	
	public GeneroEntity createGenero(GeneroEntity toCreate);
	
	@Deprecated
	public GeneroEntity createMergeGenero(GeneroEntity toCreateMerge);
	
	public GeneroEntity updateGenero(GeneroEntity toUpdate);
	
	@Deprecated
	public GeneroEntity updateMergeGenero(GeneroEntity toUpdateMerge);
	
	public void deleteGenero(Id id);
	
	public GeneroEntity retrieveGenero(Id id);
	
	@Deprecated
	public List<GeneroEntity> listGenero(int skip, int top);
	
	public Page<GeneroEntity> listGeneroPageable(int skip, int top);
	
	public Page<GeneroEntity> listGeneroPageable(int skip, int top, String orderBy);
	
	public Page<GeneroEntity> listGeneroPageable(int skip, int top, String orderBy, String filter);
	
	public Page<GeneroEntity> listGeneroPageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkGenero(List<GeneroEntity> entities);

	public GeneroBaseRepository getRepository();
	
}
