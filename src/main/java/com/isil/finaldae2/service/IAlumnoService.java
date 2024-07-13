package com.isil.finaldae2.service;

import com.isil.finaldae2.model.Alumno;

import java.util.List;

public interface IAlumnoService {

    List<Alumno> findAll();

    Alumno findById(int id);

    Alumno save(Alumno alumno);

    void deleteById(int id);

    void deleteAll();

}
