package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;



@Entity
@Access(AccessType.PROPERTY)
public class Encuesta extends DomainEntity{
	
	public Encuesta(){
		super();
	}
	
	private Collection<Pregunta> preguntas;
	
	@OneToMany(mappedBy="encuesta")
	public Collection<Pregunta> getPreguntas() {
		return preguntas;
	}


	public void setPreguntas(Collection<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}


	

}
