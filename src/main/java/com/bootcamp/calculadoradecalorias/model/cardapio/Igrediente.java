package com.bootcamp.calculadoradecalorias.model.cardapio;

import lombok.*;
import org.springframework.stereotype.Repository;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class Igrediente {
    private String nomeDoIgrediente;
    private int pesoEmGramas;
}
