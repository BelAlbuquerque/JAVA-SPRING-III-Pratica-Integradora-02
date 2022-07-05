package com.bootcamp.calculadoradecalorias.model.cardapio;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class Prato {
    private String nome;
    private ArrayList<Igrediente> igredientes;

    public void setIgredientes(Igrediente igrediente) {
        igredientes.add(igrediente);
    }

}
