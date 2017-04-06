package complejo;
/**
 * class Complejo v1

 * @catedra de programacion avanzada
 * UNLAM
 * 02/09/2011
 */
import static java.lang.Math.*;
import java.util.*;

public class Complejo implements Comparable<Complejo>
{
	private double real;
	private double imag;
	// primero los  constructores
	public Complejo(double real ,double imag)
	{
		this.real = real;
		this.imag = imag;
	}
	public Complejo()
	{
		this(0,0);
	}
	// despues agrupamos las funcones aritmeticas
	public Complejo suma(Complejo z)
	{
		return(new Complejo(this.real+z.real,this.imag+z.imag));
	}
	public static Complejo suma(Complejo z1,Complejo z2)
	{
		return(new Complejo(z1.real+z2.real,z1.imag+z2.imag));
	}
	public double modulo()
	{
		return(sqrt(pow(real,2)+pow(imag,2)));
	}
		
	// equals siempre la definiremos en cada class
	
	public boolean equals(Object obj) 
	{
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(imag) != Double
				.doubleToLongBits(other.imag)) {
			return false;
		}
		if (Double.doubleToLongBits(real) != Double
				.doubleToLongBits(other.real)) {
			return false;
		}
		return true;
	}
	// toString siempre la definiremos en cada class
	public String toString() 
	{
		return "Complejo [real=" + real + ", imag=" + imag + "]";
	}
	// clone
	public Object clone() 
	{
		return new Complejo(this.real,this.imag);
	}
	
	public int compareTo(Complejo c1)
	{
	if (this.modulo()< c1.modulo())
		return -1;
	if (this.modulo()> c1.modulo())
		return 1;
	else
		return 0;
	}
	
	// setters  and  getters
	public final double getReal() {
		return real;
	}
	public final void setReal(double real) {
		this.real = real;
	}
	public final double getImag() {
		return imag;
	}
	public final void setImag(double imag) {
		this.imag = imag;
	}
	public static void main(String[] args) 
	{
		Complejo z1 = new Complejo();
		Complejo z2 = new Complejo(2,2);
		Complejo z3 = new Complejo(1.1,1.1);
		System.out.println(z1); 
		System.out.println(z2);
		System.out.println(z3);
		z3=z1.suma(z2);
		System.out.println(z3); // muestra 2,2
		z3=suma(z3,z2);
		System.out.println(z3); // muestra 4,4
		z2 = (Complejo) z1.clone();
		System.out.println(z2);
		
Complejo [] vComplejo=new Complejo[10];
						
		
		for (int i=0; i<10;i++)
			vComplejo[i]= new Complejo(Math.sin(i+10),Math.cos(i+20));
		for (int i=0; i<10;i++)
			System.out.println(vComplejo[i]);
		
		Arrays.sort(vComplejo);
		
		
		for (int i=0; i<10;i++)
			System.out.println(vComplejo[i].modulo());
		
		}
}