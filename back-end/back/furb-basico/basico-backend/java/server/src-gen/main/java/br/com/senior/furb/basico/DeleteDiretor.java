/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Diretor entity.
 */
@CommandDescription(name="deleteDiretor", kind=CommandKind.Delete, requestPrimitive="deleteDiretor", responsePrimitive="deleteDiretorResponse")
public interface DeleteDiretor extends MessageHandler {
    
    public void deleteDiretor(Diretor.Id id);
    
}
