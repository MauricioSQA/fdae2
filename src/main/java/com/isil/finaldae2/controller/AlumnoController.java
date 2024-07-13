package com.isil.finaldae2.controller;

import com.isil.finaldae2.model.Alumno;
import com.isil.finaldae2.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
 @RestController
    @RequestMapping("/api/alumnos")
    public class AlumnoController {

        @Autowired
        private IAlumnoService service;

        @GetMapping
        public List<Alumno> findAll() {
            return service.findAll();
        }

        @GetMapping("/{id}")
        public Alumno findById(@PathVariable("id") int id) {
            return service.findById(id);
        }


        @PostMapping
        public Alumno save(@RequestBody Alumno alumno) {
            return service.save(alumno);
        }

        @PutMapping
        public Alumno update(@RequestBody Alumno alumno) {
            return service.save(alumno);
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

