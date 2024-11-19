package TP8;

import java.util.Date;

public class Collection {
	public static void main(String[] args) {
	Ustensile[] us = new Ustensile[5];
	us[0] = new AssietteRonde(new Date(1926,2,5), 8.4);
	us[1] = new Cuillere(new date1881, 7.3);
	us[2] = new AssietteCarree(1935, 5.6);
	us[3] = new Cuillere(1917, 8.8);
	us[4] = new AssietteRonde(1837, 5.4);
	afficherCuilleres(us);
	afficherSurfaceAssiettes(us);
	afficherValeurTotale(us);

}
static void afficherCuilleres(Ustensile[] us) { 
	int nbCuilleres = 0;
	for (int i = 0; i< us.length; i++) {
		if(us[i] instanceof Cuillere)
		{
			nbCuilleres++;
		}
	}
	System.out.println("Il y a " + nbCuilleres + " cuillères.");
}
public static void afficherSurfaceAssiettes(Ustensile[] us) {
	double surf=0;
	for(int i=0;i<us.length;i++)
	{
		if(us[i] instanceof Assiette)
		{
			surf=surf+((Assiette)us[i]).calculSurfaceAssiettes();
		}
	}
	System.out.println("Surface totale des assiettes : "+surf);
}
public static void afficherValeurTotale(Ustensile[] us)
{
	double val=0;
	for(int i=0;i<us.length;i++)
	{
		val=val+us[i].Calculvaleur();
	}
	System.out.println("La somme des sutensiles est: "+val);
}
}