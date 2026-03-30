package br.com.cotiinformatica.api_pedidos.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Setter
@Getter
@Document(collection = "produtos")
public class Produto {

    @Id
    private String id;
    private String nome;
    private Double preco;
}

