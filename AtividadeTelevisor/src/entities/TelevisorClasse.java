package entities;

public class TelevisorClasse {

	public int canal;
	public int volume;
	public boolean ligado;
	
	
	public void aumentarVolume() {
		if (volume >=0 && volume<=15) {
			volume +=1;
		}
		}
	public void diminuirVolume() {
		if (volume >0 && volume<=16) {
			volume -=1;}
		}
	public void aumentarCanal() {
			if (canal ==0) canal=1;
			if (canal >=1 && canal<=14) {
				canal +=1;}
			}

	public void diminuirCanal() {
				if (canal ==0) canal=1;
				if (canal >1 && canal<=15) {
					canal -=1;
				}
	    }
	public void ligarTelevisor() {
		    canal=1;
			ligado = true;
					}
	public void desligarTelevisor() {
			ligado = false;
			}
	public void mostrarStatus() {
		if (ligado==true) {
		System.out.println("TV ligada" );
		System.out.println("Canal: " + canal);
		System.out.println("Volume: " + volume);
		}
		else {
		System.out.println("Desligada! ");	
		}
	}
}


	
	
		
		
	
		
		
		

		
		
	
		
	

