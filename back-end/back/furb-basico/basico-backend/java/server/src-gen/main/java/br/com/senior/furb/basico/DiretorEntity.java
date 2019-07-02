/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
@Table(name="diretor")
public class DiretorEntity {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/furb/basico/entities/diretor";

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "data_nasc")
	private Long dataNasc;
	
	@Column(name = "descricao")
	private String descricao;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "diretor_filmes",
	          joinColumns = @JoinColumn(name = "diretor_id", referencedColumnName = "id"),
	          inverseJoinColumns = @JoinColumn(name = "filmes_id", referencedColumnName = "id"))
	private java.util.List<FilmeEntity> filmes;
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Long getDataNasc() {
		return dataNasc;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public java.util.List<FilmeEntity> getFilmes() {
		return filmes;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataNasc(Long dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setFilmes(java.util.List<FilmeEntity> filmes) {
		this.filmes = filmes;
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
	    if (!(obj instanceof DiretorEntity)) {
	        return false;
	    }
	    DiretorEntity other = (DiretorEntity) obj;
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
		sb.append("dataNasc=").append(dataNasc == null ? "null" : dataNasc).append(", ");
		sb.append("descricao=").append(descricao == null ? "null" : descricao).append(", ");
		sb.append("filmes=<");
		if (filmes == null) {
			sb.append("null");
		} else {
			sb.append('[');
			Iterator<FilmeEntity> iterator = filmes.iterator();
			while (iterator.hasNext()) {
				iterator.next().toString(sb, appended);
				if (iterator.hasNext()) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
		sb.append(']');
	}
	
}
