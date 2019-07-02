/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Filme entity.
 */
@CommandDescription(name="createMergeFilme", kind=CommandKind.CreateMerge, requestPrimitive="createMergeFilme", responsePrimitive="createMergeFilmeResponse")
public interface CreateMergeFilme extends MessageHandler {
    
    public Filme createMergeFilme(Filme toCreateMerge);
    
}
