package TP8;

import java.time.LocalDate;
public class AssietteRonde extends Assiette {
	private double ray;
	private final double pi=3.14;
	public AssietteRonde(LocalDate date,double ray)
	{	super(date);
		this.ray=ray;
	}
	public double calculSurfaceAssiettes() {
		return pi*this.ray*this.ray;
	}
	
}
