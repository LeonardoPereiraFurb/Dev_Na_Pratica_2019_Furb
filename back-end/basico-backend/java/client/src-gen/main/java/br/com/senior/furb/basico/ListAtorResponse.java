/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listAtor
 */
@CommandDescription(name="listAtorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listAtorResponse")
public interface ListAtorResponse extends MessageHandler {

	void listAtorResponse(Ator.PagedResults response);
	
	void listAtorResponseError(ErrorPayload error);

}
