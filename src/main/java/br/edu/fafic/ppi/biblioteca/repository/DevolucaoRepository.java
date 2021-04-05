package br.edu.fafic.ppi.biblioteca.repository;

import br.edu.fafic.ppi.biblioteca.domain.Devolucao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DevolucaoRepository extends JpaRepository<Devolucao, UUID> {



}
