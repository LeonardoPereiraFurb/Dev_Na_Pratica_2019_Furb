/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Ator entity.
 */
@CommandDescription(name="listAtor", kind=CommandKind.List, requestPrimitive="listAtor", responsePrimitive="listAtorResponse")
public interface ListAtor extends MessageHandler {
    
    public Ator.PagedResults listAtor(Ator.PageRequest pageRequest);
    
}
