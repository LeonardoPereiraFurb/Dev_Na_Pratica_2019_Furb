package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class RetornaEstoqueOutput {
    
    /**
     * Quantidade encontrada
     */
    public Long qtd;
    /**
     * Mensagem de negócio
     */
    public String message;
    
    public RetornaEstoqueOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public RetornaEstoqueOutput(Long qtd, String message) {
        this.qtd = qtd;
        this.message = message;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public RetornaEstoqueOutput(Long qtd) {
        this.qtd = qtd;
    }
    
    public void validate() {
        validate(true);
    }
    
    public void validate(boolean required) {
        validate(null, required);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	BasicoValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = 1;
        if (qtd != null) {
            ret = 31 * ret + qtd.hashCode();
        }
        if (message != null) {
            ret = 31 * ret + message.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetornaEstoqueOutput)) {
            return false;
        }
        RetornaEstoqueOutput other = (RetornaEstoqueOutput) obj;
        if ((qtd == null) != (other.qtd == null)) {
            return false;
        }
        if ((qtd != null) && !qtd.equals(other.qtd)) {
            return false;
        }
        if ((message == null) != (other.message == null)) {
            return false;
        }
        if ((message != null) && !message.equals(other.message)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	toString(sb, new ArrayList<>());
    	return sb.toString();
    }
    
    void toString(StringBuilder sb, List<Object> appended) {
    	sb.append(getClass().getSimpleName()).append(" [");
    	if (appended.contains(this)) {
    		sb.append("<Previously appended object>").append(']');
    		return;
    	}
    	appended.add(this);
    	sb.append("qtd=").append(qtd == null ? "null" : qtd).append(", ");
    	sb.append("message=").append(message == null ? "null" : message);
    	sb.append(']');
    }
    
}
