package br.edu.unoescsmo.bootweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoescsmo.bootweb.model.Alimento;

public interface AlimentoRepository extends JpaRepository<Alimento, Long> {

	@Query("select a from Alimento a")
	List<Alimento> dadosGrid();
}
