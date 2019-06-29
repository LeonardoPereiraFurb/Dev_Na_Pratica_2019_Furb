/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkAtor", kind = CommandKind.Create, requestPrimitive = "createBulkAtor", responsePrimitive="")
public interface CreateBulkAtor extends MessageHandler {
    public CreateBulkAtorOutput createBulkAtor(CreateBulkAtorInput toCreate);
}
