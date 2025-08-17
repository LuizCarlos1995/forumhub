package br.com.forumhub.challenge.forum.model.cursos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface RepositoryCursos extends JpaRepository<EntityCursos, Long> {

    Optional<EntityCursos> findByNome(String nomeCurso);

}
