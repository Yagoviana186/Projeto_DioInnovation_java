package me.dio.academia.digital.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;
  

    @GetMapping
    public List<Aluno> getAll() {
       return service.getAll();
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form) {
        return service.create(form);
    } 

    @GetMapping
    public List<AvaliacaoFisica> getAllAvalicaoFisica() {
        return service.getAllAvalicaoFisica();
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAvaliacaoFisica(@PathVariable Long id) {
        return service.getAllAvalicaoFisicaId(id);
    }



}