/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Diretor entity.
 */
@CommandDescription(name="createDiretor", kind=CommandKind.Create, requestPrimitive="createDiretor", responsePrimitive="createDiretorResponse")
public interface CreateDiretor extends MessageHandler {
    
    public Diretor createDiretor(Diretor toCreate);
    
}
