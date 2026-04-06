package br.com.cotiinformatica.api_pedidos.dtos.responses;


import br.com.cotiinformatica.api_pedidos.entities.Produto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemPedidoResponse {

    private String id;
    private ProdutoResponse produto; //Relação entre DTOS
    private Integer quantidade;

}
