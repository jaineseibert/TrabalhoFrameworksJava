package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.bootweb.model.AlimentoCardapio;
import br.edu.unoescsmo.bootweb.repository.AlimentoCardapioRepository;

@Service
public class AlimentoCardapioPadrao implements AlimentoCardapioRegra {

	@Autowired
	private AlimentoCardapioRepository alimentoCardapioRepository;

	@Override
	public void salvar(AlimentoCardapio alimentoCardapio) {
		alimentoCardapioRepository.save(alimentoCardapio);

	}

	@Override
	public void delete(AlimentoCardapio alimentoCardapio) {
		alimentoCardapioRepository.delete(alimentoCardapio);

	}

	@Override
	public List<AlimentoCardapio> listar() {
		return alimentoCardapioRepository.findAll();
	}

	@Override
	public AlimentoCardapio buscarPorCodigo(Long codigo) {
		return alimentoCardapioRepository.findById(codigo).orElse(new AlimentoCardapio(codigo));
	}

	@Override
	public List<AlimentoCardapio> dadosGrid() {
		return alimentoCardapioRepository.dadosGrid();
	}

}
