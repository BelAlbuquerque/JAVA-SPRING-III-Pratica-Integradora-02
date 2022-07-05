package com.bootcamp.calculadoradecalorias.service.calculaCalorias;

public interface CaloriasMetodos {

    String numeroTotalCalorias(String prato);

    String caloriasDeCadaIgredienteNoPrato(String prato);

    String igredienteMaisCalorico(String prato);
}
