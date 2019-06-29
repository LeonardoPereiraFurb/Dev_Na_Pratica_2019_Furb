/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportDiretorOutput;

/**
 * Response method for importDiretor
 */
@CommandDescription(name="importDiretorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importDiretorResponse")
public interface ImportDiretorResponse extends MessageHandler {

	void importDiretorResponse(ImportDiretorOutput response);
	
	void importDiretorResponseError(ErrorPayload error);

}
