package trabajo;

public interface Descuentos {
//decalracion de metodos y variables en la interfaz
    public static final double descuentoProntoPago = 0.9;
    public static final double descuentoTraslado = 0.85;
    public static final double descuentoServicioPublico = 0.95;

    public void CalcularDescuentoServicioPublico();

    public void CalcularDescuentoProntoPago();

    public void CalcularDescuentotrasladoo();

}
