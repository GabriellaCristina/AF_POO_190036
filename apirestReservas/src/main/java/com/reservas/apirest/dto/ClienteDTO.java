package com.reservas.apirest.dto;

import java.util.ArrayList;

import com.reservas.apirest.models.Reserva;

public class ClienteDTO {
	private long id;
	private String NomeCli,endereco,cpf;
	
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	public long getId() {
		return id;
	}
	public String getNomeCli() {
		return NomeCli;
	}
	public void setNomeCli(String nomeCli) {
		NomeCli = nomeCli;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public ArrayList<Reserva> getReservas() {
		return reservas;
	}
	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}
	public void setId(long id) {
		this.id = id;
	}
}
