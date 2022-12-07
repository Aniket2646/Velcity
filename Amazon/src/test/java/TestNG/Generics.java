package TestNG;

public class Generics <R>{
	
	int a;
	R b;
	
	public static void main(String[] args) {
		
		Generics<Integer> g = new Generics  <Integer>();
		g.a=56;
		g.b=78;
		
		System.out.println(g.b);
		

		Generics<String> t = new Generics  <String>();
		t.b = "Velocity";
		
		System.out.println(t.b);
		System.out.println(g.b);
		
		Generics<Float> s = new Generics  <Float>();
		s.b = 56.98f;
		
		System.out.println(s.b);
		System.out.println(g.b);
		
	}
	
}
