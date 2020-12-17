package com.cod;

public class BaseDatos {

    String correoElectronico = "";
    String ipServidor = "127.0.0.2";

    // Creo mi unica instancia  y la inicializo en null
    private static BaseDatos instance = null;

    // Cambio el constructor a privado para poder bloquearlo.

    private BaseDatos() {
        correoElectronico = "anonymous@danielcastelao.org";
    }
 // Creo un método que comprueba si instance es null, si no es null ya fe creado y lo devuelve
    public static BaseDatos getInstance() {
        if (instance == null){
            instance = new BaseDatos();

        }
       // retorna la instancia
        return instance;
    }

    public boolean permitirConexion() {
        if (correoElectronico != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
