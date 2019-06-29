/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportGeneroOutput;

/**
 * Response method for importGenero
 */
@CommandDescription(name="importGeneroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importGeneroResponse")
public interface ImportGeneroResponse extends MessageHandler {

	void importGeneroResponse(ImportGeneroOutput response);
	
	void importGeneroResponseError(ErrorPayload error);

}
