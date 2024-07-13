package com.isil.finaldae2.service;



import com.isil.finaldae2.model.Matricula;

import java.util.List;

public interface IMatriculaService {
    List<Matricula> findAll();


    Matricula findById(int id);

    Matricula save(Matricula matricula);

    void deleteById(int id);

    void deleteAll();

}
