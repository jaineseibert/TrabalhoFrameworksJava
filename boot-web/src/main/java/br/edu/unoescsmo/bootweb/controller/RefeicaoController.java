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

import br.edu.unoescsmo.bootweb.model.Refeicao;
import br.edu.unoescsmo.bootweb.regras.CardapioRegra;
import br.edu.unoescsmo.bootweb.regras.RefeicaoRegra;

@Controller
@RequestMapping("/refeicao")
public class RefeicaoController {

	@Autowired
	private RefeicaoRegra refeicaoRegra;
	@Autowired
	private CardapioRegra cardapioRegra;

	@PostMapping("/salvar")
	public String salvar(@Valid Refeicao refeicao, BindingResult erros) {
		if (erros.hasErrors()) {
			return "refeicao/novo";
		}
		refeicaoRegra.salvar(refeicao);
		return "redirect:/refeicao/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid Refeicao refeicao, BindingResult erros) {
		if (erros.hasErrors()) {
			return "refeicao/visualizar";
		}
		refeicaoRegra.salvar(refeicao);
		return "redirect:/refeicao/listar";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("cardapios", cardapioRegra.dadosGrid());
		return "refeicao/novo";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("refeicoes", refeicaoRegra.dadosGrid());
		return "refeicao/lista";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		refeicaoRegra.delete(new Refeicao(codigo));
		return "redirect:/refeicao/listar";

	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("refeicao", refeicaoRegra.buscarPorCodigo(codigo));
		model.addAttribute("cardapios", cardapioRegra.dadosGrid());
		return "refeicao/visualizar";

	}
}
