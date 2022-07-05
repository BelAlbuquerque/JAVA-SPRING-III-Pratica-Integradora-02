package com.bootcamp.calculadoradecalorias.model.DB;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
@Getter
@Setter
@NoArgsConstructor
public class FoodCaloriesDB {
    private String name;
    private int calories;
}
