package co.edu.unicauca.validacion_errores_back.core.models;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.OneToOne;
@Entity(name = "docentes")
@PrimaryKeyJoinColumn(name = "idPersona")
@Getter
@Setter
@NoArgsConstructor
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
        inverseJoinColumns = @JoinColumn(name = "idPublicacion"))
    private ArrayList<Publicacion> publicaciones;

    @OneToOne(mappedBy = "objDocente",fetch=FetchType.EAGER)
    private Direccion objDireccion;

    // @OneToOne(cascade = { CascadeType.REMOVE, CascadeType.PERSIST }, mappedBy = "objDocente")
	// private Direccion objDireccion;

    public Docente(int Idpersona,String tipoIdentificacion,
                String numeroIdentificacion,String nombres,
                String apellidos,String correo,String vinculacion,String departamento){
        super(Idpersona,tipoIdentificacion,numeroIdentificacion,nombres,apellidos);
        this.correo = correo;
        this.vinculacion = vinculacion;
        this.departamento = departamento;
        this.publicaciones = new ArrayList<Publicacion>();
    }
}
