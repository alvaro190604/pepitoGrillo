package Ejercicios;

public class MainCircunferenciaEj5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circunferencia circulo = new Circunferencia(6);
		
		System.out.println(circulo);
		System.out.println(circulo.calcularDiametro());
		System.out.println(circulo.calcularArea());
		System.out.println(circulo.calcularLongitud());
		System.out.println(circulo.getRadio());
		circulo.setRadio(4);
		System.out.println(circulo);
	}

}
