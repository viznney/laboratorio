package entidades;

/**
 * @author viznney
 * @version 1.0
 * @created 03-abr.-2017 17:41:06
 */
public class Entidad {

	private String OID;

	public Entidad(){

	}

	public void finalize() throws Throwable {

	}

	public String getOID(){
		return OID;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setOID(String newVal){
		this.OID = newVal;
	}

}