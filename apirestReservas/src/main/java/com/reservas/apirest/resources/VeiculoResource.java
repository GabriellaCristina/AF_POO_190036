package com.reservas.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservas.apirest.models.Veiculo;
    @RestController
	@RequestMapping(value="/veiculos")
public class VeiculoResource {
	
	public class CursoResource {
		@Autowired
	    private veiculoRepository serv;

	    @GetMapping
	    public List<Veiculo> getAllVeiculos(){
	        return ((veiculoRepository) serv).getAllVeiculos();
	    }
	    
	    @GetMapping("/{numero}")
	    public ResponseEntity<Veiculo> getVeiculoByNumero(@PathVariable long numero) {
	            
		       Veiculo veiculo = serv.getVeiculoByNumero(numero);
	           return ResponseEntity.ok(veiculo);	
	        }
	}
}
