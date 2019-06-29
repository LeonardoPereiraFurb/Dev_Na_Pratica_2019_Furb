/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkGenero", kind = CommandKind.Create, requestPrimitive = "createBulkGenero", responsePrimitive="")
public interface CreateBulkGenero extends MessageHandler {
    public CreateBulkGeneroOutput createBulkGenero(CreateBulkGeneroInput toCreate);
}
