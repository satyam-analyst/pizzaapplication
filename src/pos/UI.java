package pos;

import javax.swing.JOptionPane;

public class UI implements ChefListener {

	public static void main(String[] args) {
		UI ui = new UI();
		for(int i=0;i<5;i++)
		ui.prompt();
		
		
		
	}
	public void prompt() {
		Pizza ct=new Pizza("Chees and Tomato",2,5);
		Pizza bbq =new Pizza("BBQ",5,5);
		Pizza vs =new Pizza("Vegeterian Supreme",12,8);
		
		Pizza[] availablePizzas = new Pizza[] {ct, bbq, vs};
		for(Pizza pizza:availablePizzas) {
			System.out.println(pizza.getName());
			
		}
		int choice = Integer.parseInt(JOptionPane.showInputDialog(null,"Choose your pizza: "));
		Pizza selection = availablePizzas[choice];
		ChefListener ui = null;
		Chef chef =new Chef(selection,this);
		chef.start();
	

	}
	@Override
	public void pizzaCooked(Pizza pizza) {
		// TODO Auto-generated method stub
		System.out.println(pizza.getName()+""
				+ "pizza has been cooked. Enjoy ");
		
		
	}

}
