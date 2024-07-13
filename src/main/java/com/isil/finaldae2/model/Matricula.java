package com.isil.finaldae2.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "Matricula", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"alumno_id", "curso_id"})
})


public class Matricula {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int matricula_id;


        @ManyToMany(fetch = FetchType.LAZY)
        @JoinTable(name = "matricula_alumno",
                joinColumns =  @JoinColumn(name = "matricula_id"),
                inverseJoinColumns = @JoinColumn(name = "alumno_id"),
                uniqueConstraints = @UniqueConstraint(columnNames = {"matricula_id", "alumno_id"}))
        @JsonIgnoreProperties("matricula")
        private List<Alumno> alumno= new ArrayList<>();

        @ManyToMany(fetch = FetchType.LAZY)
        @JoinTable(name = "matricula_curso",
                joinColumns =  @JoinColumn(name = "matricula_id"),
                inverseJoinColumns = @JoinColumn(name = "curso_id"))
        @JsonIgnoreProperties("matricula")
        private List<Curso> curso = new ArrayList<>();
        private Date fecha_inscripcion;

}
