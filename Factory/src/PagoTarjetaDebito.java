public class PagoTarjetaDebito implements Pago{
    @Override
    public void crearPago() {
        System.out.println("Se ha procesado un pago en TarjetaDebito");
    }
}
