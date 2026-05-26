package com.example;

public class XestorTemperaturas {

    private double temperaturaActual;

    public XestorTemperaturas(double temperaturaInicial) {
        temperaturaActual = temperaturaInicial;
    }

    public void aumentarTemperatura(double incremento) {

        if (incremento > 0) {
            temperaturaActual = temperaturaActual + incremento;
        }

    }

    public void reducirTemperatura(double reducion) {

        if (reducion > 0) {
            temperaturaActual = temperaturaActual - reducion;
        }

    }

    public double getTemperaturaActual() {
        return temperaturaActual;
    }

    public boolean estaConxelada() {

        if (temperaturaActual <= 0) {
            return true;
        } else {
            return false;
        }

    }

    public String obterEstado() {

        if (temperaturaActual < 0) {
            return "Conxelada";
        }

        if (temperaturaActual >= 0 && temperaturaActual < 25) {
            return "Fría";
        }

        if (temperaturaActual >= 25 && temperaturaActual < 60) {
            return "Normal";
        }

        return "Quente";
    }
}