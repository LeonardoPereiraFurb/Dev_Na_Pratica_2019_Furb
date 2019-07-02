/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportDiretorOutput;

/**
 * Response method for exportDiretor
 */
@CommandDescription(name="exportDiretorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportDiretorResponse")
public interface ExportDiretorResponse extends MessageHandler {

	void exportDiretorResponse(ExportDiretorOutput response);
	
	void exportDiretorResponseError(ErrorPayload error);

}
