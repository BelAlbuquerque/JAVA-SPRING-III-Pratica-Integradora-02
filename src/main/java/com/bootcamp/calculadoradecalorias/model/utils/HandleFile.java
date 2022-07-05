package com.bootcamp.calculadoradecalorias.model.utils;

import com.bootcamp.calculadoradecalorias.model.DB.FoodCaloriesDB;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface HandleFile {

    // default ArrayList<T> readFile(String linkFile, T classType) {
        default ArrayList<FoodCaloriesDB> readFile(String linkFile) {
            ObjectMapper mapper = new ObjectMapper();
            List<FoodCaloriesDB> lista = null;
            try {
                lista = Arrays.asList(mapper.readValue(new File(linkFile), FoodCaloriesDB[].class));
            } catch (Exception ex) {

            }
            ArrayList<FoodCaloriesDB> teste = new ArrayList<FoodCaloriesDB>(lista);
            return teste;
        }
}
