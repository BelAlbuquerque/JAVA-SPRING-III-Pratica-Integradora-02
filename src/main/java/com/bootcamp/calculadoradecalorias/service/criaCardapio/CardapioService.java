package com.bootcamp.calculadoradecalorias.service.criaCardapio;

import com.bootcamp.calculadoradecalorias.model.cardapio.Cardapio;
import com.bootcamp.calculadoradecalorias.model.cardapio.pratos.Cordeiro;
import com.bootcamp.calculadoradecalorias.model.cardapio.pratos.EnroladinhosPerfeitos;
import com.bootcamp.calculadoradecalorias.model.cardapio.pratos.LulasFritas;
import com.bootcamp.calculadoradecalorias.model.cardapio.pratos.PolentaVegetariana;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class CardapioService extends Cardapio {
    public CardapioService() {
        setPrato(new Cordeiro());
        setPrato(new EnroladinhosPerfeitos());
        setPrato(new LulasFritas());
        setPrato(new PolentaVegetariana());
    }
}
