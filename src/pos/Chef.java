package pos;

public class Chef  extends Thread{
	Pizza pizza;
	ChefListener listener;
	
	public Chef(Pizza pizza, ChefListener listener) {
		super();
		this.pizza = pizza;
		this.listener = listener;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep((long) (pizza.getCookingTime()*1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		listener.pizzaCooked(pizza);
	}
	
	

}
