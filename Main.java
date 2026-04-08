public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan Perez", "Ingenieria", 20, 8.5);
        Curso c1 = new Curso("Programacion Java", "PROG101", 4, 30);
        Profesor p1 = new Profesor("Carlos Gomez", "Sistemas", 1200.0, 5);

        System.out.println("--- DATOS CON CONSTRUCTOR ---");
        e1.mostrarEstudiante();
        System.out.println("Estado: " + e1.estadoAcademico());
        c1.mostrarCurso();
        p1.mostrarProfesor();
        System.out.println("Salario Total: $" + p1.calcularSalarioTotal());

        System.out.println("\n----------------------------\n");

        Estudiante e2 = new Estudiante("", "", 0, 0); // Se crea vacío primero
        e2.nombre = "Maria Lopez";
        e2.carrera = "Software";

        System.out.println("--- DATOS ASIGNACIÓN UNO A UNO ---");
        e2.mostrarEstudiante();
    }
}