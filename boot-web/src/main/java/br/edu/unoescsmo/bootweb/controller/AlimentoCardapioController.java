package br.edu.unoescsmo.bootweb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unoescsmo.bootweb.model.AlimentoCardapio;
import br.edu.unoescsmo.bootweb.regras.AlimentoCardapioRegra;
import br.edu.unoescsmo.bootweb.regras.AlimentoRegra;
import br.edu.unoescsmo.bootweb.regras.CardapioRegra;

@Controller
@RequestMapping("/alimentocardapio")
public class AlimentoCardapioController {

	@Autowired
	private AlimentoCardapioRegra alimentoCardapioRegra;
	@Autowired
	private AlimentoRegra alimentoRegra;
	@Autowired
	private CardapioRegra cardapioRegra;

	@PostMapping("/salvar")
	public String salvar(@Valid AlimentoCardapio alimentoCardapio, BindingResult erros) {
		if (erros.hasErrors()) {
			return "alimentocardapio/novo";
		}
		alimentoCardapioRegra.salvar(alimentoCardapio);
		return "redirect:/alimentocardapio/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid AlimentoCardapio alimentoCardapio, BindingResult erros) {
		if (erros.hasErrors()) {
			return "alimentocardapio/visualizar";
		}
		alimentoCardapioRegra.salvar(alimentoCardapio);
		return "redirect:/alimentocardapio/listar";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("alimentos", alimentoRegra.dadosGrid());
		model.addAttribute("cardapios", cardapioRegra.dadosGrid());
		return "alimentocardapio/novo";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("alimentoCardapios", alimentoCardapioRegra.dadosGrid());
		return "alimentocardapio/lista";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		alimentoCardapioRegra.delete(new AlimentoCardapio(codigo));
		return "redirect:/alimentocardapio/listar";

	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("alimentoCardapio", alimentoCardapioRegra.buscarPorCodigo(codigo));
		model.addAttribute("alimentos", alimentoRegra.dadosGrid());
		model.addAttribute("cardapios", cardapioRegra.dadosGrid());
		return "alimentocardapio/visualizar";

	}
}
