package daniel.forum.forumhub.controller;

import daniel.forum.forumhub.domain.curso.Curso;
import daniel.forum.forumhub.domain.curso.CursoRepository;
import daniel.forum.forumhub.domain.curso.CursoService;
import daniel.forum.forumhub.domain.curso.DadosCadastroCurso;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
@SecurityRequirement(name = "bearer-key")
public class CursoController {

    @Autowired
    private CursoService service;

    @Autowired
    private CursoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody DadosCadastroCurso dados){
        Curso curso = service.construir(dados);
        repository.save(curso);

        return ResponseEntity.ok(dados);
    }
}
