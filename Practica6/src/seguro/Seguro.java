package seguro;
import java.util.ArrayList;

public abstract class Seguro {
    protected String fechaContrato;
    protected double cuotaAnualBase;
    protected double descuentoORecargo;
    protected Cliente cliente;
    protected ArrayList<Parte> partes = new ArrayList<Parte>();
    protected Poliza poliza;


    public int numPartesEnAnyo(int anyo) {
        int res = 0;
        for (Parte parte: partes) {
            if(Fecha.getAnyoDeFecha(parte.getFecha())==anyo) 
            	res ++;
        }
       return res; 
    }
	 


   public double costeIncidenciasEnAnyo(int anyo) {
	double res=0;
	for(Parte parte: partes)
		if (Fecha.getAnyoDeFecha(parte.getFecha()) ==anyo)
			res += parte.getCosteIndemnizacion();
		return res;
   }
   
   public abstract int getN();

    public Seguro(String fechaContrato, double cuotaAnualBase, double descuentoORecargo, Cliente cliente,
            Parte partes, Poliza poliza) {
        super();
        this.fechaContrato = fechaContrato;
        this.cuotaAnualBase = cuotaAnualBase;
        this.descuentoORecargo = descuentoORecargo;
        this.cliente = cliente;
        //this.partes = new ArrayList<Parte>();
        this.poliza = poliza;
    }
    public Seguro() {

    }
    
    public void actualizarDescuentoORecargo() {
    	if (numPartesEnAnyo(Fecha.getAnyoDeFecha(Fecha.getFechaDeHoy()) -1)==GetN) ||
    	costeIncidenciasEnAnyo(Fecha.getAnyoDeFecha(Fecha.getFechaDeHoy()-1)>getTOTIND()){
    	descuentoORecargo += getD1();
    	}
    	else if (numPartesEnAnyo(Fecha.getAnyoDeFecha(Fecha.getFechaDeHoy())-1)==0)
    		descuentoORecargo -= getD2();
    	if (descuentoORecargo>25) descuentoORecargo=25;
    	else if (descuentoORecargo<-15)
    		descuentoORecargo=-15;
    }



	public int getD2() {
		// TODO Auto-generated method stub
		return 0;
	}



	public double getTOTIND() {
		// TODO Auto-generated method stub
		return 0;
	}

}