package com.reservas.apirest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.reservas.apirest.dto.ClienteDTO;
import com.reservas.apirest.models.Cliente;
import com.reservas.apirest.repository.ClienteRepository;

@Service
public class ClienteService {
	 @Autowired
	    private ClienteRepository repositorio;

	    public Cliente getClienteById(int id){
	        Optional<Cliente> op = Optional.of(repositorio.getClienteById(id));
	        return op.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Cliente nao cadastrado: " + id));
	    }



	    public Cliente fromDTO(ClienteDTO dto){
	        Cliente cliente = new Cliente();
	        cliente.setEndereco(dto.getEndereco());
	        cliente.setNome(dto.getNomeCli());
	        return cliente;
	    }



		public ClienteDTO update(Cliente cliente) {
	        getClienteById(cliente.getId());
	        return repositorio.update(cliente);
	    }



		public List<com.reservas.apirest.resources.Cliente> getAllClientes() {
			return repositorio.getAllClientes();
		}



		public com.reservas.apirest.resources.Cliente salvar(Cliente cliente) {
			return repositorio.salvar(cliente);
		}



		public void removeById(int id) {
	       repositorio.removeById(getClienteById(id));
	   }


}
