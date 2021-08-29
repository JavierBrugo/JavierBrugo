package ponyexpress;

public class Ruta {

	public Ruta() {
		super();
	}

	public int caballos(int[] distancias) {

		distanciaValidacion(distancias);
		return calculoDistancia(distancias);
	}
// Calcula la cantidad de caballos para recorrer la distancia total.
	private int calculoDistancia(int[] distancias) {
		int millasRecorridas = 0;
		int caballosTotales = 1;
		int i = 0;
		while (i < distancias.length) {

			millasRecorridas += distancias[i];
			i++;

			if (millasRecorridas > Caballo.getCantidadmillasmaximo()) {
				millasRecorridas = 0;
				caballosTotales++;
				i--;
			}

		}
		return caballosTotales;
	}
// Valida que la distancia no sea menor a 0 ni mayor a la distancia maxima que puede recorrer un caballo.
	private void distanciaValidacion(int[] distancias) throws Error {
		for (int distancia : distancias) {
			if (distancia > Caballo.getCantidadmillasmaximo() || distancia < 0) {
				throw new Error("La cantidad de millas no puede ser mayor a " + " " + Caballo.getCantidadmillasmaximo()
						+ " " + "ni menor a 0");
			}
		}
	}
}
