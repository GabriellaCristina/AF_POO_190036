package com.reservas.apirest.repository;

import java.util.List;

import com.reservas.apirest.dto.ClienteDTO;
import com.reservas.apirest.resources.Cliente;

public interface ClienteRepository {

	List<Cliente> getAllClientes();

	Cliente getClienteByCodigo(int codigoCli);

	Object fromDTO(Object novoCliente1);

	Cliente salvar(Object fromDTO);


	ClienteDTO update(ClienteDTO cliente);

	com.reservas.apirest.models.Cliente getClienteById(int id);

	List<com.reservas.apirest.models.Cliente> getAllCliente();

	com.reservas.apirest.models.Cliente fromDTO(ClienteDTO clienteDTO);

	void removeById(com.reservas.apirest.models.Cliente cliente);

	ClienteDTO update(com.reservas.apirest.models.Cliente cliente);

}
