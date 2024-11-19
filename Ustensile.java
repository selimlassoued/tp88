package TP8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public abstract class Ustensile {
	protected LocalDate date;
	//protected int annee;
	//protected final static int  annen=1974;
	public Ustensile(LocalDate date)
	{
		this.date=date;
	}
	public double Calculvaleur() {
		LocalDate day=LocalDate.now();
		long y= ChronoUnit.DAYS.between(date,day);
        if (y<18250)
        	{return 0;}
        else
        	{return y/365.0;}
	}
	
}

