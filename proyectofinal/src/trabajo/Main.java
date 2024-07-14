package trabajo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String marca;
        String placa;
        boolean tipo = false;
        boolean traslado = false;
        int diaDePago;
        int emisionDePago;
        double valorLiquidacion = 0;
        int opcion1;
        List<Auto> autos = new ArrayList<>();
        ;
        int opcion;
        //menu inical para ingresar un carro y calcular los impuestos
        do {
            marca = JOptionPane.showInputDialog("Ingrese la marca de carro");
            placa = (JOptionPane.showInputDialog("Ingrese la placa"));
            do {
                opcion1 = Integer.parseInt(JOptionPane.showInputDialog("su carro es un transporte publico?\n (presione 1 para si o 2 para no)"));
                if (opcion1 != 1 && opcion1 != 2) {
                    JOptionPane.showMessageDialog(null, "opcion no valida");
                } else {
                    switch (opcion1) {
                        case 1:
                            tipo = true;
                            break;
                        case 2:
                            tipo = false;
                            break;
                    }
                }
            } while (opcion1 != 1 && opcion1 != 2);
            do {
                opcion1 = Integer.parseInt(JOptionPane.showInputDialog("su carro va a ser trasladado?\n (presione 1 para si o 2 para no)"));
                if (opcion1 != 1 && opcion1 != 2) {
                    JOptionPane.showMessageDialog(null, "opcion no valida");
                } else {
                    switch (opcion1) {
                        case 1:
                            traslado = true;
                            break;
                        case 2:
                            traslado = false;
                            break;
                    }
                }
            } while (opcion1 != 1 && opcion1 != 2);
            diaDePago = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de pago"));
            emisionDePago = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de la emision de pago"));
            //control de errores
            boolean continuar = true;
            do {
                try {
                    continuar = false;
                    valorLiquidacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la liquidacion"));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "opcion no valida");
                    continuar = true;

                }
            } while (continuar);


            Liquidacion auto = new Liquidacion(marca, placa, tipo, diaDePago, emisionDePago, valorLiquidacion, traslado);
            autos.add(auto);


            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n 1. Calcular todos los descuentos\n 2. ver los autos ingresados \n 3. salir"));
            switch (opcion) {
                case 1:
                    //calculo de descuentos del carro
                    auto.CalcularDescuentoProntoPago();
                    auto.CalcularDescuentoServicioPublico();
                    auto.CalcularDescuentotrasladoo();
                    JOptionPane.showMessageDialog(null, "actualmente debe pagar " + auto.getValorLiquidacion());

                    break;
                case 2:
                    //ver autos ingresados
                    StringBuilder carros = new StringBuilder("autos ingresados: ");
                    for (Auto a : autos) {
                        carros.append("Marca: ").append(auto.getMarca())
                                .append("\n")
                                .append("Placa: ").append(auto.getPlaca())
                                .append("\n")
                                .append("Valor a pagar: ").append(auto.getValorLiquidacion())
                                .append("\n");
                        JOptionPane.showMessageDialog(null,carros);
                        carros.setLength(0);

                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "fin del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "no existe esta opcion");
                    break;
            }
        } while (opcion != 4);
    }
}
