/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Ator entity.
 */
@CommandDescription(name="updateAtor", kind=CommandKind.Update, requestPrimitive="updateAtor", responsePrimitive="updateAtorResponse")
public interface UpdateAtor extends MessageHandler {
    
    public Ator updateAtor(Ator toUpdate);
    
}
