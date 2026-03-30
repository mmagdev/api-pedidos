package br.com.cotiinformatica.api_pedidos.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Setter
@Getter
@Document(collection = "itens-pedido")
public class ItemPedido {

    private String id;
    private String pedidoId;
    private String produtoId;
    private Integer quantidade;
}
