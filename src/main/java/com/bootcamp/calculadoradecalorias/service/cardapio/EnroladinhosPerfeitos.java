package com.bootcamp.calculadoradecalorias.service.cardapio;
import com.bootcamp.calculadoradecalorias.model.cardapio.Igrediente;
import com.bootcamp.calculadoradecalorias.model.cardapio.Prato;

public class EnroladinhosPerfeitos extends Prato {
        Igrediente queijoOvelha = new Igrediente("Queso de oveja", 100);
        Igrediente parma = new Igrediente("Jamón crudo", 150);
        Igrediente figosSecos = new Igrediente("Higos secos", 120);

    public EnroladinhosPerfeitos() {
        setIgredientes(queijoOvelha);
        setIgredientes(parma);
        setIgredientes(figosSecos);
        setNome("Enrroladinhos perfeitos");
    }
}
