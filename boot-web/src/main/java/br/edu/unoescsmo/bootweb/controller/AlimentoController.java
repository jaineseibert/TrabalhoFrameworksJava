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

import br.edu.unoescsmo.bootweb.model.Alimento;
import br.edu.unoescsmo.bootweb.regras.AlimentoRegra;

@Controller
@RequestMapping("/alimento")
public class AlimentoController {

	@Autowired
	private AlimentoRegra alimentoRegra;

	@PostMapping("/salvar")
	public String salvar(@Valid Alimento alimento, BindingResult erros) {
		if (erros.hasErrors()) {
			return "alimento/novo";
		}
		alimentoRegra.salvar(alimento);
		return "redirect:/alimento/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid Alimento alimento, BindingResult erros) {
		if (erros.hasErrors()) {
			return "alimento/visualizar";
		}
		alimentoRegra.salvar(alimento);
		return "redirect:/alimento/listar";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		return "alimento/novo";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("alimentos", alimentoRegra.dadosGrid());
		return "alimento/lista";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		alimentoRegra.delete(new Alimento(codigo));
		return "redirect:/alimento/listar";

	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("alimento", alimentoRegra.buscarPorCodigo(codigo));
		return "alimento/visualizar";

	}
}
