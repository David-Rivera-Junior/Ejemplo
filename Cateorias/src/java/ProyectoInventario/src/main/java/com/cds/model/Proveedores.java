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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Proveedores generated by hbm2java
 */
@Entity
@Table(name = "proveedores", catalog = "inventario")
public class Proveedores implements java.io.Serializable {

	private Long idProveedor ;
	private String nombreProveedor;
	private String direccion ;
	private String telefono ;
	private List<Marcas> marcas ;
	
	public Proveedores () {
		
	}
	
	public Proveedores(long idProveedor) {
		super();
		this.idProveedor = idProveedor;
	}

	public Proveedores(Long idProveedor, String nombreProveedor, String direccion, String telefono,
			List<com.cds.model.Marcas> marcas) {
		super();
		this.idProveedor = idProveedor;
		this.nombreProveedor = nombreProveedor;
		this.direccion = direccion;
		this.telefono = telefono;
		this.marcas = marcas;
	}
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "proveedores",  cascade=CascadeType.ALL)

	public List<Marcas> getMarcas() {
		return marcas;
	}

	public void setMarcas(List<Marcas> marcas) {
		this.marcas = marcas;
	}

	@Id
	//@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_proveedor")
	public Long getIdProveedor() {
		return this.idProveedor;
	}

	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}

	@Column(name = "nombre_proveedor")
	public String getNombreProveedor() {
		return this.nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	@Column(name = "direccion")
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "telefono")
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
