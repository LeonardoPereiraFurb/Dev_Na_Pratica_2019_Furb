/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Filme entity.
 */
@CommandDescription(name="updateMergeFilme", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeFilme", responsePrimitive="updateMergeFilmeResponse")
public interface UpdateMergeFilme extends MessageHandler {
    
    public Filme updateMergeFilme(Filme toUpdateMerge);
    
}
