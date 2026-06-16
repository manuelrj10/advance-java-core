package design_pattern;

public abstract class Plan {
	 protected double rate;
	 abstract void fixRate();
	 public void calculate(int units) {
		 System.out.println(rate*units);
		 
	 }
}
