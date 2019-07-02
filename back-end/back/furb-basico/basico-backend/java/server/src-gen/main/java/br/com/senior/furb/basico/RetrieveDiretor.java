/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Diretor entity.
 */
@CommandDescription(name="retrieveDiretor", kind=CommandKind.Retrieve, requestPrimitive="retrieveDiretor", responsePrimitive="retrieveDiretorResponse")
public interface RetrieveDiretor extends MessageHandler {
    
    public Diretor retrieveDiretor(Diretor.Id id);
    
}
