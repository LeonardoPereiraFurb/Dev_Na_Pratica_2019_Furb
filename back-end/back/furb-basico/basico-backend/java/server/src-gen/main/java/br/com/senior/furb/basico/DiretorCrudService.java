/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Diretor.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface DiretorCrudService extends CrudService<DiretorEntity> {
	
	public DiretorEntity createDiretor(DiretorEntity toCreate);
	
	@Deprecated
	public DiretorEntity createMergeDiretor(DiretorEntity toCreateMerge);
	
	public DiretorEntity updateDiretor(DiretorEntity toUpdate);
	
	@Deprecated
	public DiretorEntity updateMergeDiretor(DiretorEntity toUpdateMerge);
	
	public void deleteDiretor(Id id);
	
	public DiretorEntity retrieveDiretor(Id id);
	
	@Deprecated
	public List<DiretorEntity> listDiretor(int skip, int top);
	
	public Page<DiretorEntity> listDiretorPageable(int skip, int top);
	
	public Page<DiretorEntity> listDiretorPageable(int skip, int top, String orderBy);
	
	public Page<DiretorEntity> listDiretorPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkDiretor(List<DiretorEntity> entities);

	public DiretorBaseRepository getRepository();
	
}
