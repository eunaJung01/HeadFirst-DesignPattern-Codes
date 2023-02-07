package Chapter_04.abstract_factory_pattern.pizza_ingredient_factories;

import Chapter_04.abstract_factory_pattern.pizza_ingredients.*;

public interface PizzaIngredientFactory {

    // 각 재료별 생성 메소드
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
