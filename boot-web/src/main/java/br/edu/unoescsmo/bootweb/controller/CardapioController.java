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

import br.edu.unoescsmo.bootweb.model.Cardapio;
import br.edu.unoescsmo.bootweb.regras.CardapioRegra;

@Controller
@RequestMapping("/cardapio")
public class CardapioController {

	@Autowired
	private CardapioRegra cardapioRegra;

	@PostMapping("/salvar")
	public String salvar(@Valid Cardapio cardapio, BindingResult erros) {
		if (erros.hasErrors()) {
			return "cardapio/novo";
		}
		cardapioRegra.salvar(cardapio);
		return "redirect:/cardapio/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid Cardapio cardapio, BindingResult erros) {
		if (erros.hasErrors()) {
			return "cardapio/visualizar";
		}
		cardapioRegra.salvar(cardapio);
		return "redirect:/cardapio/listar";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		return "cardapio/novo";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("cardapios", cardapioRegra.dadosGrid());
		return "cardapio/lista";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		cardapioRegra.delete(new Cardapio(codigo));
		return "redirect:/cardapio/listar";

	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("cardapio", cardapioRegra.buscarPorCodigo(codigo));
		return "cardapio/visualizar";

	}
}
