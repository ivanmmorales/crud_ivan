package com.mx.im.domain;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )


    private Long idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
