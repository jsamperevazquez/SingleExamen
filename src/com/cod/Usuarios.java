package com.cod;

public class Usuarios {
    public static void main(String[] args) {
        if (conectarbasedatos1("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        if (conectarBaseDatos2()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        ;
    }

    public static boolean conectarbasedatos1(String usuario) {
        BaseDatos usuario1 = new BaseDatos(usuario);
        System.out.println("Conectando a " + usuario1.ipServidor + ", con el usuario " + usuario);
        return usuario1.permitirConexion();
    }

    public static boolean conectarBaseDatos2() {
        BaseDatos usuario2 = new BaseDatos();
        System.out.println("Conectando a " + usuario2.ipServidor + ", con el usuario " + usuario2.correoElectronico);
        return usuario2.permitirConexion();
    }
}
