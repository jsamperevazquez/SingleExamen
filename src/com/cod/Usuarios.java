package com.cod;

/**
 * @author angel
 * @version 1.0
 * Clase para instanciar objetos de tipos usuario en BaseDatos
 */
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

    /**
     * Metodo para crear usuario y comprobar conexión
     * @param usuario Recibe un usario como parámetro
     * @return retorna un bool valido o fallo
     */
    public static boolean conectarbasedatos1(String usuario) {
        // Creo los usuarios con el método estático de la subclase getInstance.
        BaseDatos usuario1 = BaseDatos.getInstance();
        System.out.println("Conectando a " + usuario1.ipServidor + ", con el usuario " + usuario);
        return usuario1.permitirConexion();
    }

    /**
     * Mismo que el anterior pero con otro usuario
     * @return
     */
    public static boolean conectarBaseDatos2() {
        BaseDatos usuario2 = BaseDatos.getInstance();
        System.out.println("Conectando a " + usuario2.ipServidor + ", con el usuario " + usuario2.correoElectronico);
        return usuario2.permitirConexion();
    }
}
