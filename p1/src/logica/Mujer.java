package logica;

public class Mujer extends Persona {

	public Mujer(float edad, float peso, float altura) {
		super(edad, peso, altura);

	}

	@Override
	public float calcularTMB() throws Exception
	{
		if (check()) 
		{
			throw new Exception("no se puede calcular el TMC de la mujer");
		}
		else 
		{
			return (float)( 447.593 + (9.247 * this.peso) + (3.098 * this.altura) - (4.33 * this.edad));

		}
		
		
		
	}
	@Override 
	protected boolean check() 
	{
		return  ((40 > this.peso || this.peso > 80) || (140 > this.altura || this.altura > 180) || this.edad <15 );
		

		
	}
	

}


