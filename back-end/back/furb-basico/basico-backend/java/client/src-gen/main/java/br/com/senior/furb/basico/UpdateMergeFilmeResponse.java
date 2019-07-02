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
 * Response method for updateMergeFilme
 */
@CommandDescription(name="updateMergeFilmeResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeFilmeResponse")
public interface UpdateMergeFilmeResponse extends MessageHandler {

	void updateMergeFilmeResponse(Filme response);
	
	void updateMergeFilmeResponseError(ErrorPayload error);

}
