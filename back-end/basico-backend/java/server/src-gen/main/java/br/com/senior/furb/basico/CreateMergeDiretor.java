/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Diretor entity.
 */
@CommandDescription(name="createMergeDiretor", kind=CommandKind.CreateMerge, requestPrimitive="createMergeDiretor", responsePrimitive="createMergeDiretorResponse")
public interface CreateMergeDiretor extends MessageHandler {
    
    public Diretor createMergeDiretor(Diretor toCreateMerge);
    
}
