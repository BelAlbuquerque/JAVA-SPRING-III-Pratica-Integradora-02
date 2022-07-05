package com.bootcamp.calculadoradecalorias.model.cardapio.pratos;
import com.bootcamp.calculadoradecalorias.model.cardapio.Igrediente;
import com.bootcamp.calculadoradecalorias.model.cardapio.Prato;

public class Cordeiro extends Prato {
    Igrediente cordeiro = new Igrediente("Cordero, costillas", 230);
    Igrediente agriao = new Igrediente("Berros", 100);
    Igrediente nozes = new Igrediente("Nueces", 120);
    Igrediente pureDeBatata = new Igrediente("Papas cocidas", 150);
    Igrediente trufa = new Igrediente("Trufa", 5);

    public Cordeiro() {
        setIgredientes(cordeiro);
        setIgredientes(agriao);
        setIgredientes(nozes);
        setIgredientes(pureDeBatata);
        setIgredientes(trufa);
        setNome("Cordeiro dos Sonhos");
    }

}
