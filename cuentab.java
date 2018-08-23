package taller1;
import java.text.DecimalFormat;


public class cuentab {
	        
	private double cant; private String TituN; private String TituA;
			
			public cuentab (String NTitular, String ApeTitular, double cant) {
				this.TituN = NTitular;
				this.TituA = ApeTitular;
				this.cant = cant;
			}
			
			public void setTitular(String NTitular, String ApeTitular){
				this.TituN=NTitular;
				this.TituA=ApeTitular;
			}
			public String getNTitular() {
				return this.TituN;
			}
			public String getApeTitular() {
				return this.TituA;
			}
			public void setCant(double cant) {
				this.cant=cant;
			}
			public double getCant() {
				return this.cant;
			}
			public void Ingresar(double cant) {
				if (cant>=0)
					this.cant+=cant;
				else
					System.out.println("ingresaste una cantidad menor o igual a 0, no se ingresara nada a su cuenta");
			}
			public void Retirar (double cantidad) {
				
				DecimalFormat d = new DecimalFormat("0.00");
				d.setMaximumFractionDigits(2);
				
				if (cant>this.cant) {
					System.out.println("retiraste mas de la cantidad que hay en la cuenta (B/. "+d.format(this.cant)+"). Su saldo quedara en B/. 0.00");
					this.cant=0;
				}
				else if (cant<=0)
					System.out.println("ingresaste una cantidad menor o igual a 0, no se retirara nada de la cuenta");
				else
					this.cant-=cant;
			}
			public void getString() {
				
				DecimalFormat df = new DecimalFormat("0.00");
				df.setMaximumFractionDigits(2);
				System.out.println(this.TituN+" "+this.TituA+" la cantidad de saldo en su cuenta es de: B/. "+df.format(this.cant));
			}
			
	}


