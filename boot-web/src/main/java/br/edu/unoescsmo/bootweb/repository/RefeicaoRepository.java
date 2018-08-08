package br.edu.unoescsmo.bootweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoescsmo.bootweb.model.Refeicao;

public interface RefeicaoRepository extends JpaRepository<Refeicao, Long> {

	@Query("select r from Refeicao r left join fetch r.cardapio")
	List<Refeicao> dadosGrid();
	
}
