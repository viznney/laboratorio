/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Andres
 */
public class UsuarioLab extends Entidad {
    String contraseña;
    String usuario;
    EstadoUsuario estadoUsuario;
    PermisoUsuario permisoUsuario;

    public UsuarioLab() {
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public EstadoUsuario getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(EstadoUsuario estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public PermisoUsuario getPermisoUsuario() {
        return permisoUsuario;
    }

    public void setPermisoUsuario(PermisoUsuario permisoUsuario) {
        this.permisoUsuario = permisoUsuario;
    }
}
