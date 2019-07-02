/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportAtorOutput;

/**
 * Response method for importAtor
 */
@CommandDescription(name="importAtorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importAtorResponse")
public interface ImportAtorResponse extends MessageHandler {

	void importAtorResponse(ImportAtorOutput response);
	
	void importAtorResponseError(ErrorPayload error);

}
