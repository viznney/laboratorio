package entidades;

/**
 * @author DANI
 * @version 1.0
 * @created 03-abr.-2017 17:41:06
 */
public class PermisoUsuario extends Entidad {

	private int codPermiso;
	private String nombrePermiso;

	public PermisoUsuario(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

    public int getCodPermiso() {
        return codPermiso;
    }

    public void setCodPermiso(int codPermiso) {
        this.codPermiso = codPermiso;
    }

    public String getNombrePermiso() {
        return nombrePermiso;
    }

    public void setNombrePermiso(String nombrePermiso) {
        this.nombrePermiso = nombrePermiso;
    }
        
}