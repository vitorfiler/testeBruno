package com.testeBruno.teste.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Documento")
public class Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="tp_atividade")
	private String tp_atividade;
	
	@Column(name="carga_horaria")
	private String carga_horaria;
	
	@Column(name="status")
	private String status;
	
	@Column(name="qtd_horas")
	private String qtd_horas;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTp_atividade() {
		return tp_atividade;
	}
	public void setTp_atividade(String tp_atividade) {
		this.tp_atividade = tp_atividade;
	}
	public String getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(String carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getQtd_horas() {
		return qtd_horas;
	}
	public void setQtd_horas(String qtd_horas) {
		this.qtd_horas = qtd_horas;
	}
	public Documento() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
