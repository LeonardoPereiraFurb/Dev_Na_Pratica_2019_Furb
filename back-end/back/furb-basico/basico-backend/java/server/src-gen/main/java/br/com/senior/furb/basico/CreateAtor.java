/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Ator entity.
 */
@CommandDescription(name="createAtor", kind=CommandKind.Create, requestPrimitive="createAtor", responsePrimitive="createAtorResponse")
public interface CreateAtor extends MessageHandler {
    
    public Ator createAtor(Ator toCreate);
    
}
