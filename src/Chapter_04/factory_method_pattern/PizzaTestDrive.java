package Chapter_04.factory_method_pattern;

import Chapter_04.factory_method_pattern.pizza_stores.ChicagoPizzaStore;
import Chapter_04.factory_method_pattern.pizza_stores.NYPizzaStore;
import Chapter_04.factory_method_pattern.pizza_stores.PizzaStore;
import Chapter_04.factory_method_pattern.pizzas.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        // cheese
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("\nEthan ordered a " + pizza.getName() + "\n\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("\nJoel ordered a " + pizza.getName() + "\n\n");

        // clam
        pizza = nyStore.orderPizza("clam");
        System.out.println("\nEthan ordered a " + pizza.getName() + "\n\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("\nJoel ordered a " + pizza.getName() + "\n\n");

        // pepperoni
        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("\nEthan ordered a " + pizza.getName() + "\n\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("\nJoel ordered a " + pizza.getName() + "\n\n");

        // veggie
        pizza = nyStore.orderPizza("veggie");
        System.out.println("\nEthan ordered a " + pizza.getName() + "\n\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("\nJoel ordered a " + pizza.getName() + "\n\n");
    }

}
