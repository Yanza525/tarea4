package tarea4_git;
import java.io.Serializable;
import java.time.LocalDate;
/*Implementamos Serializazble*/
public class Alumno implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int nia;
	private String nombre;
	private String apellido;
	private char genero;
	private LocalDate fechaNacimiento;
	private String ciclo;
	private String curso;
	private String grupo;

	public Alumno(int nia, String n, String ap, char g, LocalDate fn, String c, String cur, String gr) {
		this.nia = nia;
		this.nombre = n;
		this.apellido = ap;
		this.genero = g;
		this.fechaNacimiento = fn;
		this.ciclo = c;
		this.curso = cur;
		this.grupo = gr;
	};

	public int getNia() {
		return nia;
	}

	public void setNia(int nia) {
		this.nia = nia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Alumno [NIA=" + nia + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Género=" + genero
				+ ", Fecha de Nacimiento=" + fechaNacimiento + ", Ciclo=" + ciclo + ", Curso=" + curso + ", Grupo="
				+ grupo + "]";
	}
}
