/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Genero entity.
 */
@CommandDescription(name="deleteGenero", kind=CommandKind.Delete, requestPrimitive="deleteGenero", responsePrimitive="deleteGeneroResponse")
public interface DeleteGenero extends MessageHandler {
    
    public void deleteGenero(Genero.Id id);
    
}
