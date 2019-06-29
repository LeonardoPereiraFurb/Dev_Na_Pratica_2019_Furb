/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listDiretor
 */
@CommandDescription(name="listDiretorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listDiretorResponse")
public interface ListDiretorResponse extends MessageHandler {

	void listDiretorResponse(Diretor.PagedResults response);
	
	void listDiretorResponseError(ErrorPayload error);

}
