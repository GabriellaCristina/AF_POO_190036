package com.reservas.apirest.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TB_Cliente")
public class Veiculo implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codigo;
 

	private String modelo;
    private float valorDiaria;

    private ArrayList<Reserva> veiculos = new ArrayList<Reserva>();

    public Veiculo() {

    }

    public Veiculo(long codigo) {
        this.codigo = codigo;
    }
    
    public float getValorDiaria() {
		return valorDiaria;
	}


	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public ArrayList<Reserva> getVeiculos() {
		return veiculos;
	}



	public void setVeiculos(ArrayList<Reserva> veiculos) {
		this.veiculos = veiculos;
	}
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

	public double totalVeiculo() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isVeiculoReservado() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getNumero() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNumero(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setDataInicio(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}

	public void setCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	public void addVeiculo(Veiculo veiculo) {
		// TODO Auto-generated method stub
		
	}

	public Object getDataInicio() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void add(Veiculo veiculo) {
		// TODO Auto-generated method stub
		
	}




}