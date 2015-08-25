import java.util.Scanner;

public class Teclado {

Scanner tc = new Scanner(System.in);
	
	public int lerInt(){
		System.out.println("Digite um inteiro");
		return tc.nextInt();
	}
	
	public void lerInt(String a, int b){
		System.out.println(a);
		b= tc.nextInt();
	}
	public void lerInt(int b){
		System.out.println("Digite um inteiro");
		b= tc.nextInt();
	}
	public void lerInt(String a){
		System.out.println(a);
		tc.nextInt();
	}

//////////////////////////////////////////////////////////////////
	public String lerString(){
		System.out.println("Digite uma String: ");		
		return tc.next();
	}
	public void lerString(String a, String b){
		System.out.println(a);
		b= tc.next();
	
	}
	public void lerString(String b){
		System.out.println("Digite uma String: ");		
		b= tc.next();
	}
	public void lerString2(String a){
		System.out.println(a);
		tc.next();
	
	}
	

///////////////////////////////////////////////////////////////////
	
	public double lerDouble(){
		System.out.println("Digite um Double: ");		
		return tc.nextDouble();
	}
	public void lerDouble(String a, double b){
		System.out.println(a);
		b= tc.nextDouble();
		
	}
	public void lerDouble(double b){
		System.out.println("Digite um Double: ");		
		b= tc.nextDouble();
	}
	public void lerDouble(String a){
		System.out.println(a);		
		tc.nextDouble();
	}
	
	
///////////////////////////////////////////////////////////////////////
	
	public float lerFloat(){
		System.out.println("Digite um Float: ");		
		return tc.nextFloat();
	}
	public void lerFloat(String a, float b){
		System.out.println("Digite um Float: ");
		b= tc.nextFloat();
	}
	public void lerFloat(float b){
		System.out.println("Digite um Float: ");
		b= tc.nextFloat();
	}
	public void lerFloat(String a){
		System.out.println("Digite um Float: ");
		tc.nextFloat();
	}

////////////////////////////////////////////////////////////////////////
	public char lerChar(){
		System.out.println("Digite um Char: ");

		return tc.next().charAt(0);
	}
	public void lerChar(String a, char b){
		System.out.println("Digite um Char: ");	
		b= tc.next().charAt(0);
		
	}
	public void lerChar(char b){
		System.out.println("Digite um Char: ");	
		b= tc.next().charAt(0);
		
	}
	public void lerChar(String a){
		System.out.println("Digite um Char: ");	
		tc.next().charAt(0);
		}
}

