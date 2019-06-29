/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Ator entity.
 */
@CommandDescription(name="updateMergeAtor", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeAtor", responsePrimitive="updateMergeAtorResponse")
public interface UpdateMergeAtor extends MessageHandler {
    
    public Ator updateMergeAtor(Ator toUpdateMerge);
    
}
