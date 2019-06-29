/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportGenero", kind=CommandKind.Query, requestPrimitive="exportGenero", responsePrimitive="exportGeneroResponse")
public interface ExportGenero extends MessageHandler {
    
    public ExportGeneroOutput exportGenero(ExportGeneroInput request);
    
}
