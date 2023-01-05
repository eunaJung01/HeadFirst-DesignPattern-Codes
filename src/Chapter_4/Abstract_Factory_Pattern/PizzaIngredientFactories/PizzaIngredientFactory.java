package Chapter_4.Abstract_Factory_Pattern.PizzaIngredientFactories;

import Chapter_4.Abstract_Factory_Pattern.PizzaIngredients.*;

public interface PizzaIngredientFactory {

    // 각 재료별 생성 메소드
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
