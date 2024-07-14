package trabajo;

import javax.swing.*;

public class Liquidacion extends Auto {
    public double descuentos = 0;

    public Liquidacion(String marca,  String placa, boolean tipo, int diaDePago, int emisionDePago, double liquidacion, boolean traslado) {
        super(marca, placa, tipo, diaDePago, emisionDePago, liquidacion, traslado);
    }

    public void CalcularDescuentoServicioPublico() {
        JOptionPane.showMessageDialog(null, "Calcular Impuesto por transporte publico");
        if (getTipo() == true) {
            JOptionPane.showMessageDialog(null, "descuento por transporte publico= 5%");
            descuentos = getValorLiquidacion() * descuentoServicioPublico;
            setValorLiquidacion(descuentos);
            JOptionPane.showMessageDialog(null, "debe pagar actualmente: " + getValorLiquidacion());
        }
    }

    public void CalcularDescuentoProntoPago() {
        JOptionPane.showMessageDialog(null, "Calcular Impuesto de pronto pago");
        if (15 > (getDiaDePago() - getEmisionDePago())) {
            JOptionPane.showMessageDialog(null, "descuento por pronto pago= 10%");
            descuentos = getValorLiquidacion() * descuentoProntoPago;
            setValorLiquidacion(descuentos);
            JOptionPane.showMessageDialog(null, "debe pagar actualmente: " + getValorLiquidacion());
        }
    }

    public void CalcularDescuentotrasladoo() {
        JOptionPane.showMessageDialog(null, "Calcular Impuesto por traslado");
        if (getTraslado() == true) {
            JOptionPane.showMessageDialog(null, "descuento por traslado = 15% ");
            descuentos = getValorLiquidacion() * descuentoTraslado;
            setValorLiquidacion(descuentos);
            JOptionPane.showMessageDialog(null, "debe pagar actualmente: " + getValorLiquidacion());
        }
    }
}
