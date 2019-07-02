/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkFilmeOutput;

/**
 * Response method for createBulkFilme
 */
@CommandDescription(name="createBulkFilmeResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkFilmeResponse")
public interface CreateBulkFilmeResponse extends MessageHandler {

	void createBulkFilmeResponse(CreateBulkFilmeOutput response);
	
	void createBulkFilmeResponseError(ErrorPayload error);

}
