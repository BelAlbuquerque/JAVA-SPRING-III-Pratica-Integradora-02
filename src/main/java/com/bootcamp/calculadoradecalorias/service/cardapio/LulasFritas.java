package com.bootcamp.calculadoradecalorias.service.cardapio;
import com.bootcamp.calculadoradecalorias.model.cardapio.Igrediente;
import com.bootcamp.calculadoradecalorias.model.cardapio.Prato;

public class LulasFritas extends Prato {
    Igrediente lula = new Igrediente("Calamar", 250);

    public LulasFritas() {
        setIgredientes(lula);

        setNome("Lulas fritas");
    }
}
