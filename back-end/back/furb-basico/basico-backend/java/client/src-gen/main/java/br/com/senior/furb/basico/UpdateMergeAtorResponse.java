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
 * Response method for updateMergeAtor
 */
@CommandDescription(name="updateMergeAtorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeAtorResponse")
public interface UpdateMergeAtorResponse extends MessageHandler {

	void updateMergeAtorResponse(Ator response);
	
	void updateMergeAtorResponseError(ErrorPayload error);

}
