package br.com.cotiinformatica.api_pedidos.repositories;

import br.com.cotiinformatica.api_pedidos.entities.Cliente;
import br.com.cotiinformatica.api_pedidos.entities.ItemPedido;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ItemPedidoRepository extends MongoRepository<ItemPedido, String> {
}
