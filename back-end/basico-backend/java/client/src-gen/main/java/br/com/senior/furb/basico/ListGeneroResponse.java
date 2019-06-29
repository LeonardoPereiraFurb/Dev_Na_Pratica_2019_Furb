/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listGenero
 */
@CommandDescription(name="listGeneroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listGeneroResponse")
public interface ListGeneroResponse extends MessageHandler {

	void listGeneroResponse(Genero.PagedResults response);
	
	void listGeneroResponseError(ErrorPayload error);

}
