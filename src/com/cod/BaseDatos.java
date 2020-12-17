package com.cod;

/**
 * @author angel
 * @version 1.0
 * Clase para crear métodos de comprobar acceso
 */
public class BaseDatos {
    /**
     * Correo electrónico
     */
    String correoElectronico = "";
    /**
     * Ip del servidor
     */
    String ipServidor = "127.0.0.2";

    // Creo mi unica instancia  y la inicializo en null
    /**
     * Unica instacia  con Singleton
     */
    private static BaseDatos instance = null;

    // Cambio el constructor a privado para poder bloquearlo.

    private BaseDatos() {
        correoElectronico = "anonymous@danielcastelao.org";
    }
 // Creo un método que comprueba si instance es null, si no es null ya fe creado y lo devuelve

    /**
     * Método para comprobar si una instancia es nula y lo es la crea.
     * @return retorna la instancia
     */
    public static BaseDatos getInstance() {
        if (instance == null){
            instance = new BaseDatos();

        }
       // retorna la instancia
        return instance;
    }

    /**
     * Método para permitir o no la conexión a la base de datos.
     * @return retorna 1 o 0
     */
    public boolean permitirConexion() {
        if (correoElectronico != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
