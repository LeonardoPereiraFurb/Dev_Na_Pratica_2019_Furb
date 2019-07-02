/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Filme entity.
 */
@CommandDescription(name="deleteFilme", kind=CommandKind.Delete, requestPrimitive="deleteFilme", responsePrimitive="deleteFilmeResponse")
public interface DeleteFilme extends MessageHandler {
    
    public void deleteFilme(Filme.Id id);
    
}
