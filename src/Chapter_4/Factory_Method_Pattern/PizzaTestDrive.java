package Chapter_4.Factory_Method_Pattern;

import Chapter_4.Factory_Method_Pattern.PizzaStores.ChicagoPizzaStore;
import Chapter_4.Factory_Method_Pattern.PizzaStores.NYPizzaStore;
import Chapter_4.Factory_Method_Pattern.PizzaStores.PizzaStore;
import Chapter_4.Factory_Method_Pattern.Pizzas.Pizza;

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
