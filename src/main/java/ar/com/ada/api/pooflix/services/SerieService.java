package ar.com.ada.api.pooflix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.pooflix.entities.Serie;
import ar.com.ada.api.pooflix.repositories.SerieRepository;

@Service
public class SerieService {

    @Autowired
    SerieRepository serviceRepository;

    public void grabar(Serie serie) {
        serviceRepository.save(serie);
    }

    public List<Serie> listarSeries() {
        return serviceRepository.findAll();
    }

}