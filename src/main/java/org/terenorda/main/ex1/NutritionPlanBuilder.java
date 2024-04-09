package org.terenorda.main.ex1;

import java.util.ArrayList;
import java.util.List;

public class NutritionPlanBuilder implements Builder {
    private int caloricIntake;
    private MacronutrientRatio macronutrientRatio;
    private List<MealPlan> mealPlans;
    private String fitnessGoal;
    private List<DietaryRestriction> dietaryRestrictions;


    @Override
    public void setCaloricIntake(int caloricIntake) {
        this.caloricIntake = caloricIntake;
    }

    @Override
    public void setMacronutrientRatios(MacronutrientRatio macronutrientRatio) {
        this.macronutrientRatio = macronutrientRatio;
    }

    @Override
    public void setMealPlans(List<MealPlan> mealPlans) {
        this.mealPlans = new ArrayList<>(mealPlans);
    }

    @Override
    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
    }

    @Override
    public void setDietaryRestrictions(List<DietaryRestriction> dietaryRestrictions) {
        this.dietaryRestrictions = new ArrayList<>(dietaryRestrictions);
    }

    @Override
    public NutritionPlan build() {
        return new NutritionPlan(caloricIntake, macronutrientRatio, mealPlans, fitnessGoal, dietaryRestrictions);
    }

    public NutritionPlan buildDefault() {
        List<MealPlan> defaultMealPlans = new ArrayList<>();
        defaultMealPlans.add(MealPlan.WeightLoss);
        List<DietaryRestriction> defaultDietaryRestrictions = new ArrayList<>();
        defaultDietaryRestrictions.add(DietaryRestriction.LactoseFree);
        return new NutritionPlan(1000, MacronutrientRatio.CARBOHYDRATES, defaultMealPlans, "Loss Weight", defaultDietaryRestrictions);
    }
}
