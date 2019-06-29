/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.concurrent.CompletableFuture;

import br.com.senior.furb.basico.HelloWorldInput;
import br.com.senior.furb.basico.HelloWorldOutput;
import br.com.senior.furb.basico.RetornaEstoqueInput;
import br.com.senior.furb.basico.RetornaEstoqueOutput;
import br.com.senior.furb.basico.ObterUrlUploadFotoInput;
import br.com.senior.furb.basico.ObterUrlUploadFotoOutput;
import br.com.senior.furb.basico.GravarFotoInput;
import br.com.senior.furb.basico.GravarFotoOutput;
import br.com.senior.furb.basico.ObterUrlDownloadFotoInput;
import br.com.senior.furb.basico.ObterUrlDownloadFotoOutput;
import br.com.senior.furb.basico.GetMetadataInput;
import br.com.senior.furb.basico.GetMetadataOutput;
import br.com.senior.furb.basico.ImportGeneroInput;
import br.com.senior.furb.basico.ImportGeneroOutput;
import br.com.senior.furb.basico.ExportGeneroInput;
import br.com.senior.furb.basico.ExportGeneroOutput;
import br.com.senior.furb.basico.ImportDiretorInput;
import br.com.senior.furb.basico.ImportDiretorOutput;
import br.com.senior.furb.basico.ExportDiretorInput;
import br.com.senior.furb.basico.ExportDiretorOutput;
import br.com.senior.furb.basico.ImportFilmeInput;
import br.com.senior.furb.basico.ImportFilmeOutput;
import br.com.senior.furb.basico.ExportFilmeInput;
import br.com.senior.furb.basico.ExportFilmeOutput;
import br.com.senior.furb.basico.ImportAtorInput;
import br.com.senior.furb.basico.ImportAtorOutput;
import br.com.senior.furb.basico.ExportAtorInput;
import br.com.senior.furb.basico.ExportAtorOutput;
import br.com.senior.furb.basico.GetDependenciesOutput;
import br.com.senior.furb.basico.Genero;
import br.com.senior.furb.basico.CreateBulkGeneroInput;
import br.com.senior.furb.basico.CreateBulkGeneroOutput;
import br.com.senior.furb.basico.Diretor;
import br.com.senior.furb.basico.CreateBulkDiretorInput;
import br.com.senior.furb.basico.CreateBulkDiretorOutput;
import br.com.senior.furb.basico.Filme;
import br.com.senior.furb.basico.CreateBulkFilmeInput;
import br.com.senior.furb.basico.CreateBulkFilmeOutput;
import br.com.senior.furb.basico.Ator;
import br.com.senior.furb.basico.CreateBulkAtorInput;
import br.com.senior.furb.basico.CreateBulkAtorOutput;
import br.com.senior.furb.basico.ServiceStartedPayload;
import br.com.senior.furb.basico.NotifyUserEventPayload;
import br.com.senior.furb.basico.ImportGeneroEventPayload;
import br.com.senior.furb.basico.ExportGeneroEventPayload;
import br.com.senior.furb.basico.ImportDiretorEventPayload;
import br.com.senior.furb.basico.ExportDiretorEventPayload;
import br.com.senior.furb.basico.ImportFilmeEventPayload;
import br.com.senior.furb.basico.ExportFilmeEventPayload;
import br.com.senior.furb.basico.ImportAtorEventPayload;
import br.com.senior.furb.basico.ExportAtorEventPayload;

