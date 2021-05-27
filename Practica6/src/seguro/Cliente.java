package seguro;

import java.util.ArrayList;

public class Cliente {
    protected String nif;
    protected String direccion;
    protected String telefono;
    protected String clienteDesde;
    ArrayList<Seguro> seguros = new ArrayList<Seguro>();

    public Cliente(String nif, String direccion, String telefono, String clienteDesde) {
        this.nif = nif;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clienteDesde = clienteDesde;
    }
    public Cliente() {

    }

}