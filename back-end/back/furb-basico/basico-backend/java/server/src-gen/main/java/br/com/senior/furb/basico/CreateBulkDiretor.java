/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkDiretor", kind = CommandKind.Create, requestPrimitive = "createBulkDiretor", responsePrimitive="")
public interface CreateBulkDiretor extends MessageHandler {
    public CreateBulkDiretorOutput createBulkDiretor(CreateBulkDiretorInput toCreate);
}
