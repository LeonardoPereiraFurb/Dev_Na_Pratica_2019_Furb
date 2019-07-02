/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Ator entity.
 */
@CommandDescription(name="retrieveAtor", kind=CommandKind.Retrieve, requestPrimitive="retrieveAtor", responsePrimitive="retrieveAtorResponse")
public interface RetrieveAtor extends MessageHandler {
    
    public Ator retrieveAtor(Ator.Id id);
    
}
