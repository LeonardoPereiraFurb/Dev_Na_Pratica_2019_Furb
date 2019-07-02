/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportFilme", kind=CommandKind.Query, requestPrimitive="exportFilme", responsePrimitive="exportFilmeResponse")
public interface ExportFilme extends MessageHandler {
    
    public ExportFilmeOutput exportFilme(ExportFilmeInput request);
    
}
