package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.bootweb.model.Cardapio;
import br.edu.unoescsmo.bootweb.repository.CardapioRepository;

@Service
public class CardapioPadrao implements CardapioRegra {

	@Autowired
	private CardapioRepository cardapioRepository;

	@Override
	public void salvar(Cardapio cardapio) {
		cardapioRepository.save(cardapio);

	}

	@Override
	public void delete(Cardapio cardapio) {
		cardapioRepository.delete(cardapio);

	}

	@Override
	public List<Cardapio> listar() {
		return cardapioRepository.findAll();
	}

	@Override
	public Cardapio buscarPorCodigo(Long codigo) {
		return cardapioRepository.findById(codigo).orElse(new Cardapio(codigo));
	}

	@Override
	public List<Cardapio> dadosGrid() {
		return cardapioRepository.dadosGrid();
	}

}
