package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import br.edu.unoescsmo.bootweb.model.Refeicao;

public interface RefeicaoRegra {

	void salvar(Refeicao refeicao);

	void delete(Refeicao refeicao);

	List<Refeicao> listar();

	Refeicao buscarPorCodigo(Long codigo);

	List<Refeicao> dadosGrid();
}
