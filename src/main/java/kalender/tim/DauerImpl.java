package kalender.tim;

import java.util.Calendar;

import kalender.interfaces.Datum;
import kalender.interfaces.Dauer;
import kalender.interfaces.Monat;
import kalender.interfaces.Tag;
import kalender.interfaces.Uhrzeit;
import kalender.interfaces.Woche;

public class DauerImpl implements Dauer {

	private int minuten;
	
	public DauerImpl(Datum d1, Datum d2) {
	}

	public DauerImpl(int minuten) {
	}
	
	public DauerImpl(int stunden, int minuten) {
	}

	public DauerImpl(int tage, int stunden, int minuten) {
	}


	public int compareTo(Dauer o) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int inMinuten() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int inStunden() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int inTagen() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int inWochen() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int anteilMinuten() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int anteilStunden() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int anteilTage() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int anteilWochen() {
		// TODO Auto-generated method stub
		return 0;
	}

}
