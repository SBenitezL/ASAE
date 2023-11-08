package co.edu.unicauca.validacion_errores_back.core.models;

import java.util.ArrayList;

@Entity
@Entity
@PrimaryKeyJoinColumn(name = "idPersona")
@Getter
@Setter
@NoArgsContructor
public class Docente extends Personas{
    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "vinculacion", nullable = false)
    private String vinculacion;

    @Column(name = "departamento", nullable = false)
    private String departamento;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="Docentes_Publicaciones",
        joinColumns = @JoinColumn(name = "idPersona"),
        InverseJoinColumns = @JoinColumn(name = "idPublicacion"))
    private List<Publicacion> publicaciones;

    @OneToOne(mappedBy = "objDocente")
    private Direccion objDireccion;

    public Docente(int Idpersona,String tipoIdentificacion,
                String numeroIdentificacion,String nombres,
                String apellidos,String correo,String vinculacion,String departamento){
        super(Idpersona,tipoIdentificacion,numeroIdentificacion,nombres,apellidos);
        this.correo = correo;
        this.vinculacion = vinculacion;
        this.departamento = departamento;
        this.publicaciones = new ArrayList<>();
    }

    
}
