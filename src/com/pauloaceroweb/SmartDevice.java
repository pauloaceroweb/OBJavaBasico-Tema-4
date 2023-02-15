package com.pauloaceroweb;

public class SmartDevice {

    String marca;
    String modelo;
    String color;
    int memoriaInterna;
    double pantalla;

    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, String color, int memoriaInterna, double pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.memoriaInterna = memoriaInterna;
        this.pantalla = pantalla;
    }


    public static class SmartPhone extends SmartDevice {
        int memoriaRam;
        int camaraMpx;
        String sistemaOperativo;

        public SmartPhone() {
        }

        public SmartPhone(String marca, String modelo, String color, int memoriaInterna, double pantalla, int memoriaRam, int camaraMpx, String sistemaOperativo) {
            super(marca, modelo, color, memoriaInterna, pantalla);
            this.memoriaRam = memoriaRam;
            this.camaraMpx = camaraMpx;
            this.sistemaOperativo = sistemaOperativo;
        }

        @Override
        public String toString() {
            return  '\n' +
                    "Memoria Ram: " + memoriaRam + " GB" + '\n' +
                    "Camara Frontal: " + camaraMpx + " Mpx" + '\n' +
                    "Sistema Operativo: '" + sistemaOperativo + '\'' + '\n' +
                    "Marca: '" + marca + '\'' + '\n' +
                    "Modelo: '" + modelo + '\'' + '\n' +
                    "Color: '" + color + '\'' + '\n' +
                    "Memoria Interna: " + memoriaInterna + " GB" + '\n' +
                    "Pantalla: " + pantalla + " pulgadas";
        }
    }

    public static class SmartWatch extends SmartDevice {
        String conexion;
        boolean resistenciaAgua;

        public SmartWatch() {
        }

        public SmartWatch(String marca, String modelo, String color, int memoriaInterna, double pantalla, String conexion, boolean resistenciaAgua) {
            super(marca, modelo, color, memoriaInterna, pantalla);
            this.conexion = conexion;
            this.resistenciaAgua = resistenciaAgua;
        }

        @Override
        public String toString() {
            return  '\n' +
                    "Conexión: '" + conexion + '\''+ '\n' +
                    "Resistencia al Agua: " + resistenciaAgua + '\n' +
                    "Marca: '" + marca + '\'' +  '\n' +
                    "Modelo: '" + modelo + '\'' + '\n' +
                    "Color: '" + color + '\'' + '\n' +
                    "Memoria Interna: " + memoriaInterna + " GB" + '\n' +
                    "Pantalla: " + pantalla + " pulgadas";
        }
    }

    public static void main(String[] args) {
        SmartDevice smartPhone = new SmartPhone(
                "Motorola",
                "Edge 30 Ultra",
                "Negro",
                128,
                6.28,
                8,
                200,
                "Android" );

        SmartDevice smartWatch = new SmartWatch(
                "Huawei",
                "GT3 Pro 46 MM",
                "Blanco",
                32,
                1.4,
                "Bluetooth",
                true );

        System.out.println("******************************");
        System.out.println("SmartPhone: " + smartPhone);
        System.out.println("******************************");
        System.out.println("SmartWatch: " + smartWatch);
    }
}
