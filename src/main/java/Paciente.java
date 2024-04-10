//Clase que representa la ficha del paciente
public class Paciente implements  Comparable<Paciente>{
    String nombre;
    String sintoma;
    char codigoEmergencia;

    public Paciente(String nombre, String sintoma, char codigoEmergencia) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigoEmergencia = codigoEmergencia;
    }

    //Metodo para comparar pacientes basado en el codigo de emergencia
    @Override
    public int compareTo(Paciente otro) {
        return Character.compare(this.codigoEmergencia, otro.codigoEmergencia);
    }

    //Metodo para imprimir la informacion del paciente
    public void imprimirInfo() {
        System.out.println(nombre + ", " + sintoma + ", " + codigoEmergencia);
    }
}
