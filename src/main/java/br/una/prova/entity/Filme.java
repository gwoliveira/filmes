package br.una.prova.entity;

import org.hibernate.validator.constraints.NotBlank;

public class Filme {
    @NotBlank(message = "Campo obrigatório")
    public String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
