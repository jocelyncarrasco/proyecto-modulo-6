package com.springedu.springedumanager.service;

import com.springedu.springedumanager.model.Estudiante;
import com.springedu.springedumanager.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    // Obtener todos los estudiantes
    public List<Estudiante> obtenerTodos() {
        return estudianteRepository.findAll();
    }

    // Guardar un estudiante
    public void guardar(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
    }

    // Eliminar un estudiante por id
    public void eliminar(Long id) {
        estudianteRepository.deleteById(id);
    }
}