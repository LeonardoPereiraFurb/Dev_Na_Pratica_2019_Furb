/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Ator;

/**
 * Response method for updateAtor
 */
@CommandDescription(name="updateAtorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateAtorResponse")
public interface UpdateAtorResponse extends MessageHandler {

	void updateAtorResponse(Ator response);
	
	void updateAtorResponseError(ErrorPayload error);

}
