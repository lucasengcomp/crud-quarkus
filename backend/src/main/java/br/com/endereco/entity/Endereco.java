package br.com.endereco.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Endereco extends PanacheEntity {

    public String rua;
    public String bairro;
    public Integer numero;
    public String cidade;
    public String estado;
    public String cep;
}
