/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * Obtém a quantidade de itens no estoque de acordo com um pedido
 */
@CommandDescription(name="retornaEstoque", kind=CommandKind.Query, requestPrimitive="retornaEstoque", responsePrimitive="retornaEstoqueResponse")
public interface RetornaEstoque extends MessageHandler {
    
    public RetornaEstoqueOutput retornaEstoque(RetornaEstoqueInput request);
    
}
