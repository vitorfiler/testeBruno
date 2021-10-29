package com.testeBruno.teste.dto;

public class DocumentoDTO {
	
	private long id;
	private String nome;
	private String tp_atividade;
	private String carga_horaria;
	private String status;
	
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

	public DocumentoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
