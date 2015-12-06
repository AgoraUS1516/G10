package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Access(AccessType.PROPERTY)
public class ReferendumRecuento extends DomainEntity {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private int idVotacionRecuento;
	private int idVotacionModificacion;
	private Collection<Propuesta> propuestas;

	public ReferendumRecuento() {
		super();
	}

	public int getIdVotacionRecuento() {
		return idVotacionRecuento;
	}

	public void setIdVotacionRecuento(int idVotacionRecuento) {
		this.idVotacionRecuento = idVotacionRecuento;
	}

	// Añadida para que al parsear al JSON no se produzca una cadena infinita
	@JsonManagedReference
	@OneToMany(mappedBy = "referendumRecuento")
	public Collection<Propuesta> getPropuestas() {
		return propuestas;
	}

	public void setPropuestas(Collection<Propuesta> propuestas) {
		this.propuestas = propuestas;
	}

	public int getIdVotacionModificacion() {
		return idVotacionModificacion;
	}

	public void setIdVotacionModificacion(int idVotacionModificacion) {
		this.idVotacionModificacion = idVotacionModificacion;
	}
}
