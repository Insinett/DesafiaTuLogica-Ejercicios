package TopGun;

public class Avion {
    private int idAvion;
    private String modAvion;
    private int capAvion;
    private Piloto piloto;

    // Constructores
	public Avion() {
	}
   
    public Avion(int idAvion, String modAvion, int capAvion, Piloto piloto) {
        this.idAvion = idAvion;
        this.modAvion = modAvion;
        this.capAvion = capAvion;
        this.piloto = piloto;
    }

    // Getters y setters
    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public String getModAvion() {
        return modAvion;
    }

    public void setModAvion(String modAvion) {
        this.modAvion = modAvion;
    }

    public int getCapAvion() {
        return capAvion;
    }

    public void setCapAvion(int capAvion) {
        this.capAvion = capAvion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    // Método para mostrar la información del avión
    public void mostrarAvion() {
        System.out.println("INFORMACIÓN DEL AVIÓN:");
        System.out.println("- - - - - - - - - - - - - -");
        System.out.println(" - Id: " + idAvion);
        System.out.println(" - Modelo: " + modAvion);
        System.out.println(" - Capacidad: " + capAvion);
        System.out.println("INFORMACIÓN DEL PILOTO:");
        System.out.println("- - - - - - - - - - - - - -");
        piloto.mostrarPiloto();
    }
}