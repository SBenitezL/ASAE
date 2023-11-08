package co.edu.unicauca.validacion_errores_back.core.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Direcciones")
public class Direccion {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idPersona;
    @Column(nullable = false)
	private String direccionResidencia;
    @Column(nullable = false)	
    private String ciudad;	
    @Column(nullable = false)
	private String pais;	
    
    public Direccion(Integer idPersona, String direccionResidencia, String ciudad, String pais) {
		this.idPersona = idPersona;
		this.direccionResidencia = direccionResidencia;
		this.ciudad = ciudad;
		this.pais = pais;
	}

    @OneToOne
	@JoinColumn(name = "idPersona")
	private Docente objDocente;
	public Integer getidPersona() {
		return idPersona;
	}
	public void setId(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public String getdireccionResidencia() {
		return direccionResidencia;
	}
	public void setdireccionResidencia(String direccionResidencia) {
		this.direccionResidencia = direccionResidencia;
	}
	public String getciudad() {
		return ciudad;
	}
	public void setciudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

}

