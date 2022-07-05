package com.bootcamp.calculadoradecalorias.model.cardapio.pratos;
import com.bootcamp.calculadoradecalorias.model.cardapio.Igrediente;
import com.bootcamp.calculadoradecalorias.model.cardapio.Prato;

public class PolentaVegetariana extends Prato {
    Igrediente polenta = new Igrediente("Polenta", 230);
    Igrediente queijo = new Igrediente("Queso roquefort", 100);
    Igrediente cogumelos = new Igrediente("Champiñón y otras setas", 200);

    public PolentaVegetariana() {
        setIgredientes(polenta);
        setIgredientes(queijo);
        setIgredientes(cogumelos);

        setNome("Polenta com Ragu de Cogumelos");
    }
}
