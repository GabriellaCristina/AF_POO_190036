package com.reservas.apirest.repository;

import java.util.List;
import java.util.Optional;

import com.reservas.apirest.dto.ClienteDTO;
import com.reservas.apirest.models.Veiculo;

public interface VeiculoRepository {

	Veiculo salvar(Veiculo veiculo, int id);

	List<ClienteDTO> toListDTO(Class<? extends Object> class1);

	Optional<Veiculo> getVeiculoByNumero(long numero);

}
