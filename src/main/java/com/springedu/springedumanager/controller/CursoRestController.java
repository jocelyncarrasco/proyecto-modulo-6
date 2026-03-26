package com.springedu.springedumanager.controller;

import com.springedu.springedumanager.model.Curso;
import com.springedu.springedumanager.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoRestController {

    @Autowired
    private CursoService cursoService;

    // GET todos los cursos
    @GetMapping
    public List<Curso> obtenerTodos() {
        return cursoService.obtenerTodos();
    }

    // POST crear curso
    @PostMapping
    public ResponseEntity<Curso> crear(@RequestBody Curso curso) {
        cursoService.guardar(curso);
        return ResponseEntity.ok(curso);
    }

    // PUT actualizar curso
    @PutMapping("/{id}")
    public ResponseEntity<Curso> actualizar(@PathVariable Long id, 
                                             @RequestBody Curso curso) {
        curso.setId(id);
        cursoService.guardar(curso);
        return ResponseEntity.ok(curso);
    }

    // DELETE eliminar curso
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id) {
        cursoService.eliminar(id);
        return ResponseEntity.ok("Curso eliminado correctamente");
    }
}