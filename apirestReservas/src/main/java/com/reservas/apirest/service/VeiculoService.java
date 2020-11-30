package com.reservas.apirest.service;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import com.reservas.apirest.dto.VeiculoDTO;
import com.reservas.apirest.models.Veiculo;
import com.reservas.apirest.repository.VeiculoRepository;
import com.reservas.apirest.resources.veiculoRepository;
@Service
public class VeiculoService {
	 @Autowired
	    private VeiculoRepository repositorio;

	    @Autowired
	    private ClienteService clienteService;

	    public Veiculo  getVeiculoByNumero(long numero){
	        Optional<Veiculo> op = repositorio.getVeiculoByNumero(numero);
	        return op.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Veiculo nao cadastrado: " + numero));
	    }

	    public List<Veiculo>  getAllVeiculos(){
	        return veiculoRepository.getAllVeiculos();
	    }

		public Veiculo salvar(int idCliente, Veiculo veiculo) {

	        
	        com.reservas.apirest.models.Cliente cliente = clienteService.getClienteById(idCliente);

	        veiculo.setDataInicio(LocalDateTime.now());
	        veiculo.setCliente(cliente);
	        veiculo.addVeiculo(veiculo);

	        return  veiculoRepository.salvar(veiculo);
	    }

	    public VeiculoDTO toDTO(Veiculo veiculo){
	        
	        VeiculoDTO dto = new VeiculoDTO();
	        dto.setId(veiculo.getId());
	        dto.setModelo(veiculo.getModelo());
	        dto.setValordiaria(veiculo.getValorDiaria());
	        return dto;
	    }

	    public ArrayList<VeiculoDTO> toListDTO(ArrayList<Veiculo> veiculos){

	        ArrayList<VeiculoDTO> dtoList = new ArrayList<VeiculoDTO>();

	       
			for(Veiculo veiculo: veiculos){
	            dtoList.add(toDTO(veiculo));
	        }

	        return dtoList;
	        
	    }

}
