package seguro;

public class SeguroDeHogar extends Seguro {

    private String tipoVivienda;

    public SeguroDeHogar(String fechaContrato,
                         double cuotaAnualBase,
                         double descuentoORecargo,
                         Cliente cliente,
                         Parte partes,
                         Poliza poliza,
                         String tipoVivienda) {
        super(fechaContrato, cuotaAnualBase, descuentoORecargo, cliente, partes, poliza);
        this.tipoVivienda = tipoVivienda;
    }
    public SeguroDeHogar() {
        super();
    }

    @Override
    public int getN() {
        return 2;
    }

    @Override
	@Override
    public double getTOTIND() {
        return 700;
    }

    @Override
    public int getD1() {
        return 5;
    }

    @Override
    public int getD2() {
        return 2;
    }
}