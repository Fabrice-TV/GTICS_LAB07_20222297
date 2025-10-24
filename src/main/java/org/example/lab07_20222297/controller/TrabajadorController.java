package org.example.lab07_20222297.controller;

import org.example.lab07_20222297.repository.TrabajadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrabajadorController {

    private final TrabajadorRepository repo;

    public TrabajadorController(TrabajadorRepository repo) {
        this.repo = repo;
    }

    @GetMapping({"/", "/trabajadores"})
    public String listarTrabajadores(Model model) {
        model.addAttribute("trabajadores", repo.findAll());
        return "trabajadores";
    }
}
