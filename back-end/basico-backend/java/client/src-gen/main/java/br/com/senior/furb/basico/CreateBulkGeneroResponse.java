/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkGeneroOutput;

/**
 * Response method for createBulkGenero
 */
@CommandDescription(name="createBulkGeneroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkGeneroResponse")
public interface CreateBulkGeneroResponse extends MessageHandler {

	void createBulkGeneroResponse(CreateBulkGeneroOutput response);
	
	void createBulkGeneroResponseError(ErrorPayload error);

}
