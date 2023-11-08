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
    @JoinColumn(name = "idTipo", nullable = false)
    private Tipo objTipo;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "area", nullable = false)
    private String area;

    public Publicacion(){

    }
}
