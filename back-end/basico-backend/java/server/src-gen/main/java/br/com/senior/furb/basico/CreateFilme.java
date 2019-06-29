/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Filme entity.
 */
@CommandDescription(name="createFilme", kind=CommandKind.Create, requestPrimitive="createFilme", responsePrimitive="createFilmeResponse")
public interface CreateFilme extends MessageHandler {
    
    public Filme createFilme(Filme toCreate);
    
}
