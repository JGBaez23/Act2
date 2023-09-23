public class Act2 {
	public final String nombre;
	public final int[] calificaciones;
	
	public Alumno(String nombre, int[]calificaciones) {
		this.nombre = nombre;
		this.calificaciones = calificaciones;
		
	}
public double calcularPromedio() {
	int suma = 0;
	for (int calificacion : calificaciones) {
		suma += calificacion;
		}
	return suma / (double)calificaciones.length;
	}

public char obtenerCalificacionFinal(double promedio) {
	if(promedio <=50) {
		return "F" ;
		}else if(promedio <= 60) {
			return "E";
		}else if(promedio <= 70) {
			return "D";
		}else if(promedio <= 80) {
			return "C";
		}else if(promedio <= 90) {
			return "b";
		}else {
			return "A";
		}
}
Class User{
	
	public String first_name;
	public String last_name;{
	
	//Constructor
	public void User(String first_name, String last_name) {
		this.first_name = first_name;
		this.last_name = last_name;
	}
	public void fullname() {
		System.out.println(first_name + " " + last_name);
    }
	
	}
public class act2{
	public static void main(String[]arg) {
		String nombre = "Sergio Ulloa";
		int[]calificaciones = (96, 90, 88, 95, 94){
		Alumno alumno = new Alumno(nombre, calificaciones);
		alumno.imprimirResultados();
		
		String nombre = "Laura Garza";
		int[]calificaciones = (88, 91, 89, 94, 92){
		Alumno alumno = new Alumno(nombre, calificaciones);
		alumno.imprimirResultados();
		
		String nombre = "Sofia Lopez";
		int[]calificaciones = (99, 98, 99, 95, 93){
		Alumno alumno = new Alumno(nombre, calificaciones);
		alumno,imprimirResultados();
		
		}
		}
		}
	}
}

