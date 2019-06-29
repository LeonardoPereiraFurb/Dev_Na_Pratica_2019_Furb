/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Diretor entity.
 */
@CommandDescription(name="updateMergeDiretor", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeDiretor", responsePrimitive="updateMergeDiretorResponse")
public interface UpdateMergeDiretor extends MessageHandler {
    
    public Diretor updateMergeDiretor(Diretor toUpdateMerge);
    
}
