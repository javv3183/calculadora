package parcialp2;
import java.util.Random;
public class personas {
	private int		age;
	private String	Cedula;
	private float	Peso;
	private float	Altura;
	private int 	numCed;
	private String Name;
	private char	Sexo;
	private char	letraCed;
	
	public personas()
	{
		this.Name ="";
		this.age=0;
		this.Cedula="";
		this.Sexo=' ';
		this.Peso=0;
		this.Altura=0;
	}
	
	public personas(String Name, int age, char Sexo) 
	{
		this.Name=Name;
		this.age=age;
		this.Cedula="";
		this.Sexo=Sexo;
		this.Peso=0;
		this.Altura=0;
	}
	
	public void Persona(String Name, int age, char Sexo, float Peso, float Altura) 
	{
		this.Name=Name;
		this.age=age;
		this.Cedula="";
		this.Sexo=Sexo;
		this.Peso=Peso;
		this.Altura=Altura;
	}
	
	public int CalcularIMC() {
		double PI;
		int valor;
		PI=(this.Peso/(Math.pow(this.Altura, 2)));
		if (PI<20)
			valor = -1;
		else if (PI>=20&&PI<=25)
			valor = 0;
		else
			valor = 1;
		return valor;
	}
	
	public boolean esMayordeEdad() {
		if (this.age>=18)
			return true;
		else
			return false;
	}
	
	public char comprobarSexo(char Sexo){
		if(Sexo=='H'||Sexo=='h'||Sexo=='M'||Sexo=='m')
			System.out.println("El sexo ingresado es correcto");
		else 
			this.Sexo='H';
		return this.Sexo;
	}
	
	public String generaCedula() {
		Random rng = new Random();
		String letrasDNI = "JYUTRWAGMYFPNJZSQVHLCKE";
		this.numCed = rng.nextInt(90000000)+10000000;
	    int modulo = this.numCed % 23;
	    this.letraCed = letrasDNI.charAt(modulo);
	    this.Cedula+=this.numCed;
	    this.Cedula+=this.letraCed;
		return this.Cedula;
	}
	
	public void setNombre(String Nombre) {
		this.Name=Nombre;
	}
	
	public void setEdad(int Edad) {
		this.age=Edad;
	}
	
	public void setSexo(char Sexo) {
		this.Sexo=Sexo;
	}
	
	public void setPeso(float Peso) {
		this.Peso=Peso;
	}
	
	public void setAltura(float Altura) {
		this.Altura=Altura;
	}
	
	public String toString() {
		String Info;
		Info = ("Nombre:\t"+this.Name+"\nEdad:\t"+this.age+"\nSexo:\t"+this.Sexo+"\nCedula:\t"+this.Cedula+"\nPeso:\t"+this.Peso+"\nAltura:\t"+this.Altura);
		return Info;
	}

}

