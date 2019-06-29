/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Genero;

/**
 * Response method for retrieveGenero
 */
@CommandDescription(name="retrieveGeneroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveGeneroResponse")
public interface RetrieveGeneroResponse extends MessageHandler {

	void retrieveGeneroResponse(Genero response);
	
	void retrieveGeneroResponseError(ErrorPayload error);

}
