package interfaz;
import logica.Hombre;
import logica.Mujer;
import logica.Persona;
public class Principal {
	
	public Principal() {
		//Haga sus pruebas aqui
		Persona tester;
		tester = new Hombre(20, 70,170);
		try 
		{
			float out = tester.calcularTMB();
			System.out.println("prueba hombre correcta ");

			System.out.println(out);
			tester = new Mujer(20, 50, 160);
			out = tester.calcularTMB();
			System.out.println("prueba mujer correcta ");

			System.out.println(out);
			// descomente la que desea visualizar 
			/*

			  System.out.println("prueba mujer con exception");
			  tester = new Mujer(10,50,160);
			  out = tester.calcularTMB();
			  */
			/*

			System.out.println("prueba mujer con exception");
			  tester = new Hombre(10,50,160);
			  out = tester.calcularTMB();
			  */

		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
