package com.bootcamp.calculadoradecalorias.model.ptratos;

import lombok.Data;

import java.util.ArrayList;

@Data
public abstract class Prato {
    private ArrayList<Igredientes> igredientes;

}
