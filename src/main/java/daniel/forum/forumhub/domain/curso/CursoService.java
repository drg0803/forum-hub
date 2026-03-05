package daniel.forum.forumhub.domain.curso;

import daniel.forum.forumhub.domain.autor.DadosCadastroAutor;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    public Curso construir(DadosCadastroCurso dados){
        return new Curso(null, dados.nome(), dados.categoria());
    }
}
