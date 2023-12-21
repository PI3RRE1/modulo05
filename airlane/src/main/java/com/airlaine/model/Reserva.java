package com.airlaine.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String num_pessoas;
	
	@Column(nullable = false)
	private String numero_assento;
	
	@Column(nullable = false)
	private String destino;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNum_pessoas() {
		return num_pessoas;
	}

	public void setNum_pessoas(String num_pessoas) {
		this.num_pessoas = num_pessoas;
	}

	public String getNumero_assento() {
		return numero_assento;
	}

	public void setNumero_assento(String numero_assento) {
		this.numero_assento = numero_assento;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getCompanhia_aerea() {
		return companhia_aerea;
	}

	public void setCompanhia_aerea(String companhia_aerea) {
		this.companhia_aerea = companhia_aerea;
	}

	public String getAeroporto() {
		return aeroporto;
	}

	public void setAeroporto(String aeroporto) {
		this.aeroporto = aeroporto;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public LocalDate getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(LocalDate dataReserva) {
		this.dataReserva = dataReserva;
	}

	public LocalDate getDataEmbarque() {
		return dataEmbarque;
	}

	public void setDataEmbarque(LocalDate dataEmbarque) {
		this.dataEmbarque = dataEmbarque;
	}

	@Column(nullable = false)
	private String origem;
	
	@Column(nullable = false)
	private String companhia_aerea;
	
	@Column(nullable = false)
	private String aeroporto;
	
	@Column(nullable = false)
	private String preco;
	
	@Column(nullable = false, name = "data_reserva")
	@DateTimeFormat(iso = ISO.DATE, pattern = "dd/MM/yyyy")
	private LocalDate dataReserva;
	
	public Reserva() {
		super();
	}

	public Reserva(String num_pessoas, String numero_assento, String destino, String origem, String companhia_aerea,
			String aeroporto, String preco, LocalDate dataReserva, LocalDate dataEmbarque) {
		super();
		this.num_pessoas = num_pessoas;
		this.numero_assento = numero_assento;
		this.destino = destino;
		this.origem = origem;
		this.companhia_aerea = companhia_aerea;
		this.aeroporto = aeroporto;
		this.preco = preco;
		this.dataReserva = dataReserva;
		this.dataEmbarque = dataEmbarque;
	}

	public Reserva(Long id, String num_pessoas, String numero_assento, String destino, String origem,
			String companhia_aerea, String aeroporto, String preco, LocalDate dataReserva, LocalDate dataEmbarque) {
		super();
		this.id = id;
		this.num_pessoas = num_pessoas;
		this.numero_assento = numero_assento;
		this.destino = destino;
		this.origem = origem;
		this.companhia_aerea = companhia_aerea;
		this.aeroporto = aeroporto;
		this.preco = preco;
		this.dataReserva = dataReserva;
		this.dataEmbarque = dataEmbarque;
	}

	@Column(nullable = false, name = "data_embarque")
	@DateTimeFormat(iso = ISO.DATE, pattern = "dd/MM/yyyy")
	private LocalDate dataEmbarque;

}
