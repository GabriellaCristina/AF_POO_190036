package com.reservas.apirest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.reservas.apirest.models.Veiculo;
@Component
public class veiculoRepository {
	private ArrayList<Veiculo> veiculo = new ArrayList<Veiculo>();
    private static int nextNumero=1;
	private ArrayList<Veiculo> veiculos;
    
    public List<Veiculo> getAllVeiculo(){
        return veiculo;
    }
    
    public static Veiculo salvar(Veiculo veiculo) {
        veiculo.setNumero(nextNumero++);
        veiculo = null;
		veiculo.add(veiculo);
        return veiculo;
	}
	public List<Veiculo> getAllReservas() {
		// TODO Auto-generated method stub
		return null;
	}


	public static List<Veiculo> getAllVeiculos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Veiculo getVeiculoByNumero(long numero) {
		// TODO Auto-generated method stub
		return null;
	}


	}



