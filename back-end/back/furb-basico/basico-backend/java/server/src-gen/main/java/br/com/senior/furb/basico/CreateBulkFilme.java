/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkFilme", kind = CommandKind.Create, requestPrimitive = "createBulkFilme", responsePrimitive="")
public interface CreateBulkFilme extends MessageHandler {
    public CreateBulkFilmeOutput createBulkFilme(CreateBulkFilmeInput toCreate);
}
