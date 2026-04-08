public class Estudiante {
    public String nombre;
    public String carrera;
    private int edad;
    private double notaFinal;

    public Estudiante(String nombre, String carrera, int edad, double notaFinal) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }

    public void mostrarEstudiante() {
        System.out.println("ESTUDIANTE: " + nombre + " | Carrera: " + carrera + " | Edad: " + edad);
    }

    public String estadoAcademico() {
        return (notaFinal >= 7.0) ? "Aprobado" : "Reprobado";
    }
}