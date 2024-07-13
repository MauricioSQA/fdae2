package com.isil.finaldae2.controller;


import com.isil.finaldae2.model.Curso;
import com.isil.finaldae2.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    @Autowired
    private ICursoService service;

    @GetMapping
    public List<Curso> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Curso findById(@PathVariable("id") int id) {
        return service.findById(id);
    }


    @PostMapping
    public Curso save(@RequestBody Curso curso) {
        return service.save(curso);
    }

    @PutMapping
    public Curso update(@RequestBody Curso curso) {
        return service.save(curso);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
        service.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll() {
        service.deleteAll();
    }

}
