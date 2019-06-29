/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkDiretorOutput;

/**
 * Response method for createBulkDiretor
 */
@CommandDescription(name="createBulkDiretorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkDiretorResponse")
public interface CreateBulkDiretorResponse extends MessageHandler {

	void createBulkDiretorResponse(CreateBulkDiretorOutput response);
	
	void createBulkDiretorResponseError(ErrorPayload error);

}
