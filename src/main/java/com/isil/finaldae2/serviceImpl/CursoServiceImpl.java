package com.isil.finaldae2.serviceImpl;

import com.isil.finaldae2.model.Curso;
import com.isil.finaldae2.model.Profesor;
import com.isil.finaldae2.repo.ICursoRepo;
import com.isil.finaldae2.repo.IProfesorRepo;
import com.isil.finaldae2.service.ICursoService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService {

    @Autowired
    ICursoRepo repo;

    @Autowired
    IProfesorRepo repo1;

    @Override
    public List<Curso> findAll() {
        return repo.findAll();
    }

    @Override
    public Curso findById(int id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @Override
    public Curso save(Curso curso) {
        Profesor profesor = repo1.findById(curso.getProfesor().get(0).getProfesor_id())
                .orElseThrow(() -> new EntityNotFoundException("Profesor no encontrado"));

        return repo.save(curso);
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
