package br.com.forumhub.challenge.forum.controller;

import br.com.forumhub.challenge.forum.model.cursos.DTOCursos;
import br.com.forumhub.challenge.forum.model.cursos.EntityCursos;
import br.com.forumhub.challenge.forum.model.cursos.RepositoryCursos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class ResquestCursoController {

    @Autowired
    private RepositoryCursos repository;

    @PostMapping("/registrar")
    public ResponseEntity<EntityCursos> registrar(@RequestBody DTOCursos dto) {
        EntityCursos curso = new EntityCursos(dto);
        repository.save(curso);
        return ResponseEntity.ok(curso);
    }

    @GetMapping
    public List<EntityCursos> listar() {
        return repository.findAll();
    }
}
