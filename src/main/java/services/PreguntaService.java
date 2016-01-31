package services;

import java.util.Collection;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import repositories.EncuestaRepository;
import repositories.PreguntaRepository;
import domain.Encuesta;
import domain.Pregunta;
import domain.Propuesta;
import domain.ReferendumRecuento;

@Transactional
@Service
public class PreguntaService {

	// Managed repository

	@Autowired
	private PreguntaRepository preguntaRepository;

	public void save(Pregunta pregunta) {

		preguntaRepository.save(pregunta);
	}

	public Pregunta findOne(Integer id) {

		return preguntaRepository.findOne(id);
	}

	public Collection<Pregunta> findPreguntaByEncuesta(Encuesta encuesta) {
		Collection<Pregunta> result;
		result = preguntaRepository.getPreguntaByEncuestaId(encuesta.getId());
		return result;
	}

}
