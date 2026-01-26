package ExamenObjetos;

public class MainCuentaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaBancaria cuenta1 = new CuentaBancaria ();
		
		cuenta1.setTitular("Marcos");
		
		cuenta1.modificarSaldo(5000);
		
		System.out.println(cuenta1);
		
		System.out.println("Si añadimos 3000 céntimos, la cuenta quedaría con: " + cuenta1.verCalcularModificacionSaldo(3000) + "céntimos");
		
		System.out.println("El número de billetes de 20 es igual a: " + cuenta1.calcularBilletesVeinte());
	}

}