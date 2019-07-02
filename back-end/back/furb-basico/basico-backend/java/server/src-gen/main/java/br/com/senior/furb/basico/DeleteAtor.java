/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Ator entity.
 */
@CommandDescription(name="deleteAtor", kind=CommandKind.Delete, requestPrimitive="deleteAtor", responsePrimitive="deleteAtorResponse")
public interface DeleteAtor extends MessageHandler {
    
    public void deleteAtor(Ator.Id id);
    
}
