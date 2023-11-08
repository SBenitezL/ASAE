package co.edu.unicauca.validacion_errores_back.core.models;

import javax.annotation.processing.Generated;

@Entity(name = "publicaciones")
@Data
@AllArgsConstructor
public class Publicacion {
    @Id
    @GeneratedVaue(strategy = GenerationType.IDENTITY)
    @Column("idPublicacion")
    private int idPublicacion;

    @ManyToOne
    @JoinColumn(name = "idTipo")
    private Tipo objTipo;

    @Column("titulo")
    private String titulo;

    @Column("area")
    private String area;

    public Publicacion(){

    }
}
