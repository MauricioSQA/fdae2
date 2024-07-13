package com.isil.finaldae2.service;



import com.isil.finaldae2.model.Curso;

import java.util.List;

public interface ICursoService {
    List<Curso> findAll();

    Curso findById(int id);

    Curso save(Curso curso);

    void deleteById(int id);

    void deleteAll();

}
