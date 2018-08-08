package br.edu.unoescsmo.bootweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoescsmo.bootweb.model.AlimentoCardapio;

public interface AlimentoCardapioRepository extends JpaRepository<AlimentoCardapio, Long> {

	@Query("select ac from AlimentoCardapio ac left join fetch ac.alimento left join fetch ac.cardapio")
	List<AlimentoCardapio> dadosGrid();
}
