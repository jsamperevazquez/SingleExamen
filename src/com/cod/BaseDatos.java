package com.cod;

public class BaseDatos {
    String usuarioAnonimo = "";
    String ipServidor = "127.0.0.2";

    BaseDatos() {
        usuarioAnonimo = "anonymous@danielcastelao.org";
    }

    BaseDatos(String nombreUsuario) {
        this.usuarioAnonimo = nombreUsuario;
    }

    public boolean permitirConexion() {
        if (usuarioAnonimo != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
