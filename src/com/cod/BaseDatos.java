package com.cod;

public class BaseDatos {

    String correoElectronico = "";
    String ipServidor = "127.0.0.2";

    BaseDatos() {
        correoElectronico = "anonymous@danielcastelao.org";
    }

    BaseDatos(String correoUsuario) {
        this.correoElectronico = correoUsuario;
    }

    public boolean permitirConexion() {
        if (correoElectronico != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
