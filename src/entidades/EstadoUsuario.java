/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author viznney
 */
public class EstadoUsuario extends Entidad{
    int codEstadoUsuario;
    String nombreEstadoUsuario;

    public EstadoUsuario() {
    }

    public int getCodEstadoUsuario() {
        return codEstadoUsuario;
    }

    public void setCodEstadoUsuario(int codEstadoUsuario) {
        this.codEstadoUsuario = codEstadoUsuario;
    }

    public String getNombreEstadoUsuario() {
        return nombreEstadoUsuario;
    }

    public void setNombreEstadoUsuario(String nombreEstadoUsuario) {
        this.nombreEstadoUsuario = nombreEstadoUsuario;
    }
}