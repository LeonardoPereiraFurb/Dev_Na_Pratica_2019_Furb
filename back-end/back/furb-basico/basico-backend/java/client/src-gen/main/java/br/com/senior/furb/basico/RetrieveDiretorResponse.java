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
 * Response method for retrieveDiretor
 */
@CommandDescription(name="retrieveDiretorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveDiretorResponse")
public interface RetrieveDiretorResponse extends MessageHandler {

	void retrieveDiretorResponse(Diretor response);
	
	void retrieveDiretorResponseError(ErrorPayload error);

}
