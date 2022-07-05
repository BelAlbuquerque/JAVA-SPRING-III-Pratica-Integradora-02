package com.bootcamp.calculadoradecalorias.service.calculaCalorias;
import com.bootcamp.calculadoradecalorias.model.cardapio.Igrediente;
import com.bootcamp.calculadoradecalorias.model.cardapio.Prato;
import com.bootcamp.calculadoradecalorias.service.criaCardapio.CardapioService;
import lombok.Data;
import org.springframework.stereotype.Service;


@Service
@Data
public class CalculaCalorias extends CardapioService implements CaloriasMetodos {

    private Prato findPrato(String nomePrato) {
        Prato returnPrato = null;
        for (Prato prato : getPratos()) {
            if (prato.getNome().equals(nomePrato)) {
                returnPrato = prato;
            }
        }
        return returnPrato;
    }

    @Override
    public String numeroTotalCalorias(String pratoString) {
        Prato prato = findPrato(pratoString);
        int total = 0;
        for (Igrediente igrediente : prato.getIgredientes()) {
            total += igrediente.getTotalDeCaloria();
        }
        return prato.getNome() + ": " + total;
    }

    @Override
    public String caloriasDeCadaIgredienteNoPrato(String pratoString) {
        Prato prato = findPrato(pratoString);
        String caloriaPorIgredientes ="";
        for (Igrediente igrediente : prato.getIgredientes()) {
            caloriaPorIgredientes += igrediente + "/ ";
        }
        return caloriaPorIgredientes;
    }

    @Override
    public String igredienteMaisCalorico(String pratoString) {
        Prato prato = findPrato(pratoString);
        Igrediente objmaisCalorico = prato.getIgredientes().get(0);
        int maisCalorico = objmaisCalorico.getTotalDeCaloria();

        for (Igrediente igrediente : prato.getIgredientes()) {
            if (maisCalorico < igrediente.getTotalDeCaloria()) {
                maisCalorico = igrediente.getTotalDeCaloria();
                objmaisCalorico = igrediente;
            }
        }
        return objmaisCalorico.toString();
    }
}
