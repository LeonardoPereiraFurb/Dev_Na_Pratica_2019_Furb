/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Genero entity.
 */
@CommandDescription(name="retrieveGenero", kind=CommandKind.Retrieve, requestPrimitive="retrieveGenero", responsePrimitive="retrieveGeneroResponse")
public interface RetrieveGenero extends MessageHandler {
    
    public Genero retrieveGenero(Genero.Id id);
    
}
