package TP8;

import java.time.LocalDate;

public class AssietteCarree extends Assiette{
	private double cote;
	public AssietteCarree(LocalDate date,double cote)
	{
		super(date);
		this.cote=cote;
	}
	public double calculSurfaceAssiettes() {
		return this.cote*this.cote;
	}
	public int Calculvaleur() {
		return super.Calculvaleur()*5;
	}
}
