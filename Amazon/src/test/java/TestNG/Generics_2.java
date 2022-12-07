package TestNG;

public class Generics_2 <R, L, K>{
	
	R b;
	L c;
	K d;
	
	R test(L s) {  
	
		return b;
	}
    
	public static void main(String[] args) {
		
		Generics_2<Integer, String, String> g = new Generics_2<Integer, String, String>();
		
		g.b=78;
		g.c="velocity";
		g.d="SQL";
		
		System.out.println(g.b+" "+g.c+" "+g.d);
		
	}
}
