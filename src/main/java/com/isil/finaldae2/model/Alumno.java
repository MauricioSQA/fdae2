package com.isil.finaldae2.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="Alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int alumno_id;
    private String nombres ;
    private String apellidos;
    private String dni ;
    private String telefono ;

}
