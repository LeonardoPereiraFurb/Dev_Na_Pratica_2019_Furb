/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkAtorOutput;

/**
 * Response method for createBulkAtor
 */
@CommandDescription(name="createBulkAtorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkAtorResponse")
public interface CreateBulkAtorResponse extends MessageHandler {

	void createBulkAtorResponse(CreateBulkAtorOutput response);
	
	void createBulkAtorResponseError(ErrorPayload error);

}
