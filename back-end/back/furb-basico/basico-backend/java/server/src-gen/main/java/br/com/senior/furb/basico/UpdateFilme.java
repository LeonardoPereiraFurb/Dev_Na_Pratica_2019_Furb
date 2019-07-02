/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Filme entity.
 */
@CommandDescription(name="updateFilme", kind=CommandKind.Update, requestPrimitive="updateFilme", responsePrimitive="updateFilmeResponse")
public interface UpdateFilme extends MessageHandler {
    
    public Filme updateFilme(Filme toUpdate);
    
}
