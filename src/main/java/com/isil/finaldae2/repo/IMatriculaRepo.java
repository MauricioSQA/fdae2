package com.isil.finaldae2.repo;

import com.isil.finaldae2.model.Alumno;
import com.isil.finaldae2.model.Curso;
import com.isil.finaldae2.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IMatriculaRepo extends JpaRepository<Matricula, Integer > {
    @Query("SELECT COUNT(m) FROM Matricula m " +
            "JOIN m.alumno a " +
            "JOIN m.curso c " +
            "WHERE a.alumno_id = :alumnoId AND c.curso_id = :cursoId")
    int countByAlumnoAndCurso(@Param("alumnoId") int alumnoId, @Param("cursoId") int cursoId);
}
