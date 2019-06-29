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
 * Response method for updateMergeGenero
 */
@CommandDescription(name="updateMergeGeneroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeGeneroResponse")
public interface UpdateMergeGeneroResponse extends MessageHandler {

	void updateMergeGeneroResponse(Genero response);
	
	void updateMergeGeneroResponseError(ErrorPayload error);

}
