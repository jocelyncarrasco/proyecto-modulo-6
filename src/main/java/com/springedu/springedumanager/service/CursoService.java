package com.springedu.springedumanager.service;

import com.springedu.springedumanager.model.Curso;
import com.springedu.springedumanager.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    // Obtener todos los cursos
    public List<Curso> obtenerTodos() {
        return cursoRepository.findAll();
    }

    // Guardar un curso
    public void guardar(Curso curso) {
        cursoRepository.save(curso);
    }

    // Eliminar un curso por id
    public void eliminar(Long id) {
        cursoRepository.deleteById(id);
    }
}