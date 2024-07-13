package com.isil.finaldae2.controller;


import com.isil.finaldae2.model.Profesor;
import com.isil.finaldae2.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {

    @Autowired
    private IProfesorService service;

    @GetMapping
    public List<Profesor> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Profesor findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PostMapping
    public Profesor save(@RequestBody Profesor profesor) {
        return service.save(profesor);
    }

    @PutMapping
    public Profesor update(@RequestBody Profesor profesor) {
        return service.save(profesor);
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
