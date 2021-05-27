package seguro;
public class SeguroDeCoche extends Seguro {
    private String gamaVehiculo;

    @Override
    public int getN() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public double getTOTIND() {
        // TODO Auto-generated method stub
        return 500;
    }

    @Override
    public int getD1() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
	@Override
    public int getD2() {
        // TODO Auto-generated method stub
        return 1;
    }

    public SeguroDeCoche(String fechaContrato,
                         double cuotaAnualBase,
                         double descuentoORecargo,
                         Cliente cliente,
                         Parte partes,
                         Poliza poliza,
                         String gamaVehiculo) {
        super(fechaContrato, cuotaAnualBase, descuentoORecargo, cliente, partes, poliza);
        this.gamaVehiculo = gamaVehiculo;
    }
    public SeguroDeCoche() {
        super();
    }

}