package Views;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		
		//String empleado = new EmpleadoController().createEmpleado("Sanchez Quispe", "Pedro Jose", 25, "Masculino", 1200);
		//String empleado = new EmpleadoController().createEmpleado("Valverde Condor", "Pedro Manuel", 26, "Masculino", 1300);
		
		//String empleado = new EmpleadoController().deleteEmplead(2);
		
		
		//String empleado = new EmpleadoController().updateEmpleado(1, "Manuel Carlos");
		//String empleado = new EmpleadoController().updateEmpleado(1, "Jordan Arturo");
		
		String empleado = new EmpleadoController().getEmpleado(1);
		
		System.out.println(empleado);
		
	}

}
