package examen;

public class SegundaParte {

	public static void main(String[] args) {

		Coche miCoche = new Coche();

		miCoche.incrementarCantidadPuertas();
		miCoche.incrementarCantidadPuertas();

		System.out.println(miCoche.getPuertas());

	}

}
