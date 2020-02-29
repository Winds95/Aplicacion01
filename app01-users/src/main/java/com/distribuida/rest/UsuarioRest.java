package com.distribuida.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.distribuida.dto.Usuario;
import com.distribuida.servicios.ServicioUsuario;


@Path("/usuarios")
@ApplicationScoped
public class UsuarioRest {
	
	@Inject
	private ServicioUsuario servicio;
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario listarId(@PathParam(value = "id") Integer id) {
		Usuario usuario = servicio.buscarPorId(id);
		return usuario;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> listar() {
		List<Usuario> lista = servicio.listar();
		return lista;
	}

}
