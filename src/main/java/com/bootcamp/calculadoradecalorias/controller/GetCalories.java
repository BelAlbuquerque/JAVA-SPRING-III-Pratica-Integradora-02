package com.bootcamp.calculadoradecalorias.controller;

import com.bootcamp.calculadoradecalorias.service.calculaCalorias.CalculaCalorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetCalories {

   @Autowired
    private CalculaCalorias calculaCalorias;

    @GetMapping("/allIngredients/{prato}")
    public ResponseEntity<String> allIngredientsCalories(@PathVariable String prato) {
            String allIngredients = calculaCalorias.caloriasDeCadaIgredienteNoPrato(prato);
            return ResponseEntity.ok().body(allIngredients);
    }

    @GetMapping("/totalCalories/{prato}")
    public ResponseEntity<String> totalCalories(@PathVariable String prato) {

        String allCalories = calculaCalorias.numeroTotalCalorias(prato);
        return ResponseEntity.ok().body(allCalories);
    }

    @GetMapping("/theMostCalorie/{prato}")
    public ResponseEntity<String> theMostCalorie(@PathVariable String prato) {

        String mostCalorie = calculaCalorias.igredienteMaisCalorico(prato);
        return ResponseEntity.ok().body(mostCalorie);
    }

    @GetMapping
    public ResponseEntity<String>home() {
        String teste = "  Cardapio Quintal Cozinha: Enroladinhos Perfeitos  |||  Lula Frita  " +
                "|||  Cordeiro dos Sonhos  |||  Polenta com Ragu de Cogumelos";
        return ResponseEntity.ok().body(teste);
    }
}
