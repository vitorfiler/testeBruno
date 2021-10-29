package com.testeBruno.teste.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.testeBruno.teste.dto.DocumentoDTO;
import com.testeBruno.teste.model.Documento;
import com.testeBruno.teste.repository.DocumentoRepository;
import com.testeBruno.teste.service.DocumentoService;

@Component("DocumentoController")
public class DocumentoServiceImpl implements DocumentoService{

	@Autowired
	DocumentoRepository documentoRepository;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	public DocumentoDTO salvar(DocumentoDTO documento) {
		Documento entidade = objectMapper.convertValue(documento, Documento.class);
		return objectMapper.convertValue(documentoRepository.save(entidade), DocumentoDTO.class);
	}

	public DocumentoDTO update(DocumentoDTO documento) {
		Optional<Documento> existe = documentoRepository.findById(documento.getId());
		if(existe.isPresent()) {			
			Documento entidade = objectMapper.convertValue(documento, Documento.class);
			documento = objectMapper.convertValue(documentoRepository.save(entidade), DocumentoDTO.class);
		}
		return documento;
	}

	public DocumentoDTO findById(Long id) {
		Optional<Documento> documento = documentoRepository.findById(id);
		return objectMapper.convertValue(documento.get(), DocumentoDTO.class);
	}
}
