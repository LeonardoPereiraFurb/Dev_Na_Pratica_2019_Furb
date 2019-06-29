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
 * Response method for updateMergeDiretor
 */
@CommandDescription(name="updateMergeDiretorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeDiretorResponse")
public interface UpdateMergeDiretorResponse extends MessageHandler {

	void updateMergeDiretorResponse(Diretor response);
	
	void updateMergeDiretorResponseError(ErrorPayload error);

}
