/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportAtor", kind=CommandKind.Query, requestPrimitive="exportAtor", responsePrimitive="exportAtorResponse")
public interface ExportAtor extends MessageHandler {
    
    public ExportAtorOutput exportAtor(ExportAtorInput request);
    
}
