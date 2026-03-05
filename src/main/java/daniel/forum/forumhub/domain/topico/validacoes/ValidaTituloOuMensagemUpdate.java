package daniel.forum.forumhub.domain.topico.validacoes;

import daniel.forum.forumhub.domain.ValidacaoException;
import daniel.forum.forumhub.domain.topico.DadosAtualizacaoTopico;
import daniel.forum.forumhub.domain.topico.Topico;
import daniel.forum.forumhub.domain.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidaTituloOuMensagemUpdate implements ValidadorAtualizacaoTopico{

    @Autowired
    private TopicoRepository repository;

    @Override
    public void validar(DadosAtualizacaoTopico dados) {
        if(repository.existsByTitulo(dados.titulo())){
            throw new ValidacaoException("Já existe um tópico com este título");
        }

        if(repository.existsByMensagem(dados.mensagem())){
            throw new ValidacaoException("Já existe um tópico com esta mensagem!");
        }

    }
}
