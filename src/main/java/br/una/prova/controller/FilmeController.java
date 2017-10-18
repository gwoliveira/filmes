package br.una.prova.controller;

import br.una.prova.entity.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/filme")
public class FilmeController {
    @GetMapping
    public String list(Model model) {
        return "filme/listar";
    }

    @GetMapping("/editar")
    public String edit(Model model, @RequestParam Long filmeId) {
        model.addAttribute("filme", new Filme());
        return "filme/formulario";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("filme", new Filme());
        return "filme/formulario";
    }

    @PostMapping("/salvar")
    public String salvar(@Valid Filme filme, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "filme/formulario";
        }
        return "redirect:/filme";
    }

}
