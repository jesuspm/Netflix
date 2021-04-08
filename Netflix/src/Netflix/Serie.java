package Netflix;


import java.util.List;
import java.util.ArrayList;


public class Serie {
	private String titulo;//"walking dead"
	private List<Temporada> temporadas = new ArrayList<Temporada>();
	///////////////NO REFACTORING MINUTOS SERIE//////////////
	public void duraciontotalserie() {	
		int duracion=0;
		for(Temporada temporada: temporadas) {
			ArrayList<Capitulo> capitulos=temporada.getCapitulos();
			for(Capitulo capitulo:capitulos) {
				duracion+=capitulo.getDuracion();
			}
		}
		System.out.print("La duracion de la serie es "+duracion);
	}
	///////////////CON REFACTORING/////////////////////////////
	public void duraciontotalserieCON() {	
		int duracion=0;
		for(Temporada temporada: temporadas) {
			duracion+=temporada.getMinutosTemporada();
		}
		System.out.print("La duracion de la serie es "+duracion);
	}
	
	
	////////////////////////////////////////////////////////
	public Serie(String titulo, List<Temporada> temporadas) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
	}

	public Serie(String titulo, List<Temporada> temporadas) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
	}

	public void addTemporada(Temporada temporada) {
		temporadas.add(temporada);
		temporada.setSerie(this);
	}
	public Serie() {
		super();
		
	}
	
	
	
	

}
