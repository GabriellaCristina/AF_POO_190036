package com.reservas.apirest.dto;

import java.util.ArrayList;

import com.reservas.apirest.models.Reserva;

  public class VeiculoDTO {
	
	private long id;
	private String Modelo;
	private float Valordiaria;
    private ArrayList<Reserva> reserva = new ArrayList<Reserva>();
	public long getId() {
		return id;
	}
    public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public float getValordiaria() {
		return Valordiaria;
	}
	public void setValordiaria(float valordiaria) {
		Valordiaria = valordiaria;
	}
	public ArrayList<Reserva> getReserva() {
		return reserva;
	}
	public void setReserva(ArrayList<Reserva> reserva) {
		this.reserva = reserva;
	}
	public void setId(long id) {
		this.id = id;
	}

	}

