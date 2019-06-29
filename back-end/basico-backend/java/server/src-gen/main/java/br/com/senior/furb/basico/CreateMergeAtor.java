/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Ator entity.
 */
@CommandDescription(name="createMergeAtor", kind=CommandKind.CreateMerge, requestPrimitive="createMergeAtor", responsePrimitive="createMergeAtorResponse")
public interface CreateMergeAtor extends MessageHandler {
    
    public Ator createMergeAtor(Ator toCreateMerge);
    
}
