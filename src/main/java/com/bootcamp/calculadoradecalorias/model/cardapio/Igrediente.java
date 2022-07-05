package com.bootcamp.calculadoradecalorias.model.cardapio;

import com.bootcamp.calculadoradecalorias.model.DB.FoodCaloriesDB;
import com.bootcamp.calculadoradecalorias.model.utils.HandleFile;
import lombok.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class Igrediente implements HandleFile {
    private String nomeDoIgrediente;
    private int pesoEmGrama;
    private int totalDeCaloria;
    private ArrayList<FoodCaloriesDB> listaCaloriasPorAlimento = readFile("src/main/resources/DB.json");

    public Igrediente(String nomeDoIgrediente, int pesoEmGrama) {
        this.nomeDoIgrediente = nomeDoIgrediente;
        this.pesoEmGrama = pesoEmGrama;
        this.setTotalDeCaloria();
    }

    public void setTotalDeCaloria() {
        for(FoodCaloriesDB foodDB : listaCaloriasPorAlimento) {
            if(foodDB.getName().equals(nomeDoIgrediente)) {
                this.setTotalDeCaloria(foodDB.getCalories());
            }
        }
    }

    @Override
    public String toString() {
        return nomeDoIgrediente + ": " + totalDeCaloria + " Kcal  ";
    }
}
