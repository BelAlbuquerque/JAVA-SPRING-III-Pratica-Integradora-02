package com.bootcamp.calculadoradecalorias.model.cardapio;

import com.bootcamp.calculadoradecalorias.model.cardapio.Igrediente;
import lombok.*;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class Prato {
    private String nome;
    private ArrayList<Igrediente> igredientes = new ArrayList<Igrediente>();

    public void setIgredientes(Igrediente igrediente) {
        igredientes.add(igrediente);
    }

}
