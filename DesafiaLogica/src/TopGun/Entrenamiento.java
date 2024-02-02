package TopGun;

public class Entrenamiento extends Avion {

	    private boolean tieneDobleMando;

	    // Constructor
		public Entrenamiento() {
		}

		public Entrenamiento(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean tieneDobleMando) {
	        super(idAvion, modAvion, capAvion, piloto);
	        this.tieneDobleMando = tieneDobleMando;
	    }
		
		
		//Setting y Getting
		public boolean getTieneDobleMando() {
			return tieneDobleMando;
		}

		public void setTieneDobleMando(boolean tieneDobleMando) {
			this.tieneDobleMando = tieneDobleMando;
		}

	}
