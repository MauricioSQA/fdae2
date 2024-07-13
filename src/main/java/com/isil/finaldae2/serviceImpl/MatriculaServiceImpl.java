package com.isil.finaldae2.serviceImpl;

import com.isil.finaldae2.model.Alumno;
import com.isil.finaldae2.model.Curso;
import com.isil.finaldae2.model.Matricula;
import com.isil.finaldae2.repo.IAlumnoRepo;
import com.isil.finaldae2.repo.ICursoRepo;
import com.isil.finaldae2.repo.IMatriculaRepo;
import com.isil.finaldae2.service.IMatriculaService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    IMatriculaRepo  repo;
   @Autowired
    IAlumnoRepo  repo1;
   @Autowired
    ICursoRepo   repo2;


    @Override
    public List<Matricula> findAll() {
        return repo.findAll();
    }


    @Override
    public Matricula findById(int id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @Override
    public Matricula save(Matricula matricula) {

        int count = repo.countByAlumnoAndCurso(
                matricula.getAlumno().get(0).getAlumno_id(),
                matricula.getCurso().get(0).getCurso_id());

        if (count > 0) {
            throw new RuntimeException("El alumno ya está registrado en este curso");
        }
        return repo.save(matricula);
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
