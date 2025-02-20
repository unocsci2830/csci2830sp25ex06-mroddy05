package pizza;
import java.util.Scanner;

import pizza.crust.ThickCrust;
import pizza.crust.ThinCrust;
import pizza.sauce.Alfredo;
import pizza.sauce.Tomato;
import pizza.topping.Bacon;
import pizza.topping.Cheddar;
import pizza.topping.Chicken;
import pizza.topping.GreenOnions;
import pizza.topping.Mozzarella;
import pizza.topping.Olives;
import pizza.topping.Onions;
import pizza.topping.Parmesan;
import pizza.topping.PepperJack;
import pizza.topping.Pepperoni;
import pizza.topping.Peppers;
import pizza.topping.Sausage;

public class PizzaMain {
        private Pizza pizza;
        private Scanner input;
        

        public PizzaMain() {
                pizza = new Pizza();
                input = new Scanner(System.in);
        }

        private void inputCrustChoice() {
                boolean wrongChoice = false;
                Integer choice = 0;
		ThickCrust thickCrust = null;

                System.out.println("What kind of crust would you like: ");
                System.out.println("1 - Thin Crust");
                System.out.println("2 - Thick Crust");
                System.out.println("Your choice: ");
                while (true){
                        choice = input.nextInt();
                        if (choice == 1) {
                                pizza.setCrust(new ThinCrust());
                                break;
                        }
                        else if (choice == 2) {
                                thickCrust = new ThickCrust();
                                pizza.setCrust(thickCrust);
                                break;
                        }
                        else {
                                System.out.println("Your choice must be 1 or 2");
                        }
                }


                System.out.println("Select crust ingredient:");
		System.out.println("1 - Flour");
		System.out.println("2 - Cauliflower");
		System.out.print("Your choice: ");
                while (true) {
                        Integer ingChoice = input.nextInt();
                        if (ingChoice == 1) {
                                pizza.getCrust().setIngredient("Flour");
                                break;
                        }
                        else if (ingChoice == 2) {
                                pizza.getCrust().setIngredient("Cauliflower");
                                break;
                        }
                        else {
                                System.out.println("Your choice must be 1 or 2");
                        }
                }

                if (choice == 2) {
			System.out.print("Deep Dish? (Y/N)");
			do {
				String deepDishChoice = input.next();
				switch(deepDishChoice) {
					case "Y": 
					case "y":
						thickCrust.setIsDeepDish(true);
                                                wrongChoice = false;
						break;
					case "N": 
					case "n":
						thickCrust.setIsDeepDish(false);
                                                wrongChoice = false;
						break;
					default:
						System.out.println("Pick between Y or N");
                                                wrongChoice = true;

				}
			} while(wrongChoice);
			
		}
        }

        private void inputSauceChoice() {
                System.out.println("What kind of sauce would you like:");
		System.out.println("1 - Tomato Sauce");
		System.out.println("2 - Alfredo Sauce");
		System.out.print("Your choice: ");

                while (true) {
                        int sauceChoice = input.nextInt();
                        if (sauceChoice == 1) {
                                pizza.setSauce(new Tomato());
                                break;
                        }
                        else if (sauceChoice == 2) {
                                pizza.setSauce(new Alfredo());
                                break;
                        }
                        else {
                                System.out.println("Your choice must be 1 or 2"); 
                        }
                
                }
        }

        private void inputToppingChoices() {
                Boolean wrongChoice = false;
                System.out.println("\nHow many toppings do you want? (Up to 4): ");
                Integer toppingAmount = input.nextInt();
                while (true){
                        if (toppingAmount < 0){
                                System.out.println("Amount of toppings needs to be more than 0");
                                System.out.println("\nHow many toppings do you want? (Up to 4): ");
                                toppingAmount = input.nextInt();
                        }
                        else if (toppingAmount > 4) {
                                System.out.println("Amount of toppings can't be more than 4");
                                System.out.println("\nHow many toppings do you want? (Up to 4): ");
                                toppingAmount = input.nextInt();
                        }
                        else {
                                break;
                        }
                }
                for (int i = 0; i < toppingAmount; i++) {
                        System.out.println("1 - Sausage");
                        System.out.println("2 - Pepperoni");
                        System.out.println("3 - Bacon");
                        System.out.println("4 - Chicken");
                        System.out.println("5 - Mozzarella");
                        System.out.println("6 - Parmesan");
                        System.out.println("7 - Cheddar");
                        System.out.println("8 - PepperJack");
                        System.out.println("9 - Green Onions");
                        System.out.println("10 - Olives");
                        System.out.println("11 - Peppers");
                        System.out.println("12 - Onions");
                        
                        do {    
                                wrongChoice = false;
                                System.out.println("Your choice: ");
                                int toppingChoice = input.nextInt();

                                switch (toppingChoice) {
                                        case 1: pizza.addTopping(new Sausage());
                                                break;
                                        case 2: pizza.addTopping(new Pepperoni());
                                                break;
                                        case 3: pizza.addTopping(new Bacon());
                                                break;
                                        case 4: pizza.addTopping(new Chicken());
                                                break;
                                        case 5: pizza.addTopping(new Mozzarella());
                                                break;
                                        case 6: pizza.addTopping(new Parmesan());
                                                break;
                                        case 7: pizza.addTopping(new Cheddar());
                                                break;
                                        case 8: pizza.addTopping(new PepperJack());
                                                break;
                                        case 9: pizza.addTopping(new GreenOnions());
                                                break;
                                        case 10: pizza.addTopping(new Olives());
                                                break;
                                        case 11: pizza.addTopping(new Peppers());
                                                break;
                                        case 12: pizza.addTopping(new Onions());
                                                break;
                                        default:
                                                wrongChoice = true;
                                                System.out.println("Must enter a choice 1 - 12, last choice not valid.");
                                                break;
                                        }
                                }while (wrongChoice);
                }
        }

        private void showPizza() {
                pizza.display();
                System.out.println(pizza.getCrust().checkIntegrity());
        }

        public void runMenu() {
                inputCrustChoice();
                inputSauceChoice();
                inputToppingChoices();
                showPizza();
        }

        public static void main(String[] args) {
                PizzaMain pm = new PizzaMain();
                pm.runMenu();
        }
}