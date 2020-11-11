package com.lombardi.manytomanyexampleapp;

import com.lombardi.manytomanyexampleapp.beans.Pizza;
import com.lombardi.manytomanyexampleapp.beans.Topping;
import com.lombardi.manytomanyexampleapp.repositories.PizzaRepository;
import com.lombardi.manytomanyexampleapp.repositories.ToppingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManyToManyExampleAppApplicationTests {

	@Autowired
	PizzaRepository pizzaRepository;

	@Autowired
	ToppingRepository toppingRepository;

	@Test
	public void addPizzas() {
		Pizza meatPizza = new Pizza("Meat", 10.99f);
		meatPizza.addTopping(toppingRepository.findById(1).get());
		meatPizza.addTopping(toppingRepository.findById(2).get());
		meatPizza.addTopping(toppingRepository.findById(3).get());
		meatPizza.addTopping(toppingRepository.findById(4).get());
		meatPizza.addTopping(toppingRepository.findById(5).get());
		pizzaRepository.save(meatPizza);

		Pizza veggiePizza = new Pizza("Veggie", 10.99f);
		veggiePizza.addTopping(toppingRepository.findById(6).get());
		veggiePizza.addTopping(toppingRepository.findById(7).get());
		veggiePizza.addTopping(toppingRepository.findById(8).get());
		veggiePizza.addTopping(toppingRepository.findById(9).get());
		veggiePizza.addTopping(toppingRepository.findById(10).get());
		pizzaRepository.save(veggiePizza);

		Pizza deluxePizza = new Pizza("Deluxe", 10.99f);
		deluxePizza.addTopping(toppingRepository.findById(1).get());
		deluxePizza.addTopping(toppingRepository.findById(2).get());
		deluxePizza.addTopping(toppingRepository.findById(3).get());
		deluxePizza.addTopping(toppingRepository.findById(6).get());
		deluxePizza.addTopping(toppingRepository.findById(7).get());
		deluxePizza.addTopping(toppingRepository.findById(8).get());
		deluxePizza.addTopping(toppingRepository.findById(9).get());
		pizzaRepository.save(deluxePizza);
	}

	@Test
	public void addToppings() {
		Topping pepperoni = new Topping("Pepperoni", 2.00f);
		Topping sausage = new Topping("Sausage", 2.00f);
		Topping beef = new Topping("Beef", 2.00f);
		Topping ham = new Topping("Ham", 2.00f);
		Topping bacon = new Topping("Bacon", 2.00f);
		Topping onion = new Topping("Onion", 2.00f);
		Topping greenPepper = new Topping("Green Pepper", 2.00f);
		Topping mushroom = new Topping("Mushroom", 2.00f);
		Topping olives = new Topping("Olives", 2.00f);
		Topping tomato = new Topping("Tomato", 2.00f);

		toppingRepository.save(pepperoni);
		toppingRepository.save(sausage);
		toppingRepository.save(beef);
		toppingRepository.save(ham);
		toppingRepository.save(bacon);
		toppingRepository.save(onion);
		toppingRepository.save(greenPepper);
		toppingRepository.save(olives);
		toppingRepository.save(mushroom);
		toppingRepository.save(tomato);
	}

}
