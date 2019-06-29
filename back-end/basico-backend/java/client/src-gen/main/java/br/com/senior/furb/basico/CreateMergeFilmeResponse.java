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
 * Response method for createMergeFilme
 */
@CommandDescription(name="createMergeFilmeResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeFilmeResponse")
public interface CreateMergeFilmeResponse extends MessageHandler {

	void createMergeFilmeResponse(Filme response);
	
	void createMergeFilmeResponseError(ErrorPayload error);

}
