package com.example;

public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        float cantidad=1000;
        extracted(miCuenta,cantidad);
    }

    private static void extracted(CCuenta miCuenta, float cantidad) {
        try {
            miCuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
