package com.kauabraccio.projectmanagementapi.controller;

import com.kauabraccio.projectmanagementapi.dao.ProjetoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kauabraccio.projectmanagementapi.model.Projeto;

import java.util.List;

@RestController
@RequestMapping("/api/projeto")
public class ProjetoController {

    @Autowired
    private ProjetoDAO projetoDAO;

    @GetMapping("/{idProjeto}")
    public Projeto getProjeto(@PathVariable Long idProjeto) {
        return projetoDAO.buscarPorId(idProjeto);
    }

    @PostMapping("/")
    public void createProjeto(@RequestBody Projeto projeto) {
        projetoDAO.inserir(projeto);
    }

    @GetMapping("/todos")
    public List<Projeto> getAllProjetos() {
        return projetoDAO.consultarTodos();
    }
}
