package teste;
	
public class Baskara {
		
	public int a;
	public int b;
	public int c;
	
	public Baskara(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}		
					
	public int calcularDelta(){
		int calc = 0;
		calc = (int) Math.pow(b, 2) - 4 * a * c;
		return (int) Math.sqrt(calc);
	}
			
	public int calcularX1(){
		return (-b + calcularDelta()) /2 * a;
	}
		
	public int calcularX2(){
		return (-b - calcularDelta()) /2 * a;
	}	
	
	@Override
	public String toString(){
		return "O valor de X1 = " + calcularX1() + "\n" + "O valor de X2 = " + calcularX2();
	}

}
