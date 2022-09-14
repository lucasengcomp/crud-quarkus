package br.com.endereco.resource;

import br.com.endereco.entity.Endereco;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface EnderecoResource extends PanacheEntityResource<Endereco, Long> {
}
