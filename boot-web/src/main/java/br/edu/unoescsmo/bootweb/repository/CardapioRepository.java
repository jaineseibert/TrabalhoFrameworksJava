package br.edu.unoescsmo.bootweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoescsmo.bootweb.model.Cardapio;

public interface CardapioRepository extends JpaRepository<Cardapio, Long> {

	@Query("select c from Cardapio c")
	List<Cardapio> dadosGrid();
}
