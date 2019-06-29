/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.function.Supplier;

import br.com.senior.messaging.Message;
import br.com.senior.messaging.IMessenger;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;

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

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.BasicoException;
import br.com.senior.furb.basico.BasicoConstants;

/**
* 
*/
public class BasicoStubImpl  implements BasicoStub {

	protected final Supplier<IMessenger> messengerSupplier;
	protected final UserIdentifier userId;
	protected final Supplier<Message> messageSupplier;

	/**
	 * Use {@link #BasicoStubImpl(MessengerSupplier, UserIdentifier, MessageSupplier)} instead.
	 */
	@Deprecated
	public BasicoStubImpl(IMessenger messenger, UserIdentifier userId) {
		this(new InstanceMessengerSupplier(messenger), userId, null);
	}

	/**
	 * @param messengerSupplier Supplies current service messenger.
	 * @param userId Provides tenant and user name to send or publish messages.
	 * @param messageSupplier Supplies current message being processed by service. Used to send messages by foolowup.
	 */
	public BasicoStubImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	/**
	 * Chamada síncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public HelloWorldOutput helloWorld(HelloWorldInput input, long timeout) {
		br.com.senior.furb.basico.impl.HelloWorldImpl impl = new br.com.senior.furb.basico.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorld(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void helloWorld(HelloWorldInput input) {
		br.com.senior.furb.basico.impl.HelloWorldImpl impl = new br.com.senior.furb.basico.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		impl.helloWorld(input);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input) {
		br.com.senior.furb.basico.impl.HelloWorldImpl impl = new br.com.senior.furb.basico.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorldRequest(input);
	}
	/**
	 * Chamada síncrona para o método retornaEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a quantidade de itens no estoque de acordo com um pedido
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public RetornaEstoqueOutput retornaEstoque(RetornaEstoqueInput input, long timeout) {
		br.com.senior.furb.basico.impl.RetornaEstoqueImpl impl = new br.com.senior.furb.basico.impl.RetornaEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.retornaEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retornaEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a quantidade de itens no estoque de acordo com um pedido
	 */
	@Override
	public void retornaEstoque(RetornaEstoqueInput input) {
		br.com.senior.furb.basico.impl.RetornaEstoqueImpl impl = new br.com.senior.furb.basico.impl.RetornaEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.retornaEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método retornaEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a quantidade de itens no estoque de acordo com um pedido
	 */
	@Override
	public CompletableFuture<RetornaEstoqueOutput> retornaEstoqueRequest(RetornaEstoqueInput input) {
		br.com.senior.furb.basico.impl.RetornaEstoqueImpl impl = new br.com.senior.furb.basico.impl.RetornaEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.retornaEstoqueRequest(input);
	}
	/**
	 * Chamada síncrona para o método obterUrlUploadFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para upload da foto
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ObterUrlUploadFotoOutput obterUrlUploadFoto(ObterUrlUploadFotoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ObterUrlUploadFotoImpl impl = new br.com.senior.furb.basico.impl.ObterUrlUploadFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.obterUrlUploadFoto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método obterUrlUploadFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para upload da foto
	 */
	@Override
	public void obterUrlUploadFoto(ObterUrlUploadFotoInput input) {
		br.com.senior.furb.basico.impl.ObterUrlUploadFotoImpl impl = new br.com.senior.furb.basico.impl.ObterUrlUploadFotoImpl(messengerSupplier, userId, messageSupplier);
		impl.obterUrlUploadFoto(input);
	}
	
	/**
	 * Chamada assíncrona para o método obterUrlUploadFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para upload da foto
	 */
	@Override
	public CompletableFuture<ObterUrlUploadFotoOutput> obterUrlUploadFotoRequest(ObterUrlUploadFotoInput input) {
		br.com.senior.furb.basico.impl.ObterUrlUploadFotoImpl impl = new br.com.senior.furb.basico.impl.ObterUrlUploadFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.obterUrlUploadFotoRequest(input);
	}
	/**
	 * Chamada síncrona para o método gravarFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava a foto que foi upada
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GravarFotoOutput gravarFoto(GravarFotoInput input, long timeout) {
		br.com.senior.furb.basico.impl.GravarFotoImpl impl = new br.com.senior.furb.basico.impl.GravarFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.gravarFoto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método gravarFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava a foto que foi upada
	 */
	@Override
	public void gravarFoto(GravarFotoInput input) {
		br.com.senior.furb.basico.impl.GravarFotoImpl impl = new br.com.senior.furb.basico.impl.GravarFotoImpl(messengerSupplier, userId, messageSupplier);
		impl.gravarFoto(input);
	}
	
	/**
	 * Chamada assíncrona para o método gravarFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava a foto que foi upada
	 */
	@Override
	public CompletableFuture<GravarFotoOutput> gravarFotoRequest(GravarFotoInput input) {
		br.com.senior.furb.basico.impl.GravarFotoImpl impl = new br.com.senior.furb.basico.impl.GravarFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.gravarFotoRequest(input);
	}
	/**
	 * Chamada síncrona para o método obterUrlDownloadFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para download da foto
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ObterUrlDownloadFotoOutput obterUrlDownloadFoto(ObterUrlDownloadFotoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ObterUrlDownloadFotoImpl impl = new br.com.senior.furb.basico.impl.ObterUrlDownloadFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.obterUrlDownloadFoto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método obterUrlDownloadFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para download da foto
	 */
	@Override
	public void obterUrlDownloadFoto(ObterUrlDownloadFotoInput input) {
		br.com.senior.furb.basico.impl.ObterUrlDownloadFotoImpl impl = new br.com.senior.furb.basico.impl.ObterUrlDownloadFotoImpl(messengerSupplier, userId, messageSupplier);
		impl.obterUrlDownloadFoto(input);
	}
	
	/**
	 * Chamada assíncrona para o método obterUrlDownloadFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para download da foto
	 */
	@Override
	public CompletableFuture<ObterUrlDownloadFotoOutput> obterUrlDownloadFotoRequest(ObterUrlDownloadFotoInput input) {
		br.com.senior.furb.basico.impl.ObterUrlDownloadFotoImpl impl = new br.com.senior.furb.basico.impl.ObterUrlDownloadFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.obterUrlDownloadFotoRequest(input);
	}
	/**
	 * Chamada síncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetMetadataOutput getMetadata(GetMetadataInput input, long timeout) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadata(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public void getMetadata(GetMetadataInput input) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		impl.getMetadata(input);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadataRequest(input);
	}
	/**
	 * Chamada síncrona para o método importGenero
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportGeneroOutput importGenero(ImportGeneroInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportGeneroImpl impl = new br.com.senior.furb.basico.impl.ImportGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.importGenero(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importGenero
	 * This is a public operation
	 * 
	 */
	@Override
	public void importGenero(ImportGeneroInput input) {
		br.com.senior.furb.basico.impl.ImportGeneroImpl impl = new br.com.senior.furb.basico.impl.ImportGeneroImpl(messengerSupplier, userId, messageSupplier);
		impl.importGenero(input);
	}
	
	/**
	 * Chamada assíncrona para o método importGenero
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportGeneroOutput> importGeneroRequest(ImportGeneroInput input) {
		br.com.senior.furb.basico.impl.ImportGeneroImpl impl = new br.com.senior.furb.basico.impl.ImportGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.importGeneroRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportGenero
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportGeneroOutput exportGenero(ExportGeneroInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportGeneroImpl impl = new br.com.senior.furb.basico.impl.ExportGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportGenero(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportGenero
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportGenero(ExportGeneroInput input) {
		br.com.senior.furb.basico.impl.ExportGeneroImpl impl = new br.com.senior.furb.basico.impl.ExportGeneroImpl(messengerSupplier, userId, messageSupplier);
		impl.exportGenero(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportGenero
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportGeneroOutput> exportGeneroRequest(ExportGeneroInput input) {
		br.com.senior.furb.basico.impl.ExportGeneroImpl impl = new br.com.senior.furb.basico.impl.ExportGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportGeneroRequest(input);
	}
	/**
	 * Chamada síncrona para o método importDiretor
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportDiretorOutput importDiretor(ImportDiretorInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportDiretorImpl impl = new br.com.senior.furb.basico.impl.ImportDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.importDiretor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importDiretor
	 * This is a public operation
	 * 
	 */
	@Override
	public void importDiretor(ImportDiretorInput input) {
		br.com.senior.furb.basico.impl.ImportDiretorImpl impl = new br.com.senior.furb.basico.impl.ImportDiretorImpl(messengerSupplier, userId, messageSupplier);
		impl.importDiretor(input);
	}
	
	/**
	 * Chamada assíncrona para o método importDiretor
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportDiretorOutput> importDiretorRequest(ImportDiretorInput input) {
		br.com.senior.furb.basico.impl.ImportDiretorImpl impl = new br.com.senior.furb.basico.impl.ImportDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.importDiretorRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportDiretor
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportDiretorOutput exportDiretor(ExportDiretorInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportDiretorImpl impl = new br.com.senior.furb.basico.impl.ExportDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportDiretor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportDiretor
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportDiretor(ExportDiretorInput input) {
		br.com.senior.furb.basico.impl.ExportDiretorImpl impl = new br.com.senior.furb.basico.impl.ExportDiretorImpl(messengerSupplier, userId, messageSupplier);
		impl.exportDiretor(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportDiretor
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportDiretorOutput> exportDiretorRequest(ExportDiretorInput input) {
		br.com.senior.furb.basico.impl.ExportDiretorImpl impl = new br.com.senior.furb.basico.impl.ExportDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportDiretorRequest(input);
	}
	/**
	 * Chamada síncrona para o método importFilme
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportFilmeOutput importFilme(ImportFilmeInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportFilmeImpl impl = new br.com.senior.furb.basico.impl.ImportFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.importFilme(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importFilme
	 * This is a public operation
	 * 
	 */
	@Override
	public void importFilme(ImportFilmeInput input) {
		br.com.senior.furb.basico.impl.ImportFilmeImpl impl = new br.com.senior.furb.basico.impl.ImportFilmeImpl(messengerSupplier, userId, messageSupplier);
		impl.importFilme(input);
	}
	
	/**
	 * Chamada assíncrona para o método importFilme
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportFilmeOutput> importFilmeRequest(ImportFilmeInput input) {
		br.com.senior.furb.basico.impl.ImportFilmeImpl impl = new br.com.senior.furb.basico.impl.ImportFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.importFilmeRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportFilme
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportFilmeOutput exportFilme(ExportFilmeInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportFilmeImpl impl = new br.com.senior.furb.basico.impl.ExportFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportFilme(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportFilme
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportFilme(ExportFilmeInput input) {
		br.com.senior.furb.basico.impl.ExportFilmeImpl impl = new br.com.senior.furb.basico.impl.ExportFilmeImpl(messengerSupplier, userId, messageSupplier);
		impl.exportFilme(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportFilme
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportFilmeOutput> exportFilmeRequest(ExportFilmeInput input) {
		br.com.senior.furb.basico.impl.ExportFilmeImpl impl = new br.com.senior.furb.basico.impl.ExportFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportFilmeRequest(input);
	}
	/**
	 * Chamada síncrona para o método importAtor
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportAtorOutput importAtor(ImportAtorInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportAtorImpl impl = new br.com.senior.furb.basico.impl.ImportAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.importAtor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importAtor
	 * This is a public operation
	 * 
	 */
	@Override
	public void importAtor(ImportAtorInput input) {
		br.com.senior.furb.basico.impl.ImportAtorImpl impl = new br.com.senior.furb.basico.impl.ImportAtorImpl(messengerSupplier, userId, messageSupplier);
		impl.importAtor(input);
	}
	
	/**
	 * Chamada assíncrona para o método importAtor
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportAtorOutput> importAtorRequest(ImportAtorInput input) {
		br.com.senior.furb.basico.impl.ImportAtorImpl impl = new br.com.senior.furb.basico.impl.ImportAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.importAtorRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportAtor
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportAtorOutput exportAtor(ExportAtorInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportAtorImpl impl = new br.com.senior.furb.basico.impl.ExportAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportAtor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportAtor
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportAtor(ExportAtorInput input) {
		br.com.senior.furb.basico.impl.ExportAtorImpl impl = new br.com.senior.furb.basico.impl.ExportAtorImpl(messengerSupplier, userId, messageSupplier);
		impl.exportAtor(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportAtor
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportAtorOutput> exportAtorRequest(ExportAtorInput input) {
		br.com.senior.furb.basico.impl.ExportAtorImpl impl = new br.com.senior.furb.basico.impl.ExportAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportAtorRequest(input);
	}
	/**
	 * Chamada síncrona para o método listGenero
	 * This is a public operation
	 * The 'list' request primitive for the Genero entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Genero.PagedResults listGenero(Genero.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListGeneroImpl impl = new br.com.senior.furb.basico.impl.ListGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.listGenero(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listGenero
	 * This is a public operation
	 * The 'list' request primitive for the Genero entity.
	 */
	@Override
	public void listGenero(Genero.PageRequest input) {
		br.com.senior.furb.basico.impl.ListGeneroImpl impl = new br.com.senior.furb.basico.impl.ListGeneroImpl(messengerSupplier, userId, messageSupplier);
		impl.listGenero(input);
	}
	
	/**
	 * Chamada assíncrona para o método listGenero
	 * This is a public operation
	 * The 'list' request primitive for the Genero entity.
	 */
	@Override
	public CompletableFuture<Genero.PagedResults> listGeneroRequest(Genero.PageRequest input) {
		br.com.senior.furb.basico.impl.ListGeneroImpl impl = new br.com.senior.furb.basico.impl.ListGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.listGeneroRequest(input);
	}
	/**
	 * Chamada síncrona para o método listDiretor
	 * This is a public operation
	 * The 'list' request primitive for the Diretor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Diretor.PagedResults listDiretor(Diretor.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListDiretorImpl impl = new br.com.senior.furb.basico.impl.ListDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.listDiretor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listDiretor
	 * This is a public operation
	 * The 'list' request primitive for the Diretor entity.
	 */
	@Override
	public void listDiretor(Diretor.PageRequest input) {
		br.com.senior.furb.basico.impl.ListDiretorImpl impl = new br.com.senior.furb.basico.impl.ListDiretorImpl(messengerSupplier, userId, messageSupplier);
		impl.listDiretor(input);
	}
	
	/**
	 * Chamada assíncrona para o método listDiretor
	 * This is a public operation
	 * The 'list' request primitive for the Diretor entity.
	 */
	@Override
	public CompletableFuture<Diretor.PagedResults> listDiretorRequest(Diretor.PageRequest input) {
		br.com.senior.furb.basico.impl.ListDiretorImpl impl = new br.com.senior.furb.basico.impl.ListDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.listDiretorRequest(input);
	}
	/**
	 * Chamada síncrona para o método listFilme
	 * This is a public operation
	 * The 'list' request primitive for the Filme entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Filme.PagedResults listFilme(Filme.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListFilmeImpl impl = new br.com.senior.furb.basico.impl.ListFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.listFilme(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listFilme
	 * This is a public operation
	 * The 'list' request primitive for the Filme entity.
	 */
	@Override
	public void listFilme(Filme.PageRequest input) {
		br.com.senior.furb.basico.impl.ListFilmeImpl impl = new br.com.senior.furb.basico.impl.ListFilmeImpl(messengerSupplier, userId, messageSupplier);
		impl.listFilme(input);
	}
	
	/**
	 * Chamada assíncrona para o método listFilme
	 * This is a public operation
	 * The 'list' request primitive for the Filme entity.
	 */
	@Override
	public CompletableFuture<Filme.PagedResults> listFilmeRequest(Filme.PageRequest input) {
		br.com.senior.furb.basico.impl.ListFilmeImpl impl = new br.com.senior.furb.basico.impl.ListFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.listFilmeRequest(input);
	}
	/**
	 * Chamada síncrona para o método listAtor
	 * This is a public operation
	 * The 'list' request primitive for the Ator entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ator.PagedResults listAtor(Ator.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListAtorImpl impl = new br.com.senior.furb.basico.impl.ListAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAtor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listAtor
	 * This is a public operation
	 * The 'list' request primitive for the Ator entity.
	 */
	@Override
	public void listAtor(Ator.PageRequest input) {
		br.com.senior.furb.basico.impl.ListAtorImpl impl = new br.com.senior.furb.basico.impl.ListAtorImpl(messengerSupplier, userId, messageSupplier);
		impl.listAtor(input);
	}
	
	/**
	 * Chamada assíncrona para o método listAtor
	 * This is a public operation
	 * The 'list' request primitive for the Ator entity.
	 */
	@Override
	public CompletableFuture<Ator.PagedResults> listAtorRequest(Ator.PageRequest input) {
		br.com.senior.furb.basico.impl.ListAtorImpl impl = new br.com.senior.furb.basico.impl.ListAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAtorRequest(input);
	}
	/**
	 * Chamada síncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetDependenciesOutput getDependencies(long timeout) {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependencies(timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public void getDependencies() {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		impl.getDependencies();
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest() {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependenciesRequest();
	}
	/**
	 * Chamada síncrona para o método createGenero
	 * This is a public operation
	 * The 'create' request primitive for the Genero entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Genero createGenero(Genero input, long timeout) {
		br.com.senior.furb.basico.impl.CreateGeneroImpl impl = new br.com.senior.furb.basico.impl.CreateGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.createGenero(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createGenero
	 * This is a public operation
	 * The 'create' request primitive for the Genero entity.
	 */
	@Override
	public void createGenero(Genero input) {
		br.com.senior.furb.basico.impl.CreateGeneroImpl impl = new br.com.senior.furb.basico.impl.CreateGeneroImpl(messengerSupplier, userId, messageSupplier);
		impl.createGenero(input);
	}
	
	/**
	 * Chamada assíncrona para o método createGenero
	 * This is a public operation
	 * The 'create' request primitive for the Genero entity.
	 */
	@Override
	public CompletableFuture<Genero> createGeneroRequest(Genero input) {
		br.com.senior.furb.basico.impl.CreateGeneroImpl impl = new br.com.senior.furb.basico.impl.CreateGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.createGeneroRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkGenero
	 * This is a public operation
	 * The 'createBulk' request primitive for the Genero entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkGeneroOutput createBulkGenero(CreateBulkGeneroInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkGeneroImpl impl = new br.com.senior.furb.basico.impl.CreateBulkGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkGenero(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkGenero
	 * This is a public operation
	 * The 'createBulk' request primitive for the Genero entity.
	 */
	@Override
	public void createBulkGenero(CreateBulkGeneroInput input) {
		br.com.senior.furb.basico.impl.CreateBulkGeneroImpl impl = new br.com.senior.furb.basico.impl.CreateBulkGeneroImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkGenero(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkGenero
	 * This is a public operation
	 * The 'createBulk' request primitive for the Genero entity.
	 */
	@Override
	public CompletableFuture<CreateBulkGeneroOutput> createBulkGeneroRequest(CreateBulkGeneroInput input) {
		br.com.senior.furb.basico.impl.CreateBulkGeneroImpl impl = new br.com.senior.furb.basico.impl.CreateBulkGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkGeneroRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeGenero
	 * This is a public operation
	 * The 'createMerge' request primitive for the Genero entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Genero createMergeGenero(Genero input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeGeneroImpl impl = new br.com.senior.furb.basico.impl.CreateMergeGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeGenero(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeGenero
	 * This is a public operation
	 * The 'createMerge' request primitive for the Genero entity.
	 */
	@Override
	public void createMergeGenero(Genero input) {
		br.com.senior.furb.basico.impl.CreateMergeGeneroImpl impl = new br.com.senior.furb.basico.impl.CreateMergeGeneroImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeGenero(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeGenero
	 * This is a public operation
	 * The 'createMerge' request primitive for the Genero entity.
	 */
	@Override
	public CompletableFuture<Genero> createMergeGeneroRequest(Genero input) {
		br.com.senior.furb.basico.impl.CreateMergeGeneroImpl impl = new br.com.senior.furb.basico.impl.CreateMergeGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeGeneroRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveGenero
	 * This is a public operation
	 * The 'retrieve' request primitive for the Genero entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Genero retrieveGenero(Genero.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveGeneroImpl impl = new br.com.senior.furb.basico.impl.RetrieveGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveGenero(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveGenero
	 * This is a public operation
	 * The 'retrieve' request primitive for the Genero entity.
	 */
	@Override
	public void retrieveGenero(Genero.Id input) {
		br.com.senior.furb.basico.impl.RetrieveGeneroImpl impl = new br.com.senior.furb.basico.impl.RetrieveGeneroImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveGenero(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveGenero
	 * This is a public operation
	 * The 'retrieve' request primitive for the Genero entity.
	 */
	@Override
	public CompletableFuture<Genero> retrieveGeneroRequest(Genero.Id input) {
		br.com.senior.furb.basico.impl.RetrieveGeneroImpl impl = new br.com.senior.furb.basico.impl.RetrieveGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveGeneroRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateGenero
	 * This is a public operation
	 * The 'update' request primitive for the Genero entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Genero updateGenero(Genero input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateGeneroImpl impl = new br.com.senior.furb.basico.impl.UpdateGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateGenero(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateGenero
	 * This is a public operation
	 * The 'update' request primitive for the Genero entity.
	 */
	@Override
	public void updateGenero(Genero input) {
		br.com.senior.furb.basico.impl.UpdateGeneroImpl impl = new br.com.senior.furb.basico.impl.UpdateGeneroImpl(messengerSupplier, userId, messageSupplier);
		impl.updateGenero(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateGenero
	 * This is a public operation
	 * The 'update' request primitive for the Genero entity.
	 */
	@Override
	public CompletableFuture<Genero> updateGeneroRequest(Genero input) {
		br.com.senior.furb.basico.impl.UpdateGeneroImpl impl = new br.com.senior.furb.basico.impl.UpdateGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateGeneroRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeGenero
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Genero entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Genero updateMergeGenero(Genero input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeGeneroImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeGenero(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeGenero
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Genero entity.
	 */
	@Override
	public void updateMergeGenero(Genero input) {
		br.com.senior.furb.basico.impl.UpdateMergeGeneroImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeGeneroImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeGenero(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeGenero
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Genero entity.
	 */
	@Override
	public CompletableFuture<Genero> updateMergeGeneroRequest(Genero input) {
		br.com.senior.furb.basico.impl.UpdateMergeGeneroImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeGeneroImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeGeneroRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteGenero
	 * This is a public operation
	 * The 'delete' request primitive for the Genero entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteGenero(Genero.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteGeneroImpl impl = new br.com.senior.furb.basico.impl.DeleteGeneroImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteGenero(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteGenero
	 * This is a public operation
	 * The 'delete' request primitive for the Genero entity.
	 */
	@Override
	public void deleteGenero(Genero.Id input) {
		br.com.senior.furb.basico.impl.DeleteGeneroImpl impl = new br.com.senior.furb.basico.impl.DeleteGeneroImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteGenero(input);
	}
	
	/**
	 * Chamada síncrona para o método createDiretor
	 * This is a public operation
	 * The 'create' request primitive for the Diretor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Diretor createDiretor(Diretor input, long timeout) {
		br.com.senior.furb.basico.impl.CreateDiretorImpl impl = new br.com.senior.furb.basico.impl.CreateDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createDiretor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createDiretor
	 * This is a public operation
	 * The 'create' request primitive for the Diretor entity.
	 */
	@Override
	public void createDiretor(Diretor input) {
		br.com.senior.furb.basico.impl.CreateDiretorImpl impl = new br.com.senior.furb.basico.impl.CreateDiretorImpl(messengerSupplier, userId, messageSupplier);
		impl.createDiretor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createDiretor
	 * This is a public operation
	 * The 'create' request primitive for the Diretor entity.
	 */
	@Override
	public CompletableFuture<Diretor> createDiretorRequest(Diretor input) {
		br.com.senior.furb.basico.impl.CreateDiretorImpl impl = new br.com.senior.furb.basico.impl.CreateDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createDiretorRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkDiretor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Diretor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkDiretorOutput createBulkDiretor(CreateBulkDiretorInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkDiretorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkDiretor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkDiretor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Diretor entity.
	 */
	@Override
	public void createBulkDiretor(CreateBulkDiretorInput input) {
		br.com.senior.furb.basico.impl.CreateBulkDiretorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkDiretorImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkDiretor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkDiretor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Diretor entity.
	 */
	@Override
	public CompletableFuture<CreateBulkDiretorOutput> createBulkDiretorRequest(CreateBulkDiretorInput input) {
		br.com.senior.furb.basico.impl.CreateBulkDiretorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkDiretorRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeDiretor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Diretor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Diretor createMergeDiretor(Diretor input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeDiretorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeDiretor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeDiretor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Diretor entity.
	 */
	@Override
	public void createMergeDiretor(Diretor input) {
		br.com.senior.furb.basico.impl.CreateMergeDiretorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeDiretorImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeDiretor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeDiretor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Diretor entity.
	 */
	@Override
	public CompletableFuture<Diretor> createMergeDiretorRequest(Diretor input) {
		br.com.senior.furb.basico.impl.CreateMergeDiretorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeDiretorRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveDiretor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Diretor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Diretor retrieveDiretor(Diretor.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveDiretorImpl impl = new br.com.senior.furb.basico.impl.RetrieveDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveDiretor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveDiretor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Diretor entity.
	 */
	@Override
	public void retrieveDiretor(Diretor.Id input) {
		br.com.senior.furb.basico.impl.RetrieveDiretorImpl impl = new br.com.senior.furb.basico.impl.RetrieveDiretorImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveDiretor(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveDiretor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Diretor entity.
	 */
	@Override
	public CompletableFuture<Diretor> retrieveDiretorRequest(Diretor.Id input) {
		br.com.senior.furb.basico.impl.RetrieveDiretorImpl impl = new br.com.senior.furb.basico.impl.RetrieveDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveDiretorRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateDiretor
	 * This is a public operation
	 * The 'update' request primitive for the Diretor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Diretor updateDiretor(Diretor input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateDiretorImpl impl = new br.com.senior.furb.basico.impl.UpdateDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateDiretor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateDiretor
	 * This is a public operation
	 * The 'update' request primitive for the Diretor entity.
	 */
	@Override
	public void updateDiretor(Diretor input) {
		br.com.senior.furb.basico.impl.UpdateDiretorImpl impl = new br.com.senior.furb.basico.impl.UpdateDiretorImpl(messengerSupplier, userId, messageSupplier);
		impl.updateDiretor(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateDiretor
	 * This is a public operation
	 * The 'update' request primitive for the Diretor entity.
	 */
	@Override
	public CompletableFuture<Diretor> updateDiretorRequest(Diretor input) {
		br.com.senior.furb.basico.impl.UpdateDiretorImpl impl = new br.com.senior.furb.basico.impl.UpdateDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateDiretorRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeDiretor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Diretor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Diretor updateMergeDiretor(Diretor input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeDiretorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeDiretor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeDiretor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Diretor entity.
	 */
	@Override
	public void updateMergeDiretor(Diretor input) {
		br.com.senior.furb.basico.impl.UpdateMergeDiretorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeDiretorImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeDiretor(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeDiretor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Diretor entity.
	 */
	@Override
	public CompletableFuture<Diretor> updateMergeDiretorRequest(Diretor input) {
		br.com.senior.furb.basico.impl.UpdateMergeDiretorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeDiretorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeDiretorRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteDiretor
	 * This is a public operation
	 * The 'delete' request primitive for the Diretor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteDiretor(Diretor.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteDiretorImpl impl = new br.com.senior.furb.basico.impl.DeleteDiretorImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteDiretor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteDiretor
	 * This is a public operation
	 * The 'delete' request primitive for the Diretor entity.
	 */
	@Override
	public void deleteDiretor(Diretor.Id input) {
		br.com.senior.furb.basico.impl.DeleteDiretorImpl impl = new br.com.senior.furb.basico.impl.DeleteDiretorImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteDiretor(input);
	}
	
	/**
	 * Chamada síncrona para o método createFilme
	 * This is a public operation
	 * The 'create' request primitive for the Filme entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Filme createFilme(Filme input, long timeout) {
		br.com.senior.furb.basico.impl.CreateFilmeImpl impl = new br.com.senior.furb.basico.impl.CreateFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.createFilme(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createFilme
	 * This is a public operation
	 * The 'create' request primitive for the Filme entity.
	 */
	@Override
	public void createFilme(Filme input) {
		br.com.senior.furb.basico.impl.CreateFilmeImpl impl = new br.com.senior.furb.basico.impl.CreateFilmeImpl(messengerSupplier, userId, messageSupplier);
		impl.createFilme(input);
	}
	
	/**
	 * Chamada assíncrona para o método createFilme
	 * This is a public operation
	 * The 'create' request primitive for the Filme entity.
	 */
	@Override
	public CompletableFuture<Filme> createFilmeRequest(Filme input) {
		br.com.senior.furb.basico.impl.CreateFilmeImpl impl = new br.com.senior.furb.basico.impl.CreateFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.createFilmeRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkFilme
	 * This is a public operation
	 * The 'createBulk' request primitive for the Filme entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkFilmeOutput createBulkFilme(CreateBulkFilmeInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkFilmeImpl impl = new br.com.senior.furb.basico.impl.CreateBulkFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkFilme(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkFilme
	 * This is a public operation
	 * The 'createBulk' request primitive for the Filme entity.
	 */
	@Override
	public void createBulkFilme(CreateBulkFilmeInput input) {
		br.com.senior.furb.basico.impl.CreateBulkFilmeImpl impl = new br.com.senior.furb.basico.impl.CreateBulkFilmeImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkFilme(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkFilme
	 * This is a public operation
	 * The 'createBulk' request primitive for the Filme entity.
	 */
	@Override
	public CompletableFuture<CreateBulkFilmeOutput> createBulkFilmeRequest(CreateBulkFilmeInput input) {
		br.com.senior.furb.basico.impl.CreateBulkFilmeImpl impl = new br.com.senior.furb.basico.impl.CreateBulkFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkFilmeRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeFilme
	 * This is a public operation
	 * The 'createMerge' request primitive for the Filme entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Filme createMergeFilme(Filme input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeFilmeImpl impl = new br.com.senior.furb.basico.impl.CreateMergeFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeFilme(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeFilme
	 * This is a public operation
	 * The 'createMerge' request primitive for the Filme entity.
	 */
	@Override
	public void createMergeFilme(Filme input) {
		br.com.senior.furb.basico.impl.CreateMergeFilmeImpl impl = new br.com.senior.furb.basico.impl.CreateMergeFilmeImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeFilme(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeFilme
	 * This is a public operation
	 * The 'createMerge' request primitive for the Filme entity.
	 */
	@Override
	public CompletableFuture<Filme> createMergeFilmeRequest(Filme input) {
		br.com.senior.furb.basico.impl.CreateMergeFilmeImpl impl = new br.com.senior.furb.basico.impl.CreateMergeFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeFilmeRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveFilme
	 * This is a public operation
	 * The 'retrieve' request primitive for the Filme entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Filme retrieveFilme(Filme.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveFilmeImpl impl = new br.com.senior.furb.basico.impl.RetrieveFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveFilme(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveFilme
	 * This is a public operation
	 * The 'retrieve' request primitive for the Filme entity.
	 */
	@Override
	public void retrieveFilme(Filme.Id input) {
		br.com.senior.furb.basico.impl.RetrieveFilmeImpl impl = new br.com.senior.furb.basico.impl.RetrieveFilmeImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveFilme(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveFilme
	 * This is a public operation
	 * The 'retrieve' request primitive for the Filme entity.
	 */
	@Override
	public CompletableFuture<Filme> retrieveFilmeRequest(Filme.Id input) {
		br.com.senior.furb.basico.impl.RetrieveFilmeImpl impl = new br.com.senior.furb.basico.impl.RetrieveFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveFilmeRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateFilme
	 * This is a public operation
	 * The 'update' request primitive for the Filme entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Filme updateFilme(Filme input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateFilmeImpl impl = new br.com.senior.furb.basico.impl.UpdateFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateFilme(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateFilme
	 * This is a public operation
	 * The 'update' request primitive for the Filme entity.
	 */
	@Override
	public void updateFilme(Filme input) {
		br.com.senior.furb.basico.impl.UpdateFilmeImpl impl = new br.com.senior.furb.basico.impl.UpdateFilmeImpl(messengerSupplier, userId, messageSupplier);
		impl.updateFilme(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateFilme
	 * This is a public operation
	 * The 'update' request primitive for the Filme entity.
	 */
	@Override
	public CompletableFuture<Filme> updateFilmeRequest(Filme input) {
		br.com.senior.furb.basico.impl.UpdateFilmeImpl impl = new br.com.senior.furb.basico.impl.UpdateFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateFilmeRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeFilme
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Filme entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Filme updateMergeFilme(Filme input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeFilmeImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeFilme(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeFilme
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Filme entity.
	 */
	@Override
	public void updateMergeFilme(Filme input) {
		br.com.senior.furb.basico.impl.UpdateMergeFilmeImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeFilmeImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeFilme(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeFilme
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Filme entity.
	 */
	@Override
	public CompletableFuture<Filme> updateMergeFilmeRequest(Filme input) {
		br.com.senior.furb.basico.impl.UpdateMergeFilmeImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeFilmeImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeFilmeRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteFilme
	 * This is a public operation
	 * The 'delete' request primitive for the Filme entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteFilme(Filme.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteFilmeImpl impl = new br.com.senior.furb.basico.impl.DeleteFilmeImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteFilme(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteFilme
	 * This is a public operation
	 * The 'delete' request primitive for the Filme entity.
	 */
	@Override
	public void deleteFilme(Filme.Id input) {
		br.com.senior.furb.basico.impl.DeleteFilmeImpl impl = new br.com.senior.furb.basico.impl.DeleteFilmeImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteFilme(input);
	}
	
	/**
	 * Chamada síncrona para o método createAtor
	 * This is a public operation
	 * The 'create' request primitive for the Ator entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ator createAtor(Ator input, long timeout) {
		br.com.senior.furb.basico.impl.CreateAtorImpl impl = new br.com.senior.furb.basico.impl.CreateAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAtor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createAtor
	 * This is a public operation
	 * The 'create' request primitive for the Ator entity.
	 */
	@Override
	public void createAtor(Ator input) {
		br.com.senior.furb.basico.impl.CreateAtorImpl impl = new br.com.senior.furb.basico.impl.CreateAtorImpl(messengerSupplier, userId, messageSupplier);
		impl.createAtor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createAtor
	 * This is a public operation
	 * The 'create' request primitive for the Ator entity.
	 */
	@Override
	public CompletableFuture<Ator> createAtorRequest(Ator input) {
		br.com.senior.furb.basico.impl.CreateAtorImpl impl = new br.com.senior.furb.basico.impl.CreateAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAtorRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkAtor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Ator entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkAtorOutput createBulkAtor(CreateBulkAtorInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkAtorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkAtor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAtor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Ator entity.
	 */
	@Override
	public void createBulkAtor(CreateBulkAtorInput input) {
		br.com.senior.furb.basico.impl.CreateBulkAtorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAtorImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkAtor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAtor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Ator entity.
	 */
	@Override
	public CompletableFuture<CreateBulkAtorOutput> createBulkAtorRequest(CreateBulkAtorInput input) {
		br.com.senior.furb.basico.impl.CreateBulkAtorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkAtorRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeAtor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Ator entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ator createMergeAtor(Ator input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeAtorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAtor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAtor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Ator entity.
	 */
	@Override
	public void createMergeAtor(Ator input) {
		br.com.senior.furb.basico.impl.CreateMergeAtorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAtorImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeAtor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAtor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Ator entity.
	 */
	@Override
	public CompletableFuture<Ator> createMergeAtorRequest(Ator input) {
		br.com.senior.furb.basico.impl.CreateMergeAtorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAtorRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveAtor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Ator entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ator retrieveAtor(Ator.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveAtorImpl impl = new br.com.senior.furb.basico.impl.RetrieveAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAtor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAtor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Ator entity.
	 */
	@Override
	public void retrieveAtor(Ator.Id input) {
		br.com.senior.furb.basico.impl.RetrieveAtorImpl impl = new br.com.senior.furb.basico.impl.RetrieveAtorImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveAtor(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAtor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Ator entity.
	 */
	@Override
	public CompletableFuture<Ator> retrieveAtorRequest(Ator.Id input) {
		br.com.senior.furb.basico.impl.RetrieveAtorImpl impl = new br.com.senior.furb.basico.impl.RetrieveAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAtorRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateAtor
	 * This is a public operation
	 * The 'update' request primitive for the Ator entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ator updateAtor(Ator input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateAtorImpl impl = new br.com.senior.furb.basico.impl.UpdateAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAtor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateAtor
	 * This is a public operation
	 * The 'update' request primitive for the Ator entity.
	 */
	@Override
	public void updateAtor(Ator input) {
		br.com.senior.furb.basico.impl.UpdateAtorImpl impl = new br.com.senior.furb.basico.impl.UpdateAtorImpl(messengerSupplier, userId, messageSupplier);
		impl.updateAtor(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateAtor
	 * This is a public operation
	 * The 'update' request primitive for the Ator entity.
	 */
	@Override
	public CompletableFuture<Ator> updateAtorRequest(Ator input) {
		br.com.senior.furb.basico.impl.UpdateAtorImpl impl = new br.com.senior.furb.basico.impl.UpdateAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAtorRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeAtor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Ator entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ator updateMergeAtor(Ator input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeAtorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAtor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAtor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Ator entity.
	 */
	@Override
	public void updateMergeAtor(Ator input) {
		br.com.senior.furb.basico.impl.UpdateMergeAtorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAtorImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeAtor(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAtor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Ator entity.
	 */
	@Override
	public CompletableFuture<Ator> updateMergeAtorRequest(Ator input) {
		br.com.senior.furb.basico.impl.UpdateMergeAtorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAtorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAtorRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteAtor
	 * This is a public operation
	 * The 'delete' request primitive for the Ator entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteAtor(Ator.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteAtorImpl impl = new br.com.senior.furb.basico.impl.DeleteAtorImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAtor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteAtor
	 * This is a public operation
	 * The 'delete' request primitive for the Ator entity.
	 */
	@Override
	public void deleteAtor(Ator.Id input) {
		br.com.senior.furb.basico.impl.DeleteAtorImpl impl = new br.com.senior.furb.basico.impl.DeleteAtorImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAtor(input);
	}
	


	/**
	* Chamada assíncrona para o método publishServiceStarted
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishServiceStarted( ServiceStartedPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.SERVICE_STARTED, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishNotifyUserEvent( NotifyUserEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.NOTIFY_USER_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportGeneroEvent
	* This is a public operation
	*/
	public void publishImportGeneroEvent( ImportGeneroEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_GENERO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportGeneroEvent
	* This is a public operation
	*/
	public void publishExportGeneroEvent( ExportGeneroEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_GENERO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportDiretorEvent
	* This is a public operation
	*/
	public void publishImportDiretorEvent( ImportDiretorEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_DIRETOR_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportDiretorEvent
	* This is a public operation
	*/
	public void publishExportDiretorEvent( ExportDiretorEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_DIRETOR_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportFilmeEvent
	* This is a public operation
	*/
	public void publishImportFilmeEvent( ImportFilmeEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_FILME_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportFilmeEvent
	* This is a public operation
	*/
	public void publishExportFilmeEvent( ExportFilmeEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_FILME_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportAtorEvent
	* This is a public operation
	*/
	public void publishImportAtorEvent( ImportAtorEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_ATOR_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportAtorEvent
	* This is a public operation
	*/
	public void publishExportAtorEvent( ExportAtorEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_ATOR_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	

	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
