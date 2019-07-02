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
 * Response method for updateGenero
 */
@CommandDescription(name="updateGeneroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateGeneroResponse")
public interface UpdateGeneroResponse extends MessageHandler {

	void updateGeneroResponse(Genero response);
	
	void updateGeneroResponseError(ErrorPayload error);

}
