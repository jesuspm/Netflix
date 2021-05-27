package seguro;

public class Persona extends Cliente {
    private String nombre;
    private String apellidos;

    public Persona(String nif, 
                   String direccion, 
                   String telefono, 
                   String clienteDesde, 
                   String nombre,
                   String apellidos) {
        super(nif, direccion, telefono, clienteDesde);
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public Persona() {
        super();
    }
}