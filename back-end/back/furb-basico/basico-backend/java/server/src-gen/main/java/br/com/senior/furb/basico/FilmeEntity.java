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
import javax.persistence.ManyToOne;

@Entity
@Table(name="filme")
public class FilmeEntity {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/furb/basico/entities/filme";

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "filme_atores",
	          joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"),
	          inverseJoinColumns = @JoinColumn(name = "atores_id", referencedColumnName = "id"))
	private java.util.List<AtorEntity> atores;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "diretor")
	private DiretorEntity diretor;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "filme_generos",
	          joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"),
	          inverseJoinColumns = @JoinColumn(name = "generos_id", referencedColumnName = "id"))
	private java.util.List<GeneroEntity> generos;
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public java.util.List<AtorEntity> getAtores() {
		return atores;
	}
	
	public DiretorEntity getDiretor() {
		return diretor;
	}
	
	public java.util.List<GeneroEntity> getGeneros() {
		return generos;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setAtores(java.util.List<AtorEntity> atores) {
		this.atores = atores;
	}
	
	public void setDiretor(DiretorEntity diretor) {
		this.diretor = diretor;
	}
	
	public void setGeneros(java.util.List<GeneroEntity> generos) {
		this.generos = generos;
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
	    if (!(obj instanceof FilmeEntity)) {
	        return false;
	    }
	    FilmeEntity other = (FilmeEntity) obj;
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
		sb.append("descricao=").append(descricao == null ? "null" : descricao).append(", ");
		sb.append("atores=<");
		if (atores == null) {
			sb.append("null");
		} else {
			sb.append('[');
			Iterator<AtorEntity> iterator = atores.iterator();
			while (iterator.hasNext()) {
				iterator.next().toString(sb, appended);
				if (iterator.hasNext()) {
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
			Iterator<GeneroEntity> iterator = generos.iterator();
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
