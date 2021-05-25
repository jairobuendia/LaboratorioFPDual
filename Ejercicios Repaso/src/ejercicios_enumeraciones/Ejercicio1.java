package ejercicios_enumeraciones;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public enum Ejercicio1 {
	Mercurio(false, true, 100), Venus(true, false, 39), Tierra(true, false, 1000), Marte(true, false, 1000),
	Jupiter(true, true, 300), Saturno(true, false, 989), Urano(false, true, 149), Neptuno(true, true, 23);

	private boolean isInsideAsteroidsRing;
	private boolean hasAnAtmosphere;
	private int distanceFromSun;

	private Ejercicio1(boolean isInsideAsteroidsRing, boolean hasAnAtmosphere, int distanceFromSun) {
		this.isInsideAsteroidsRing = isInsideAsteroidsRing;
		this.hasAnAtmosphere = hasAnAtmosphere;
		this.distanceFromSun = distanceFromSun;
	}
	
	
	public static int getDistanceFromSun() {
		return distanceFromSun;
	}

	public static void main(String[] args) {
		//A
		System.out.println("Listando planetas dentro del anillo:");
		for (Ejercicio1 e : Ejercicio1.values()) {
			if (e.isInsideAsteroidsRing == true) {
				System.out.println("- " + e);
			}

		}
		//B
		System.out.println("Listando planetas que poseen una atmosfera:");
		for (Ejercicio1 e : Ejercicio1.values()) {
			if (e.hasAnAtmosphere == true) {
				System.out.println("- " + e);
			}
		}
		//C
		System.out.println("Listando planetas que cumplan las mismas condiciones que el planeta tierra");
		for (Ejercicio1 e : Ejercicio1.values()) {
			if (e.hasAnAtmosphere == Tierra.hasAnAtmosphere && e.distanceFromSun == Tierra.distanceFromSun && e.isInsideAsteroidsRing == Tierra.isInsideAsteroidsRing){
				System.out.println("- " + e);
			}
		}
		//D
		System.out.println("Planeta más cercano al sol:");
		//int min = Collections.min(Ejercicio1.getDistanceFromSun());
//		for (Ejercicio1 e : Ejercicio1.values()) {
//			if (e.distanceFromSun == min)
//				System.out.println("- " + e);
//			}
//		}
	
		//APARTADO 2 
		TreeSet listado = new TreeSet();
		for (Ejercicio1 e : Ejercicio1.values()) {
			listado.add(e);
			System.out.println(listado);
		}

	}

}
