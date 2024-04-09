package org.terenorda.main.ex1;

import java.util.List;

public class NutritionPlan {
    private int caloricIntake;
    private MacronutrientRatio macronutrientRatio;
    private List<MealPlan> mealPlans;
    private String fitnessGoal;
    private List<DietaryRestriction> dietaryRestrictions;

    public NutritionPlan() {}

    public NutritionPlan(int caloricIntake, MacronutrientRatio macronutrientRatio, List<MealPlan> mealPlans, String fitnessGoal, List<DietaryRestriction> dietaryRestrictions) {
        this.caloricIntake = caloricIntake;
        this.macronutrientRatio = macronutrientRatio;
        this.mealPlans = mealPlans;
        this.fitnessGoal = fitnessGoal;
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public int getCaloricIntake() {
        return caloricIntake;
    }

    public MacronutrientRatio getMacronutrientRatio() {
        return macronutrientRatio;
    }

    public List<MealPlan> getMealPlans() {
        return mealPlans;
    }

    public String getFitnessGoal() {
        return fitnessGoal;
    }

    public List<DietaryRestriction> getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    @Override
    public String toString() {
        return "NutritionPlan{" +
                "\ncaloricIntake=" + caloricIntake +
                ", \nmacronutrientRatio=" + macronutrientRatio +
                ", \nmealPlans=" + mealPlans +
                ", \nfitnessGoal='" + fitnessGoal + '\'' +
                ", \ndietaryRestrictions=" + dietaryRestrictions +
                '}';
    }
}
