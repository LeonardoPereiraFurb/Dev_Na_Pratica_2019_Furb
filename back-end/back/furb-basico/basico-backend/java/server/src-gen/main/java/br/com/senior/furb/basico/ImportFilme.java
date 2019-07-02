/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importFilme", kind=CommandKind.Action, requestPrimitive="importFilme", responsePrimitive="importFilmeResponse")
public interface ImportFilme extends MessageHandler {
    
    public ImportFilmeOutput importFilme(ImportFilmeInput request);
    
}
