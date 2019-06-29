/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Filme;

/**
 * Response method for retrieveFilme
 */
@CommandDescription(name="retrieveFilmeResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveFilmeResponse")
public interface RetrieveFilmeResponse extends MessageHandler {

	void retrieveFilmeResponse(Filme response);
	
	void retrieveFilmeResponseError(ErrorPayload error);

}
