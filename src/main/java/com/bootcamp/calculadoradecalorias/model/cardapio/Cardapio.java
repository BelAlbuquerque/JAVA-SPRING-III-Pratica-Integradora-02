package com.bootcamp.calculadoradecalorias.model.cardapio;

import lombok.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class Cardapio {
    private ArrayList<Prato> pratos = new ArrayList<Prato>();

    public void setPrato(Prato prato) {
        pratos.add(prato);
    }

}
