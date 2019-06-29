/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importGenero", kind=CommandKind.Action, requestPrimitive="importGenero", responsePrimitive="importGeneroResponse")
public interface ImportGenero extends MessageHandler {
    
    public ImportGeneroOutput importGenero(ImportGeneroInput request);
    
}
