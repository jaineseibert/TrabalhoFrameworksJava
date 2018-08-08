package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.bootweb.model.Alimento;
import br.edu.unoescsmo.bootweb.repository.AlimentoRepository;

@Service
public class AlimentoPadrao implements AlimentoRegra {

	@Autowired
	private AlimentoRepository alimentoRepository;

	@Override
	public void salvar(Alimento alimento) {
		alimentoRepository.save(alimento);

	}

	@Override
	public void delete(Alimento alimento) {
		alimentoRepository.delete(alimento);

	}

	@Override
	public List<Alimento> listar() {
		return alimentoRepository.findAll();
	}

	@Override
	public Alimento buscarPorCodigo(Long codigo) {
		return alimentoRepository.findById(codigo).orElse(new Alimento(codigo));
	}

	@Override
	public List<Alimento> dadosGrid() {
		return alimentoRepository.dadosGrid();
	}

}
