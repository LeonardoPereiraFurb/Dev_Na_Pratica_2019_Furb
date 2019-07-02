/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Genero entity.
 */
@CommandDescription(name="createMergeGenero", kind=CommandKind.CreateMerge, requestPrimitive="createMergeGenero", responsePrimitive="createMergeGeneroResponse")
public interface CreateMergeGenero extends MessageHandler {
    
    public Genero createMergeGenero(Genero toCreateMerge);
    
}
