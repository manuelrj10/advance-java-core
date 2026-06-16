package design_pattern;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the plan");
		String plan=sc.nextLine();
		System.out.println("enter the unit");
		int unit=sc.nextInt();
		GenPlanFactory genPlan=new GenPlanFactory();
		Plan planName=genPlan.getPlan(plan);
		planName.fixRate();
		planName.calculate(unit);
		sc.close();
		
		
	
	}

}
