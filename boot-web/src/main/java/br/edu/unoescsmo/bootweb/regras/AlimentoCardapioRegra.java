package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import br.edu.unoescsmo.bootweb.model.AlimentoCardapio;

public interface AlimentoCardapioRegra {

	void salvar(AlimentoCardapio alimentoCardapio);

	void delete(AlimentoCardapio alimentoCardapio);

	List<AlimentoCardapio> listar();

	AlimentoCardapio buscarPorCodigo(Long codigo);

	List<AlimentoCardapio> dadosGrid();
}
