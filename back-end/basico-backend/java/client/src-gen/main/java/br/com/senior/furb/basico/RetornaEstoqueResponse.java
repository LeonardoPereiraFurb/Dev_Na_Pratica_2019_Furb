/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.RetornaEstoqueOutput;

/**
 * Response method for retornaEstoque
 */
@CommandDescription(name="retornaEstoqueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retornaEstoqueResponse")
public interface RetornaEstoqueResponse extends MessageHandler {

	void retornaEstoqueResponse(RetornaEstoqueOutput response);
	
	void retornaEstoqueResponseError(ErrorPayload error);

}
