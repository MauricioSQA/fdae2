package com.isil.finaldae2.serviceImpl;

import com.isil.finaldae2.model.Profesor;
import com.isil.finaldae2.repo.IProfesorRepo;
import com.isil.finaldae2.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements IProfesorService {

    @Autowired
    IProfesorRepo repo;

    @Override
    public List<Profesor> findAll() {
        return repo.findAll();
    }


    @Override
    public Profesor findById(int id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public Profesor save(Profesor profesor) {
        return repo.save(profesor);
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
