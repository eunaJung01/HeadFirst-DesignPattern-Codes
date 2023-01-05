package Chapter_4.Factory_Method_Pattern.PizzaStores;

import Chapter_4.Factory_Method_Pattern.Pizzas.*;

public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }

}
