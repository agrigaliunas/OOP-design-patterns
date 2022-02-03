package program;

import domain.Archivo;
import domain.Carpeta;
import domain.Unidad;

public class Main {

	public static void main(String[] args) {
		Carpeta carpetaPrimaria = new Carpeta();
		Carpeta carpetaUno = new Carpeta();
		Carpeta carpetaDos = new Carpeta();
		
		Archivo archivoUno = new Archivo(100);
		Archivo archivoDos = new Archivo(212);
		Archivo archivoTres = new Archivo(35);
		Archivo archivoCuatro = new Archivo(90);
		Archivo archivoCinco = new Archivo(5);


		carpetaUno.agregarUnidad(archivoUno);
		carpetaUno.agregarUnidad(archivoDos);
		carpetaUno.agregarUnidad(archivoTres);
		
		carpetaDos.agregarUnidad(archivoCuatro);

		carpetaPrimaria.agregarUnidad(carpetaUno);
		carpetaPrimaria.agregarUnidad(carpetaDos);
		carpetaPrimaria.agregarUnidad(archivoCinco);

		System.out.println("Carpeta primaria" + carpetaPrimaria.tamanoTotal());
		System.out.println("Carpeta uno: " + carpetaUno.tamanoTotal());
		System.out.println("Carpeta dos: " + carpetaDos.tamanoTotal());

	}

}
