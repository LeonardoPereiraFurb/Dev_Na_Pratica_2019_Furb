/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Genero entity.
 */
@CommandDescription(name="updateGenero", kind=CommandKind.Update, requestPrimitive="updateGenero", responsePrimitive="updateGeneroResponse")
public interface UpdateGenero extends MessageHandler {
    
    public Genero updateGenero(Genero toUpdate);
    
}
