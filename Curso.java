public class Curso {
    public String nombreCurso;
    public String codigo;
    private int creditos;
    private int cuposMaximos;

    public Curso(String nombreCurso, String codigo, int creditos, int cuposMaximos) {
        this.nombreCurso = nombreCurso;
        this.codigo = codigo;
        this.creditos = creditos;
        this.cuposMaximos = cuposMaximos;
    }

    public void mostrarCurso() {
        System.out.println("CURSO: " + nombreCurso + " [" + codigo + "] | Créditos: " + creditos);
    }

    public int calcularHorasTotales() {
        return creditos * 16; // 16 semanas por semestre
    }
}