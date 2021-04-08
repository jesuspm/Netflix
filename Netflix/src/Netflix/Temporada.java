package Netflix;

import java.util.List;
import java.util.ArrayList;

public class Temporada {
	private int numero;
	private Serie serie; //Relacion bidireccional
	private List<Capitulo> capitulos;
	
	//Ejercicio 6 SERIE teenWolfT2C1
	public String listaCapitulos() {
		StringBuilder sb = new StringBuilder ();
		String titulo=this.serie.getTitulo();
		for(Capitulo cap:capitulos ) {
			sb.append(titulo+"T"+this.numero+"C"+cap.getNum());
		}
		
		//TeenWolfT2C1
		//TeenWolfT2C2
		//TeenWolfT2C3
		//TeenWolfT2C4
		//TeenWolfT2C5
		// ...
		return sb.toString();
	}
	
	public Temporada() {//por defecto
		capitulos = new ArrayList<Capitulo>();
	}
	
	public Temporada(int numero, Serie serie) {
		this.numero=numero;
		this.serie=serie;
		capitulos=new ArrayList<Capitulo>();
	}
	public boolean addCapitulo(Capitulo capitulo) {
		if(!capitulos.contains(capitulo)) {
			capitulos.add(capitulo);
			return true;
		}
		else
			return false;
	}
	
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie= serie;
 }
}