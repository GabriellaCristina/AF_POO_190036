package com.reservas.apirest.resources;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.reservas.apirest.dto.ClienteDTO;
import com.reservas.apirest.models.Cliente;
import com.reservas.apirest.models.Veiculo;
import com.reservas.apirest.repository.ClienteRepository;
import com.reservas.apirest.repository.VeiculoRepository;
@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	 private VeiculoRepository veiculoRepository;

	private Object veiculo;

	private ClienteDTO cliente;
	
	    @GetMapping
	    public List<Cliente> getClientes() {
	        return clienteRepository.getAllCliente();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Cliente> getClienteByCodigo(@PathVariable int id) {
	        Cliente c = clienteRepository.getClienteById(id);
	        return ResponseEntity.ok(c);
	    }

	    @PostMapping
	    public ResponseEntity<Void> salvar(@Valid  @RequestBody ClienteDTO novoCliente,
	                                       HttpServletRequest request,
	                                       UriComponentsBuilder builder
	                                     )
	   {

	        Object novoCliente1 = null;
			com.reservas.apirest.resources.Cliente c = clienteRepository.salvar(clienteRepository.fromDTO(novoCliente1));
	        UriComponents uriComponents = builder.path(request.getRequestURI() + "/" + c.getId()).build();
	        return ResponseEntity.created(uriComponents.toUri()).build();
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> remover(@PathVariable Cliente id) {
	        clienteRepository.removeById(id);
	        return ResponseEntity.noContent().build();
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<ClienteDTO> atualizar(@PathVariable int id, @RequestBody ClienteDTO clienteDTO) {
	        
	        cliente = null;
			cliente.setId(id);
	       cliente = clienteRepository.update(cliente);
	        return ResponseEntity.ok(cliente);

	    }

	    @PostMapping("{id}/veiculos")
	    public ResponseEntity<Void> salvar(@PathVariable int id,
	                                       @RequestBody Veiculo veiculo, 
	                                       HttpServletRequest request,
	                                       UriComponentsBuilder builder) {

	        veiculo = veiculoRepository.salvar(veiculo, id);
	        UriComponents uriComponents = builder.path(request.getRequestURI() + "/" + veiculo.getNumero()).build();
	        return ResponseEntity.created(uriComponents.toUri()).build();
	    }


	    @GetMapping("{id}/veiculos")
	    public List<ClienteDTO> getVeiculosCliente(@PathVariable int id) {
	        com.reservas.apirest.resources.Cliente cliente = clienteRepository.getClienteByCodigo(id);
	       
			veiculo = null;
			return veiculoRepository.toListDTO(veiculo.getClass());
	    }

}
