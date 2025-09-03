package logica;

public class Hombre extends Persona {

	public Hombre(float edad, float peso, float altura) {
		super(edad, peso, altura);
		// TODO Auto-generated constructor stub
	}
	@Override
	public float calcularTMB() throws Exception
	{
		if (check()) 
		{
			throw new Exception("no se puede calcular el TMC del hombre");
		}
		else
		{
			return (float) (88.362 + (13.397 *this.peso) + (4.799 * this.altura) - (5.677 * this.edad));

		}
		
		
	}
	@Override 
	protected boolean check() 
	{
		return  ((60 > this.peso || this.peso > 110) || (160 > this.altura || this.altura > 195) || this.edad <15 ); 

		
	}

}
