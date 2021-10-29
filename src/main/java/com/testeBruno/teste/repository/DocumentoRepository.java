package com.testeBruno.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testeBruno.teste.model.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long>{

}
