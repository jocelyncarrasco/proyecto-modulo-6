package com.springedu.springedumanager.controller;

import com.springedu.springedumanager.model.Estudiante;
import com.springedu.springedumanager.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteRestController {

    @Autowired
    private EstudianteService estudianteService;

    // GET todos los estudiantes
    @GetMapping
    public List<Estudiante> obtenerTodos() {
        return estudianteService.obtenerTodos();
    }

    // POST crear estudiante
    @PostMapping
    public ResponseEntity<Estudiante> crear(@RequestBody Estudiante estudiante) {
        estudianteService.guardar(estudiante);
        return ResponseEntity.ok(estudiante);
    }

    // DELETE eliminar estudiante
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id) {
        estudianteService.eliminar(id);
        return ResponseEntity.ok("Estudiante eliminado correctamente");
    }
}