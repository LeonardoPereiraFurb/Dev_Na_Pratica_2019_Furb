/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Genero entity.
 */
@CommandDescription(name="updateMergeGenero", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeGenero", responsePrimitive="updateMergeGeneroResponse")
public interface UpdateMergeGenero extends MessageHandler {
    
    public Genero updateMergeGenero(Genero toUpdateMerge);
    
}
