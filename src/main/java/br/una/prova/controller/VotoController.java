package br.una.prova.controller;

import br.una.prova.repository.FilmeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/voto")
public class VotoController {

    private FilmeRepository filmeRepository;

    public VotoController(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("filmes", filmeRepository.findAll());
        return "voto/formulario";
    }
}
