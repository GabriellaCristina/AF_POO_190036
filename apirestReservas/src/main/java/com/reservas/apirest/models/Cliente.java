package com.reservas.apirest.models;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="TB_Cliente")
public class Cliente implements Serializable {
      private static final long serialVersionUID = 1L;
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  	private int id;
 
	    private String nome;
	    @Size(min = 4, max = 200, message = "Endereco do cliente deve ter em 4 e 200 caracteres")
	    private String endereco,cpf;

	    @JsonIgnore
	    private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id =id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
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

	    public void setCpf(String string) {
	        this.cpf = string;
	    }

	    public ArrayList<Veiculo> getVeiculos() {
	        return veiculos;
	    }

	    public void setVeiculos(ArrayList<Veiculo> veiculos) {
	        this.veiculos = veiculos;
	    }

	    public boolean addVeiculo(Veiculo veiculo) {
	        return veiculos.add(veiculo);
	    }

	    public boolean removeVeiculo(Veiculo veiculo) {
	        return veiculos.remove(veiculo);
	    }

	    public double somaTotalVeiculos() {
	        double soma = 0;

	        for (Veiculo veiculo : veiculos) {
	            soma += veiculo.totalVeiculo();
	        }

	        return soma;
	    }

	    public double somaTotalVeiculosReservados() {
	        double soma = 0;

	        for (Veiculo veiculo : veiculos) {
	            if (veiculo.isVeiculoReservado()) {
	                soma += veiculo.totalVeiculo();
	            }
	        }

	        return soma;
	    }

	    @Override
	    public String toString() {
	        return "Cliente [endereco=" + endereco + ", codigo do cliente=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
	    }

	public String getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}
}