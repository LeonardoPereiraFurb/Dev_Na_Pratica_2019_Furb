/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Filme entity.
 */
@CommandDescription(name="retrieveFilme", kind=CommandKind.Retrieve, requestPrimitive="retrieveFilme", responsePrimitive="retrieveFilmeResponse")
public interface RetrieveFilme extends MessageHandler {
    
    public Filme retrieveFilme(Filme.Id id);
    
}
