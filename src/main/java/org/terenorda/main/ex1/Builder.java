package org.terenorda.main.ex1;

import java.util.List;

public interface Builder {
    void setCaloricIntake(int caloricIntake);

    void setMacronutrientRatios(MacronutrientRatio macronutrientRatio);
    void setMealPlans(List<MealPlan> mealPlans);
    void setFitnessGoal(String fitnessGoal);
    void setDietaryRestrictions(List<DietaryRestriction> dietaryRestrictions);
    NutritionPlan build();
}
