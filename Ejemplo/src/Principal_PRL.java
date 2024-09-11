
public class Principal_PRL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instancia
		Auto_PRL autito_prl = new Auto_PRL();
		//Asignar o cambiar su valor
		autito_prl.setColorAuto_PRL("Rojo"); 
		autito_prl.setMarcaAuto_PRL("Mercedes-Benz");
		autito_prl.encenderAuto_PRL();
		
		//Obtener
		System.out.println("El auto es de color: " + autito_prl.getColorAuto_PRL() + " y su marca es: " + autito_prl.getMarcaAuto_PRL());
	}

}
