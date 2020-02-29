package com.distribuida.servicios;

import java.util.List;

import com.distribuida.dto.Usuario;

public interface ServicioUsuario {

	List<Usuario> listar();

	Usuario buscarPorId(Integer id);

}