/**
* 
*/
public interface BasicoStub {

	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	HelloWorldOutput helloWorld(HelloWorldInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void helloWorld(HelloWorldInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a quantidade de itens no estoque de acordo com um pedido
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	RetornaEstoqueOutput retornaEstoque(RetornaEstoqueInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a quantidade de itens no estoque de acordo com um pedido
	 * Chamada assíncrona
	 */
	void retornaEstoque(RetornaEstoqueInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a quantidade de itens no estoque de acordo com um pedido
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<RetornaEstoqueOutput> retornaEstoqueRequest(RetornaEstoqueInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para upload da foto
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ObterUrlUploadFotoOutput obterUrlUploadFoto(ObterUrlUploadFotoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para upload da foto
	 * Chamada assíncrona
	 */
	void obterUrlUploadFoto(ObterUrlUploadFotoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para upload da foto
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ObterUrlUploadFotoOutput> obterUrlUploadFotoRequest(ObterUrlUploadFotoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava a foto que foi upada
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GravarFotoOutput gravarFoto(GravarFotoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava a foto que foi upada
	 * Chamada assíncrona
	 */
	void gravarFoto(GravarFotoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava a foto que foi upada
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GravarFotoOutput> gravarFotoRequest(GravarFotoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para download da foto
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ObterUrlDownloadFotoOutput obterUrlDownloadFoto(ObterUrlDownloadFotoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para download da foto
	 * Chamada assíncrona
	 */
	void obterUrlDownloadFoto(ObterUrlDownloadFotoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para download da foto
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ObterUrlDownloadFotoOutput> obterUrlDownloadFotoRequest(ObterUrlDownloadFotoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetMetadataOutput getMetadata(GetMetadataInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona
	 */
	void getMetadata(GetMetadataInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportGeneroOutput importGenero(ImportGeneroInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importGenero(ImportGeneroInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportGeneroOutput> importGeneroRequest(ImportGeneroInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportGeneroOutput exportGenero(ExportGeneroInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportGenero(ExportGeneroInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportGeneroOutput> exportGeneroRequest(ExportGeneroInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportDiretorOutput importDiretor(ImportDiretorInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importDiretor(ImportDiretorInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportDiretorOutput> importDiretorRequest(ImportDiretorInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportDiretorOutput exportDiretor(ExportDiretorInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportDiretor(ExportDiretorInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportDiretorOutput> exportDiretorRequest(ExportDiretorInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportFilmeOutput importFilme(ImportFilmeInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importFilme(ImportFilmeInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportFilmeOutput> importFilmeRequest(ImportFilmeInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportFilmeOutput exportFilme(ExportFilmeInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportFilme(ExportFilmeInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportFilmeOutput> exportFilmeRequest(ExportFilmeInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportAtorOutput importAtor(ImportAtorInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importAtor(ImportAtorInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportAtorOutput> importAtorRequest(ImportAtorInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportAtorOutput exportAtor(ExportAtorInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportAtor(ExportAtorInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportAtorOutput> exportAtorRequest(ExportAtorInput input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Genero entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Genero.PagedResults listGenero(Genero.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Genero entity.
	 * Chamada assíncrona
	 */
	void listGenero(Genero.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Genero entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Genero.PagedResults> listGeneroRequest(Genero.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Diretor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Diretor.PagedResults listDiretor(Diretor.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Diretor entity.
	 * Chamada assíncrona
	 */
	void listDiretor(Diretor.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Diretor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Diretor.PagedResults> listDiretorRequest(Diretor.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Filme entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Filme.PagedResults listFilme(Filme.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Filme entity.
	 * Chamada assíncrona
	 */
	void listFilme(Filme.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Filme entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Filme.PagedResults> listFilmeRequest(Filme.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Ator entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ator.PagedResults listAtor(Ator.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Ator entity.
	 * Chamada assíncrona
	 */
	void listAtor(Ator.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Ator entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ator.PagedResults> listAtorRequest(Ator.PageRequest input);
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetDependenciesOutput getDependencies(long timeout);
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona
	 */
	void getDependencies();
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetDependenciesOutput> getDependenciesRequest();
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Genero entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Genero createGenero(Genero input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Genero entity.
	 * Chamada assíncrona
	 */
	void createGenero(Genero input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Genero entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Genero> createGeneroRequest(Genero input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Genero entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkGeneroOutput createBulkGenero(CreateBulkGeneroInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Genero entity.
	 * Chamada assíncrona
	 */
	void createBulkGenero(CreateBulkGeneroInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Genero entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkGeneroOutput> createBulkGeneroRequest(CreateBulkGeneroInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Genero entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Genero createMergeGenero(Genero input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Genero entity.
	 * Chamada assíncrona
	 */
	void createMergeGenero(Genero input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Genero entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Genero> createMergeGeneroRequest(Genero input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Genero entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Genero retrieveGenero(Genero.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Genero entity.
	 * Chamada assíncrona
	 */
	void retrieveGenero(Genero.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Genero entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Genero> retrieveGeneroRequest(Genero.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Genero entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Genero updateGenero(Genero input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Genero entity.
	 * Chamada assíncrona
	 */
	void updateGenero(Genero input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Genero entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Genero> updateGeneroRequest(Genero input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Genero entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Genero updateMergeGenero(Genero input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Genero entity.
	 * Chamada assíncrona
	 */
	void updateMergeGenero(Genero input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Genero entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Genero> updateMergeGeneroRequest(Genero input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Genero entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteGenero(Genero.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Genero entity.
	 * Chamada assíncrona
	 */
	void deleteGenero(Genero.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Diretor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Diretor createDiretor(Diretor input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Diretor entity.
	 * Chamada assíncrona
	 */
	void createDiretor(Diretor input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Diretor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Diretor> createDiretorRequest(Diretor input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Diretor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkDiretorOutput createBulkDiretor(CreateBulkDiretorInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Diretor entity.
	 * Chamada assíncrona
	 */
	void createBulkDiretor(CreateBulkDiretorInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Diretor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkDiretorOutput> createBulkDiretorRequest(CreateBulkDiretorInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Diretor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Diretor createMergeDiretor(Diretor input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Diretor entity.
	 * Chamada assíncrona
	 */
	void createMergeDiretor(Diretor input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Diretor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Diretor> createMergeDiretorRequest(Diretor input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Diretor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Diretor retrieveDiretor(Diretor.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Diretor entity.
	 * Chamada assíncrona
	 */
	void retrieveDiretor(Diretor.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Diretor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Diretor> retrieveDiretorRequest(Diretor.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Diretor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Diretor updateDiretor(Diretor input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Diretor entity.
	 * Chamada assíncrona
	 */
	void updateDiretor(Diretor input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Diretor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Diretor> updateDiretorRequest(Diretor input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Diretor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Diretor updateMergeDiretor(Diretor input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Diretor entity.
	 * Chamada assíncrona
	 */
	void updateMergeDiretor(Diretor input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Diretor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Diretor> updateMergeDiretorRequest(Diretor input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Diretor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteDiretor(Diretor.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Diretor entity.
	 * Chamada assíncrona
	 */
	void deleteDiretor(Diretor.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Filme entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Filme createFilme(Filme input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Filme entity.
	 * Chamada assíncrona
	 */
	void createFilme(Filme input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Filme entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Filme> createFilmeRequest(Filme input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Filme entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkFilmeOutput createBulkFilme(CreateBulkFilmeInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Filme entity.
	 * Chamada assíncrona
	 */
	void createBulkFilme(CreateBulkFilmeInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Filme entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkFilmeOutput> createBulkFilmeRequest(CreateBulkFilmeInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Filme entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Filme createMergeFilme(Filme input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Filme entity.
	 * Chamada assíncrona
	 */
	void createMergeFilme(Filme input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Filme entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Filme> createMergeFilmeRequest(Filme input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Filme entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Filme retrieveFilme(Filme.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Filme entity.
	 * Chamada assíncrona
	 */
	void retrieveFilme(Filme.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Filme entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Filme> retrieveFilmeRequest(Filme.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Filme entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Filme updateFilme(Filme input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Filme entity.
	 * Chamada assíncrona
	 */
	void updateFilme(Filme input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Filme entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Filme> updateFilmeRequest(Filme input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Filme entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Filme updateMergeFilme(Filme input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Filme entity.
	 * Chamada assíncrona
	 */
	void updateMergeFilme(Filme input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Filme entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Filme> updateMergeFilmeRequest(Filme input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Filme entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteFilme(Filme.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Filme entity.
	 * Chamada assíncrona
	 */
	void deleteFilme(Filme.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Ator entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ator createAtor(Ator input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Ator entity.
	 * Chamada assíncrona
	 */
	void createAtor(Ator input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Ator entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ator> createAtorRequest(Ator input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Ator entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkAtorOutput createBulkAtor(CreateBulkAtorInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Ator entity.
	 * Chamada assíncrona
	 */
	void createBulkAtor(CreateBulkAtorInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Ator entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkAtorOutput> createBulkAtorRequest(CreateBulkAtorInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Ator entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ator createMergeAtor(Ator input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Ator entity.
	 * Chamada assíncrona
	 */
	void createMergeAtor(Ator input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Ator entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ator> createMergeAtorRequest(Ator input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Ator entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ator retrieveAtor(Ator.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Ator entity.
	 * Chamada assíncrona
	 */
	void retrieveAtor(Ator.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Ator entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ator> retrieveAtorRequest(Ator.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Ator entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ator updateAtor(Ator input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Ator entity.
	 * Chamada assíncrona
	 */
	void updateAtor(Ator input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Ator entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ator> updateAtorRequest(Ator input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Ator entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ator updateMergeAtor(Ator input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Ator entity.
	 * Chamada assíncrona
	 */
	void updateMergeAtor(Ator input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Ator entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ator> updateMergeAtorRequest(Ator input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Ator entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteAtor(Ator.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Ator entity.
	 * Chamada assíncrona
	 */
	void deleteAtor(Ator.Id input);
	


	/**
	* Chamada assíncrona para o método publishServiceStarted 
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	void publishServiceStarted( ServiceStartedPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent 
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	void publishNotifyUserEvent( NotifyUserEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportGeneroEvent 
	* This is a public operation
	*/
	void publishImportGeneroEvent( ImportGeneroEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportGeneroEvent 
	* This is a public operation
	*/
	void publishExportGeneroEvent( ExportGeneroEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportDiretorEvent 
	* This is a public operation
	*/
	void publishImportDiretorEvent( ImportDiretorEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportDiretorEvent 
	* This is a public operation
	*/
	void publishExportDiretorEvent( ExportDiretorEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportFilmeEvent 
	* This is a public operation
	*/
	void publishImportFilmeEvent( ImportFilmeEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportFilmeEvent 
	* This is a public operation
	*/
	void publishExportFilmeEvent( ExportFilmeEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportAtorEvent 
	* This is a public operation
	*/
	void publishImportAtorEvent( ImportAtorEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportAtorEvent 
	* This is a public operation
	*/
	void publishExportAtorEvent( ExportAtorEventPayload input );
			
	

}
