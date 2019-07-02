/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportGeneroOutput;

/**
 * Response method for exportGenero
 */
@CommandDescription(name="exportGeneroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportGeneroResponse")
public interface ExportGeneroResponse extends MessageHandler {

	void exportGeneroResponse(ExportGeneroOutput response);
	
	void exportGeneroResponseError(ErrorPayload error);

}
