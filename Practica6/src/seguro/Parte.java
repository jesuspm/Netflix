package seguro;

public class Parte {
    private String descripcion;
    private String informe;
    private double consteIndemnizacion;
    private String fechaIncidencia;
    private Seguro seguro;

    public Parte(String descripcion, String informe, double consteIndemnizacion, String fechaIncidencia,
            Seguro seguro) {
        this.descripcion = descripcion;
        this.informe = informe;
        this.consteIndemnizacion = consteIndemnizacion;
        this.fechaIncidencia = fechaIncidencia;
        this.seguro = seguro;
    }
    public Parte() {
    }
    public String getFecha() {
        return fechaIncidencia;
    }
    public void setFecha(String fechaIncidencia) {
        this.fechaIncidencia = fechaIncidencia;
    }
	public double getConsteIndemnizacion() {
		return consteIndemnizacion;
	}
	public void setConsteIndemnizacion(double consteIndemnizacion) {
		this.consteIndemnizacion = consteIndemnizacion;
	}

	

}