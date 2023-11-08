package co.edu.unicauca.validacion_errores_back.core.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Tipos")
@Getter
@Setter

public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipo")
    private Integer idTipo;

    @Column(name = "nombre",nullable = false, length = 45)
    private String nombre;

    @OneToMany(mappedBy = "objTipo")
    private List<Publicacion> publicaciones;


    public Tipo(){

    }

}
