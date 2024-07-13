package com.isil.finaldae2.serviceImpl;

import com.isil.finaldae2.model.Alumno;
import com.isil.finaldae2.repo.IAlumnoRepo;
import com.isil.finaldae2.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements IAlumnoService {

    @Autowired
    IAlumnoRepo repo;

    @Override
    public List<Alumno> findAll() {
        return repo.findAll();
    }


    @Override
    public Alumno findById(int id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public Alumno save(Alumno alumno) {
        return repo.save(alumno);
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }

    @Override
    public void deleteAll() {

        repo.deleteAll();
    }
}
