package trabajo;

import java.io.Serializable;

public class Auto implements Descuentos {
    private String marca;
    private String placa;
    private boolean tipo;
    private boolean traslado;
    private int diaDePago;
    private int emisionDePago;
    private double valorLiquidacion;

    public boolean getTraslado() {
        return traslado;
    }

    public void setTraslado(boolean traslado) {
        this.traslado = traslado;
    }

    public double getValorLiquidacion() {
        return valorLiquidacion;
    }

    public void setValorLiquidacion(double valorLiquidacion) {
        this.valorLiquidacion = valorLiquidacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEmisionDePago() {
        return emisionDePago;
    }

    public void setEmisionDePago(int emisionDePago) {
        this.emisionDePago = emisionDePago;
    }

    public int getDiaDePago() {
        return diaDePago;
    }

    public void setDiaDePago(int diaDePago) {
        this.diaDePago = diaDePago;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Auto(String marca, String placa, boolean tipo, int diaDePago, int emisionDePago, double valorLiquidacion, boolean traslado) {
        this.marca = marca;
        this.placa = placa;
        this.tipo = tipo;
        this.diaDePago = diaDePago;
        this.emisionDePago = emisionDePago;
        this.valorLiquidacion = valorLiquidacion;
        this.traslado = traslado;
    }

    public void CalcularDescuentoServicioPublico() {
    }

    public void CalcularDescuentoProntoPago() {
    }

    public void CalcularDescuentotrasladoo() {
    }
}
