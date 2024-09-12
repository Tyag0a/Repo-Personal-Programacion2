package co.edu.uniquindio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
}

//Ejemplo PATRON PROTOTYPE:

//Interface:

// public interface IPrototypeCuenta extends Cloneable{
//    IPrototypeCuenta clone();
//}

//Clase:

//public class CuentaAH implements IPrototypeCuenta{
//
//    private String tipo;
//    private double monto;
//
//    public CuentaAH() {
//        tipo = "AHORRO";
//    }
//
//    @Override
//    public IPrototypeCuenta clone() {
//        CuentaAH cuenta = null;
//
//        try {
//            cuenta  = (CuentaAH) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return cuenta;
//    }
//
//    @Override
//    public String toString() {
//        return "CuentaAH [tipo=" + tipo + ", monto=" + monto + "]";
//    }
//
//    public String getTipo() {
//        return tipo;
//    }
//
//    public void setTipo(String tipo) {
//        this.tipo = tipo;
//    }
//
//    public double getMonto() {
//        return monto;
//    }
//
//    public void setMonto(double monto) {
//        this.monto = monto;
//    }
//}

//Ejemplo PATRON FACTORY METHOD: