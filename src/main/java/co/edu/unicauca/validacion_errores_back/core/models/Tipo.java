package co.edu.unicauca.validacion_errores_back.core.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

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
    List<publicaciones> publicaciones;


    public Tipo(){

    }

}
