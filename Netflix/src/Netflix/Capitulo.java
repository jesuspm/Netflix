package Netflix;

import java.util.ArrayList;

public class Capitulo {
	protected int duration;
	public final int DURATION=45;
	protected int num;
	protected Temporada temporada;
	protected ArrayList<Personaje> personajes;
	public Capitulo() {
	}
	
	public Capitulo(int num, Temporada temporada) {
		this.num=num;
		this.temporada=temporada;
	}
	public String listaPersonajes()  {
		StringBuffer sb=new StringBuffer();
		//String cadena="";
		for(Personaje per:personajes){
			sb.append(per); //-->Falta definir el toString en personaje
			//cadena+=per;
		}
		return sb.toString();
	}
	
}
