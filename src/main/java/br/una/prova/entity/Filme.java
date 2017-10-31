package br.una.prova.entity;

import org.hibernate.annotations.Formula;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Filme {
    @Id
    @GeneratedValue
    private Integer id;

    @NotBlank(message = "Campo obrigatório")
    private String nome;

    private Integer ano;

    @Formula("(select AVG(v.avaliacao + 0.0) from voto v where v.filme_id = id)")
    private Double mediaAvaliacoes;

    @ManyToOne
    @JoinColumn(name = "diretor_id", referencedColumnName = "id")
    private Diretor diretor;


    @ManyToMany
    @JoinTable(name="filme_ator",
            joinColumns=@JoinColumn(name="filme_id"),
            inverseJoinColumns=@JoinColumn(name="ator_id")
    )
    private Set<Ator> atores;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Set<Ator> getAtores() {
        return atores;
    }

    public void setAtores(Set<Ator> atores) {
        this.atores = atores;
    }

    public Double getMediaAvaliacoes() {
        return mediaAvaliacoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return Objects.equals(id, filme.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
