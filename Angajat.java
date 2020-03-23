package tema2;

public class Angajat {
	private String numeAngajat;
	private float oreLucrate;
	private float plataOra;
	
	public Angajat(String numeAngajat, float oreLucrate, float plataOra) {
		this.numeAngajat = numeAngajat;
		this.oreLucrate = oreLucrate;
		this.plataOra = plataOra;
	}

	public String getNumeAngajat() {
		return numeAngajat;
	}

	public float getOreLucrate() {
		return oreLucrate;
	}

	public float getPlataOra() {
		return plataOra;
	}

	public void setNumeAngajat(String numeAngajat) {
		this.numeAngajat = numeAngajat;
	}

	public void setOreLucrate(float oreLucrate) {
		this.oreLucrate = oreLucrate;
	}

	public void setPlataOra(float plataOra) {
		this.plataOra = plataOra;
	}
	
	public static CalculeazaSalariu calculSalariu;
	
	public static void afisareAngajat(Angajat a) throws Exception
	{
		try {
			System.out.println("Salariul este de: " + calculSalariu.CalculeazaSalariu(a));
		}
		catch (Exception e) {
			System.out.println("Angajatul:" + a.getNumeAngajat() + "nu exista.");
		}
	}

}
