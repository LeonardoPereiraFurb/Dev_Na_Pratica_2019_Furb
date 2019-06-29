/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Genero entity.
 */
@CommandDescription(name="listGenero", kind=CommandKind.List, requestPrimitive="listGenero", responsePrimitive="listGeneroResponse")
public interface ListGenero extends MessageHandler {
    
    public Genero.PagedResults listGenero(Genero.PageRequest pageRequest);
    
}
