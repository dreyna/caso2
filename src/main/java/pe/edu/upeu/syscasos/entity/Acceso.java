package pe.edu.upeu.syscasos.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="accesos")
public class Acceso {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="titulo", length = 15)
	private String titulo;
	@Column(name="icono", length = 120)
	private String icono;
	@Column(name="url", length = 120)
	private String url;
	@Column(name="estado")
	private char estado;
	
	@ManyToMany
	@JsonIgnore
	@JoinTable(
				name = "acceso_rol", 
				joinColumns = @JoinColumn(name="acceso_id", referencedColumnName = "id"),
				inverseJoinColumns = @JoinColumn(name="rol_id", referencedColumnName = "id")
			)
	private Set<Rol> roles = new HashSet<>();
}
