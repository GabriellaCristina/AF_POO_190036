package com.reservas.apirest.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.reservas.apirest.models.Cliente;



@Component
public class clienteRepository {
	private List<Cliente> clientes;
    private int nextId;

    @PostConstruct
    public void init() {
        Cliente c1 = new Cliente();
        c1.setId(1);
        c1.setNome("Joao");
        c1.setEndereco("Rua a, 230");
        c1.setCpf("589689452-0");
 
        Cliente c2 = new Cliente();
        c1.setId(2);
        c1.setNome("Ana");
        c1.setEndereco("Rua b, 458");
        c1.setCpf("589623659-0");

        Cliente c3 = new Cliente();
        c1.setId(3);
        c1.setNome("Maria");
        c1.setEndereco("Rua c, 256");
        c1.setCpf("458965247-0");

        clientes = new ArrayList<Cliente>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        nextId = 4;
        
    }

    public List<Cliente> getAllClientes(){
        return clientes;
    }
    
    public Optional<Cliente> getClienteById(long l){
        for (Cliente aux : clientes) {
            if(aux.getId() == l){
                return Optional.of(aux);
            }
        }
        return Optional.empty();
    }

	public Cliente salvar(Cliente cliente) {
        cliente.setId(nextId++);
        clientes.add(cliente);
        return cliente;
	}

	public void remove(Cliente cli) {
        clientes.remove(cli);
	}

	public Cliente update(Cliente cliente) {
        
        Cliente aux = getClienteById(cliente.getId()).get();
        
        if(aux != null){
            aux.setEndereco(cliente.getEndereco());
            aux.setNome(cliente.getNome());
        }

        return aux;

	}
}
