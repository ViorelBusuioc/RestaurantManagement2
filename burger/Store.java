package dev.lpa.burger;

public class Store {

    public static void main(String[] args) {

        Meal regularMeal = new Meal();
        regularMeal.addToppings("Onions","Bacon","Cheese","Mustard");
        System.out.println(regularMeal);


//        Meal USRegularMeal = new Meal(0.68);
//        System.out.println(USRegularMeal);
    }
}
