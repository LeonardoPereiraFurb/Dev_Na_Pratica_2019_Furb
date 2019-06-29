package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;

@EntityDescription
public class Filme {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String filmeId) {
            this.id = filmeId;
        }
        
        public String getFilmeId() {
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
    	
        public List<Filme> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Filme> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Filme> contents, Long totalPages, Long totalElements) {
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
    public String descricao;
    public java.util.List<Ator> atores;
    public Diretor diretor;
    public java.util.List<Genero> generos;
    
    public Filme() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Filme(String id, String descricao, java.util.List<Ator> atores, Diretor diretor, java.util.List<Genero> generos) {
        this.id = id;
        this.descricao = descricao;
        this.atores = atores;
        this.diretor = diretor;
        this.generos = generos;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Filme(String descricao) {
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
        if (!(obj instanceof Filme)) {
            return false;
        }
        Filme other = (Filme) obj;
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
    	sb.append("descricao=").append(descricao == null ? "null" : descricao).append(", ");
    	sb.append("atores=<");
    	if (atores == null) {
    		sb.append("null");
    	} else {
    		sb.append('[');
    		int last = atores.size() - 1;
    		for (int i = 0; i <= last; i++) {
    			atores.get(i).toString(sb, appended);
    			if (i < last) {
    				sb.append(", ");
    			}
    		}
    		sb.append(']');
    	}
    	sb.append('>').append(", ");
    	sb.append("diretor=<");
    	if (diretor == null) {
    		sb.append("null");
    	} else {
    		diretor.toString(sb, appended);
    	}
    	sb.append('>').append(", ");
    	sb.append("generos=<");
    	if (generos == null) {
    		sb.append("null");
    	} else {
    		sb.append('[');
    		int last = generos.size() - 1;
    		for (int i = 0; i <= last; i++) {
    			generos.get(i).toString(sb, appended);
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
