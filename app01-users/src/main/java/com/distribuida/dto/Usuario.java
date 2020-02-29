package com.distribuida.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="usuario")
@NamedQueries({@NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
@NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.id = :id")})
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "userId")
	private Integer userId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "completed")
	private String completed;
	
	private String tipoUsuarioNombre;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompleted() {
		return completed;
	}

	public void setCompleted(String completed) {
		this.completed = completed;
	}

	public String getTipoUsuarioNombre() {
		return tipoUsuarioNombre;
	}

	public void setTipoUsuarioNombre(String tipoUsuarioNombre) {
		this.tipoUsuarioNombre = tipoUsuarioNombre;
	}

	@Override
	public String toString() {
		return "Usuario [userId=" + userId + ", id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}

}
