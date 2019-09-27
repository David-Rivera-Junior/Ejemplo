package com.cds.model;
// Generated 07-06-2019 08:35:56 AM by Hibernate Tools 0.0.1-SNAPSHOT

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Marcas generated by hbm2java
 */
@Entity
@Table(name = "marcas", catalog = "inventario")
public class Marcas implements java.io.Serializable {

	private Long idMarca;
	private Proveedores proveedores;
	private String nombreMarca;
	private List<Proveedores> Proveedores;
	private long idProveedor ;
	
	public Marcas() {
		
	}
	
	public Marcas(long idMarca) {
		
	}
	public Marcas(long idMarca, String nombreMarca, Proveedores proveedores) {
		super();
		this.idMarca = idMarca;
		this.nombreMarca = nombreMarca;
		this.proveedores = proveedores;
	}

	public Marcas(Proveedores proveedores, String nombreMarca) {
		this.proveedores = proveedores;
		this.nombreMarca = nombreMarca;
	}
	
	public Marcas(Long idMarca, com.cds.model.Proveedores proveedores, String nombreMarca,
			List<com.cds.model.Proveedores> proveedores2) {
		super();
		this.idMarca = idMarca;
		this.proveedores = proveedores;
		this.nombreMarca = nombreMarca;
		Proveedores = proveedores2;
	}
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "marcas",  cascade=CascadeType.ALL)
	public void setProveedores(List<Proveedores> proveedores) {
		Proveedores = proveedores;
	}
	

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_marca")
	public Long getIdMarca() {
		return this.idMarca;
	}

	public void setIdMarca(Long idMarca) {
		this.idMarca = idMarca;
	}

	@ManyToOne(fetch = FetchType.EAGER,  cascade=CascadeType.ALL)
	@JoinColumn(name = "id_proveedor")
	public Proveedores getProveedores() {
		return this.proveedores;
	}

	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}

	@Column(name = "nombre_marca")
	public String getNombreMarca() {
		return this.nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public void setProveedores(long idProveedor) {
		this.idProveedor = idProveedor;
	}

}