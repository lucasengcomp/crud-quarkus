package br.com.pessoa.resource;

import br.com.pessoa.entity.Pessoa;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface PessoaResource extends PanacheEntityResource<Pessoa, Long> {
}
