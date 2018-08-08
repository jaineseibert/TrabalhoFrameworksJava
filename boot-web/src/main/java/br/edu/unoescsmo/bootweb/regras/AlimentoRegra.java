package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import br.edu.unoescsmo.bootweb.model.Alimento;

public interface AlimentoRegra {

	void salvar(Alimento alimento);

	void delete(Alimento alimento);

	List<Alimento> listar();

	Alimento buscarPorCodigo(Long codigo);

	List<Alimento> dadosGrid();
}
