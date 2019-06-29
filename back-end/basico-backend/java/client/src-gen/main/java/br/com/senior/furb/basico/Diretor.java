package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;

@EntityDescription
public class Diretor {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String diretorId) {
            this.id = diretorId;
        }
        
        public String getDiretorId() {
            return id;
        }
        
        public String getId() {
            return id;
        }
        
    	public void normalize(Map<String, Object> headers) {
    		BasicoNormalizer.normalize(this, headers);
    	}
    	
    }
    
    public static class PagedResults {
    	public Long totalPages;
    	public Long totalElements;
    	
        public List<Diretor> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Diretor> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Diretor> contents, Long totalPages, Long totalElements) {
            this.contents = contents;
            this.totalPages = totalPages;
            this.totalElements = totalElements;
        }
    }
    
    public static class PageRequest {
        public Long offset;
        public Long size;
        public boolean translations;
        public String orderBy;
        public String filter;
        public List<String> displayFields;
        public boolean useCustomFilter;
        
        public PageRequest() {
        }
        
        public PageRequest(Long offset, Long size) {
            this(offset, size, null, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy) {
            this(offset, size, orderBy, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy, String filter) {
            this(offset, size, orderBy, filter, null);
       	}
       	
        public PageRequest(Long offset, Long size, String orderBy, String filter, List<String> displayFields) {
            this(offset, size, orderBy, filter, displayFields, false);
       	}
        
        public PageRequest(Long offset, Long size, String orderBy, String filter, List<String> displayFields, boolean useCustomFilter) {
        	this.offset = offset;
        	this.size = size;
        	this.orderBy = orderBy;
        	this.filter = filter;
        	this.displayFields = displayFields;
        	this.useCustomFilter = useCustomFilter;
        }
    }

    @EntityId
    public String id;
    public String nome;
    public Long idade;
    public String descricao;
    public java.util.List<Filme> filmes;
    
    public Diretor() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Diretor(String id, String nome, Long idade, String descricao, java.util.List<Filme> filmes) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.descricao = descricao;
        this.filmes = filmes;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Diretor(String nome, Long idade, String descricao) {
        this.nome = nome;
        this.idade = idade;
        this.descricao = descricao;
    }
    
    public void normalize(Map<String, Object> headers) {
    	BasicoNormalizer.normalize(this, headers);
    }
    
    public void validate() {
    	validate(true);
    }
    
    public void validate(boolean required) {
    	validate(null, true);
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
        if (id != null) {
            ret = 31 * ret + id.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Diretor)) {
            return false;
        }
        Diretor other = (Diretor) obj;
        if ((id == null) != (other.id == null)) {
            return false;
        }
        if ((id != null) && !id.equals(other.id)) {
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
    	sb.append("id=").append(id == null ? "null" : id).append(", ");
    	sb.append("nome=").append(nome == null ? "null" : nome).append(", ");
    	sb.append("idade=").append(idade == null ? "null" : idade).append(", ");
    	sb.append("descricao=").append(descricao == null ? "null" : descricao).append(", ");
    	sb.append("filmes=<");
    	if (filmes == null) {
    		sb.append("null");
    	} else {
    		sb.append('[');
    		int last = filmes.size() - 1;
    		for (int i = 0; i <= last; i++) {
    			filmes.get(i).toString(sb, appended);
    			if (i < last) {
    				sb.append(", ");
    			}
    		}
    		sb.append(']');
    	}
    	sb.append('>');
    	sb.append(']');
    }
    
}
