package com.isil.finaldae2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int curso_id;
    private String nombre;


    @ManyToMany(cascade = { CascadeType.MERGE })
    @JoinTable(name="curso_profesor",
            joinColumns =  @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "profesor_id"))
    @JsonIgnoreProperties("curso")
    private List<Profesor> profesor;

}
