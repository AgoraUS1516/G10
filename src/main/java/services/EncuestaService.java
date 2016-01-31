package services;

import java.util.Collection;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import repositories.EncuestaRepository;
import domain.Encuesta;
import domain.Propuesta;
import domain.ReferendumRecuento;

@Transactional
@Service
public class EncuestaService {

	// Managed repository

	@Autowired
	private EncuestaRepository encuestaRepository;

	public void save(Encuesta encuesta) {

		encuestaRepository.save(encuesta);
	}

	public Encuesta findOne(Integer id) {

		return encuestaRepository.findOne(id);
	}

	public Collection<Encuesta> findAll() {
		Collection<Encuesta> result;
		result = encuestaRepository.findAll();
		return result;
	}

}
