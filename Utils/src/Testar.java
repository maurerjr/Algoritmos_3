public class Testar {
	
	public static void main(String[] args) {
			
			Teclado testa = new Teclado();
			
			int a;
			float b;
			double c;
			char d;
			String e;
			
			a=testa.lerInt();
			System.out.println(a);
			
			testa.lerInt("Testando o meu metodo", a);
			System.out.println(a);
			
			testa.lerInt(a);
			System.out.println(a);
			
			testa.lerInt("Testando o meu metodo");
			System.out.println(a);

			
			b=testa.lerFloat();
			System.out.println(b);
			
			testa.lerFloat("Testando o meu metodo", b);
			System.out.println(b);
			
			testa.lerFloat(b);
			System.out.println(b);
			
			testa.lerFloat("Testando o meu metodo");
			System.out.println(b);
			
			
			
			
			c=testa.lerDouble();
			System.out.println(c);
			
			testa.lerDouble("Testando o meu metodo", c);
			System.out.println(c);
			
			testa.lerDouble(c);
			System.out.println(c);
			
			testa.lerDouble("Testando o meu metodo");
			System.out.println(c);
			
			d=testa.lerChar();
			System.out.println(d);
			
			testa.lerChar("Testando o meu metodo", d);
			System.out.println(d);
			
			testa.lerChar(d);
			System.out.println(d);
			
			testa.lerChar("Testando o meu metodo");
			System.out.println(d);
			
			
			
			e=testa.lerString();
			System.out.println(e);
			
			testa.lerString("Testando o meu metodo", e);
			System.out.println(e);
			
			testa.lerString(e);
			System.out.println(e);
			
			testa.lerString2("Testando o meu metodo");
			System.out.println(e);
			
			
		}

	}
