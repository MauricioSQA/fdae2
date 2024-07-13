package com.isil.finaldae2.controller;
import com.isil.finaldae2.model.Matricula;
import com.isil.finaldae2.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

    @Autowired
    private IMatriculaService service;

    @GetMapping
    public List<Matricula> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Matricula findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PostMapping
    public Matricula save(@RequestBody Matricula matricula) {
        return service.save(matricula);
    }

    @PutMapping
    public Matricula update(@RequestBody Matricula matricula) {
        return service.save(matricula);
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
