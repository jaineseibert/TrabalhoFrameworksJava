package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import br.edu.unoescsmo.bootweb.model.Cardapio;

public interface CardapioRegra {

	void salvar(Cardapio cardapio);

	void delete(Cardapio cardapio);

	List<Cardapio> listar();

	Cardapio buscarPorCodigo(Long codigo);

	List<Cardapio> dadosGrid();
}
