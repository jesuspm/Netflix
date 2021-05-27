package seguro;

public class Empresa extends Cliente {

    private String nombreComercial;

    public Empresa(String nif,
                   String direccion,
                   String telefono,
                   String clienteDesde,
                   String nombreComercial) {
        super(nif, direccion, telefono, clienteDesde);
        this.nombreComercial = nombreComercial;
    }
    public Empresa() {
        super();
    }

}