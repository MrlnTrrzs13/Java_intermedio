package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
 
public class Curso {
	private String nombre;
	private int tiempo;
	private List<Aula> aulaList = new ArrayList<>();
	private Collection<Alumno> alumnos = new HashSet<>();
	//private Collection<Alumno> alumnos = new LinkedHashSet<>();
	private Map<String, Alumno> alumnoMap = new HashMap<>();
	//private Map<String, Alumno> alumnoMap = new LinkedHashMap<>();	

	public Curso(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	public Curso (String nombre, int tiempo, List<Aula> claseList) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.aulaList = claseList;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	
	public List<Aula> getAulaList() {
		return Collections.unmodifiableList(aulaList);
	}

	public void setAulaList(List<Aula> claseList) {
		this.aulaList = claseList;
	}
	
	public void addAula(Aula clase) {
		this.aulaList.add(clase);
	}
	
	public void addAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
		this.alumnoMap.put(alumno.getCodigo(), alumno);
	}
	
	public boolean verificaAlumno(Alumno alumno ) {
		return this.alumnos.contains(alumno);
	}
	
	public Collection<Alumno> getAlumno() {
		return alumnos;
	}

	public Map<String, Alumno> getAlumnoMap() {
		return alumnoMap;
	}

	@Override
	public String toString() {
		return this.nombre;
	}
}
