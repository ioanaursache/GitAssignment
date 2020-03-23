package tema2;

import java.beans.ExceptionListener;

public abstract class MetodaCalculSalariu implements ExceptionListener {
	
	public static float CalculeazaSalariu(Angajat angajat) throws Exception 
	{
		float salariul=0;
		if(angajat.getOreLucrate()<=0)
		{
			throw new Exception("Angajatul " + angajat.getNumeAngajat()+ "este in concediu.");
		}
		
		salariul= salariul + (angajat.getPlataOra())  * (angajat.getOreLucrate()) ;
	
		return salariul; 
	}


}
