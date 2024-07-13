package com.isil.finaldae2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Profesor")
public class Profesor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int profesor_id;
    private String nombres;
    private String apellidos;
    private String dni;
    private String carrera;

    @ManyToMany(mappedBy = "profesor")
    @JsonIgnoreProperties("profesor")
    private List<Curso> curso;
}
