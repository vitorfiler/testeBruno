package com.testeBruno.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.testeBruno.teste.dto.DocumentoDTO;
import com.testeBruno.teste.service.DocumentoService;

@RestController
@RequestMapping("/documentos")
public class DocumentoController {

	@Autowired
	DocumentoService documentoService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public DocumentoDTO salvar(@RequestBody DocumentoDTO documento) {
		return documentoService.salvar(documento);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public DocumentoDTO update(@RequestBody DocumentoDTO documento) {
		return documentoService.update(documento);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public DocumentoDTO findById(@RequestParam(value="id") Long id) {
		return documentoService.findById(id);
	}
}
