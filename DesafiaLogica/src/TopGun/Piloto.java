package TopGun;

public class Piloto {
	private int idPiloto;
	private String nomPiloto;
	private int horasVueloPiloto;
	private String rangoPiloto;

	// Constructores para Piloto

	public Piloto() {
	}

	public Piloto(int idPiloto, String nomPiloto, int horasVueloPiloto, String rangoPiloto) {
		this.idPiloto = idPiloto;
		this.nomPiloto = nomPiloto;
		this.horasVueloPiloto = horasVueloPiloto;
		this.rangoPiloto = rangoPiloto;
	}

	// Getters y setters

	public int getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}

	public String getNomPiloto() {
		return nomPiloto;
	}

	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;
	}

	public int getHorasVueloPiloto() {
		return horasVueloPiloto;
	}

	public void setHorasVueloPiloto(int horasVueloPiloto) {
		this.horasVueloPiloto = horasVueloPiloto;
	}

	public String getRangoPiloto() {
		return rangoPiloto;
	}

	public void setRangoPiloto(String rangoPiloto) {
		this.rangoPiloto = rangoPiloto;
	}

	// Método para mostrar la información del piloto
    public void mostrarPiloto() {
        System.out.println("INFORMACIÓN DEL PILOTO:");
        System.out.println("- - - - - - - - - - - - - -");
        System.out.println(" - Id: " + idPiloto);
        System.out.println(" - Nombre: " + nomPiloto);
        System.out.println(" - Horas de vuelo: " + horasVueloPiloto);
        System.out.println(" - Rango: " + rangoPiloto);
    }
}
