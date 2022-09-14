package br.com.pessoa.entity;

import br.com.endereco.entity.Endereco;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Pessoa extends PanacheEntity {

    public String nome;

    public Integer idade;

    @OneToOne
    public Endereco endereco;
}
