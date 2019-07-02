/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Diretor entity.
 */
@CommandDescription(name="listDiretor", kind=CommandKind.List, requestPrimitive="listDiretor", responsePrimitive="listDiretorResponse")
public interface ListDiretor extends MessageHandler {
    
    public Diretor.PagedResults listDiretor(Diretor.PageRequest pageRequest);
    
}
