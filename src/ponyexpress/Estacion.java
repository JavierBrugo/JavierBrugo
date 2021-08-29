package ponyexpress;

public class Estacion {
	private int milla;
	Estacion(int milla){
		this.setMilla(milla);
	}
	Estacion(){
		super();
	}
	private void setMilla(int milla) {
		if (milla > Caballo.getCantidadmillasmaximo()){
			throw new Error( "La cantidad de millas no puede ser mayor a "+" " + Caballo.getCantidadmillasmaximo());
		}
		this.milla = milla;
	}
	public int getMilla(){
		return this.milla;
	}
}
