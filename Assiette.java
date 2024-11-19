package TP8;

import java.util.Date;

public abstract class Assiette extends Ustensile{
	public Assiette(Date date) {
		super(date);
	}
	public abstract double calculSurfaceAssiettes() ;
	
	
}
