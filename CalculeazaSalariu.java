package tema2;

import java.beans.ExceptionListener;

public interface CalculeazaSalariu extends ExceptionListener {
	public float CalculeazaSalariu(Angajat a) throws Exception;
}
