package com.testeBruno.teste.service;

import org.springframework.stereotype.Service;

import com.testeBruno.teste.dto.DocumentoDTO;
import com.testeBruno.teste.model.Documento;

@Service
public interface DocumentoService {
	
	public DocumentoDTO salvar(DocumentoDTO documento);
	
	public DocumentoDTO update(DocumentoDTO documento);
	
	public DocumentoDTO findById(Long id);
}
