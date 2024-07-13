package com.isil.finaldae2.service;



import com.isil.finaldae2.model.Profesor;

import java.util.List;

public interface IProfesorService {

    List<Profesor> findAll();


    Profesor findById(int id);

    Profesor save(Profesor profesor);

    void deleteById(int id);

    void deleteAll();

}
