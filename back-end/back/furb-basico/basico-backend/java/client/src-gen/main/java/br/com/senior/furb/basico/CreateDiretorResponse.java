/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Diretor;

/**
 * Response method for createDiretor
 */
@CommandDescription(name="createDiretorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createDiretorResponse")
public interface CreateDiretorResponse extends MessageHandler {

	void createDiretorResponse(Diretor response);
	
	void createDiretorResponseError(ErrorPayload error);

}
