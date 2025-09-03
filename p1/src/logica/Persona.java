package logica;

public abstract class Persona {
	
	
	
	protected float edad;
	protected float peso ;
	protected float altura;
	public Persona (float edad, float peso , float altura)
	{
		this.altura = altura;
		this.edad = edad;
		
		this.peso = peso;
	}
	
	public abstract float calcularTMB() throws Exception;
	protected abstract boolean check();
		
	

}
