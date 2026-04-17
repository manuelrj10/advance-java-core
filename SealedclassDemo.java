package jdk17pack;



sealed class Shape permits Circle,Square{
	public void draw() {
		System.out.println("drwing shape");
	}
}

final class Circle extends Shape{
	public void draw() {
		System.out.println("drwing circle");
	}
}

final class Square extends Shape {
	public void draw() {
		System.out.println("drwing square");
	}
}


public class SealedclassDemo {

	public static void main(String[] args) {
		Shape s1=new Circle();
		Shape s2=new Square();
		
		

	}

}
