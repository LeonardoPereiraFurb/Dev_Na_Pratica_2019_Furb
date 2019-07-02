/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Filme entity.
 */
@CommandDescription(name="listFilme", kind=CommandKind.List, requestPrimitive="listFilme", responsePrimitive="listFilmeResponse")
public interface ListFilme extends MessageHandler {
    
    public Filme.PagedResults listFilme(Filme.PageRequest pageRequest);
    
}
