package org.terenorda.main.ex1;

import java.util.ArrayList;

public class Director {
    public static void main(String[] args) {
        NutritionPlanBuilder builder = new NutritionPlanBuilder();
        NutritionPlan nutritionPlan = builder.buildDefault();
        System.out.println(nutritionPlan);
    }
}
