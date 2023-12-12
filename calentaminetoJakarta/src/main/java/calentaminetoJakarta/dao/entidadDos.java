package calentaminetoJakarta.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="entidad_dos",schema="ges_alm")
public class entidadDos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_entidad_dos",nullable=false)
	public long id_entidad_dos;
	
	@Column(name="motor",nullable=false)
	public String motor;

	public entidadDos(long id_entidad_uno, String motor) {
		super();
		this.id_entidad_dos = id_entidad_uno;
		this.motor = motor;
	}
	
	public entidadDos() {
		super();
	}

	@Override
	public String toString() {
		return "entidadDos [id_entidad_dos=" + id_entidad_dos + ", motor=" + motor + "]";
	}
	
	
	
}
