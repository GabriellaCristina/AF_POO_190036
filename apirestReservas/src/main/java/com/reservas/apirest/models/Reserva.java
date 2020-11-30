package com.reservas.apirest.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Reserva {

	private int numero;
	private String nomeCliente;
	private String Veiculo;
	@JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime dataInicio;
    
  
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataFim;


    public Reserva(int numero, String Veiculo, String nomeCliente, LocalDateTime dataInicio,LocalDate dataFim) {
		this.numero = numero;
		this.Veiculo=Veiculo;
		this.nomeCliente= nomeCliente;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		
    }
    
    

	public int getNumero() {
		return numero;
	}



	public void setCodigo(int numero) {
		this.numero = numero;
	}



	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public LocalDateTime getDataInicio() {
		return dataInicio;
	}



	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}



	public LocalDate getDataFim() {
		return dataFim;
	}



	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}



	public float getTotalVeiculo() {
		// TODO Auto-generated method stub
		return 0;
	}



	public String getVeiculo() {
		return Veiculo;
	}



	public void setVeiculo(String veiculo) {
		Veiculo = veiculo;
	}

}
