package Chapter_4.Abstract_Factory_Pattern.PizzaStores;

import Chapter_4.Abstract_Factory_Pattern.PizzaIngredientFactories.ChicagoPizzaIngredientFactory;
import Chapter_4.Abstract_Factory_Pattern.PizzaIngredientFactories.PizzaIngredientFactory;
import Chapter_4.Abstract_Factory_Pattern.Pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;

            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;

            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;

            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
        }
        return pizza;
    }

}
