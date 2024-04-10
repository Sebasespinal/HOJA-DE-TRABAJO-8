
import org.VectorHeap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VectorHeap<Paciente> emergencias = new VectorHeap<>();

        //Leer el archivo del paciente
        try {
            File file = new File("C:\\Users\\rseba\\intelijji proyectos\\HOJA8-\\src\\main\\\\pacientes.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] datos = scanner.nextLine().split(",");
                String nombre = datos[0].trim();
                String sintoma = datos[1].trim();
                char codigoEmergencia = datos[2].trim().charAt(0);
                Paciente paciente = new Paciente(nombre, sintoma, codigoEmergencia);
                emergencias.add(paciente);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo 'pacientes.txt'.");
            e.printStackTrace();
        }

        //Atender Paciente
        while (!emergencias.isEmpty()) {
            Paciente siguientePaciente = emergencias.poll();
            siguientePaciente.imprimirInfo();
        }
    }
}
