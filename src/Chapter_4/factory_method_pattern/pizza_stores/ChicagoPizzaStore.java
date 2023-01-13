package Chapter_4.factory_method_pattern.pizza_stores;

import Chapter_4.factory_method_pattern.pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }

}