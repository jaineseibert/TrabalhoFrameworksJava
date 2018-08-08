package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.bootweb.model.Refeicao;
import br.edu.unoescsmo.bootweb.repository.RefeicaoRepository;

@Service
public class RefeicaoPadrao implements RefeicaoRegra {

	@Autowired
	private RefeicaoRepository refeicaoRepository;

	@Override
	public void salvar(Refeicao refeicao) {
		refeicaoRepository.save(refeicao);

	}

	@Override
	public void delete(Refeicao refeicao) {
		refeicaoRepository.delete(refeicao);

	}

	@Override
	public List<Refeicao> listar() {
		return refeicaoRepository.findAll();
	}

	@Override
	public Refeicao buscarPorCodigo(Long codigo) {
		return refeicaoRepository.findById(codigo).orElse(new Refeicao(codigo));
	}

	@Override
	public List<Refeicao> dadosGrid() {
		return refeicaoRepository.dadosGrid();
	}

}
