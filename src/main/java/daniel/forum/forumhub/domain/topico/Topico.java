package daniel.forum.forumhub.domain.topico;

import daniel.forum.forumhub.domain.autor.Autor;
import daniel.forum.forumhub.domain.curso.Curso;
import daniel.forum.forumhub.domain.resposta.Resposta;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
@Table(name = "topicos")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @OneToMany(mappedBy = "topico", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Resposta> respostas;

    public void atualizar(@Valid DadosAtualizacaoTopico dados, Curso curso){
        this.curso = curso;
        this.mensagem = dados.mensagem();
        this.titulo = dados.titulo();
    }

}
