package TestNG;

public class Generics_1 <R, L>{
	
	int a;
	R b;
	
	public static void main(String[] args) {
		
	
	Generics_1<Integer, String> g = new Generics_1 <Integer, String>();
	
	g.a=56;
	g.b =78;
	
	System.out.println(g.b);
	
	}
}
