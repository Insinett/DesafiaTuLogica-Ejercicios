package TopGun;

public class Combate extends Avion {

	    private boolean esFurtivo;

	    // Constructores
		public Combate() {
		}
	    
	    public Combate(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean esFurtivo) {
	        super(idAvion, modAvion, capAvion, piloto);
	        this.esFurtivo = esFurtivo;
	    }

	    // Getters y setters
	    public boolean isEsFurtivo() {
	        return esFurtivo;
	    }

	    public void setEsFurtivo(boolean esFurtivo) {
	        this.esFurtivo = esFurtivo;
	    }

	    // Método para mostrar la información del avión de combate
	    @Override
	    public void mostrarAvion() {
	        super.mostrarAvion();
	        System.out.println(" - Es furtivo: " + esFurtivo);
	    }
	}

