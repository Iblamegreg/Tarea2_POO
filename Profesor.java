public class Profesor {
    public String nombreProfesor;
    public String facultad;
    private double salarioBase;
    private int añosExperiencia;

    public Profesor(String nombreProfesor, String facultad, double salarioBase, int añosExperiencia) {
        this.nombreProfesor = nombreProfesor;
        this.facultad = facultad;
        this.salarioBase = salarioBase;
        this.añosExperiencia = añosExperiencia;
    }

    public void mostrarProfesor() {
        System.out.println("PROFESOR: " + nombreProfesor + " | Facultad: " + facultad);
    }

    public double calcularSalarioTotal() {
        return salarioBase + (añosExperiencia * 50.0);
    }
}