package co.edu.unicauca.validacion_errores_back.core.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import co.edu.unicauca.validacion_errores_back.core.models.Publicacion;

@Entity
@PrimaryKeyJoinColumn(name = "idPersona")
@Getter
@Setter
@NoArgsConstructor
public class Docente extends Personas{
    @Column(name = "correo")
    private String correo;
    @Column(name = "vinculacion")
    private String vinculacion;
    @Column(name = "departamento")
    private String departamento;

    public Docente(int Idpersona,String tipoIdentificacion,
                String numeroIdentificacion,String nombres,
                String apellidos,String correo,String vinculacion,String departamento){
        super(Idpersona,tipoIdentificacion,numeroIdentificacion,nombres,apellidos);
        this.correo = correo;
        this.vinculacion = vinculacion;
        this.departamento = departamento;
    }

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
    name = "Docentes_Publicaciones",
    joinColumns = @JoinColumn(name = "idPersona"),
    inverseJoinColumns = @JoinColumn(name = "idPublicacion")
)
    private List<Publicacion> publicaciones;
}
