package Ejercicio2;

import java.util.Scanner;

public class EvaluacionPolimorfismo {
    public static void main(String[] args) {


    Scanner entrada = new Scanner(System.in);

        System.out.println("Selecciona una opción:");
        System.out.println("1. Paciente");
        System.out.println("2. Enfermero");
        System.out.println("3. Doctor");

    int opcion = entrada.nextInt();
    padre Registro = null;

        switch (opcion) {

        case 1:

            System.out.println("Ingrese el Id del Paciente:");
            int id = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Por favor ingrese el nombre del Paciente:");
            String nombre = entrada.nextLine();

            System.out.println("Por favor ingrese el apellido del paciente:");
            String apellido = entrada.nextLine();

            System.out.println("Por favor ingrese la edad del paciente:");
            int edad = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Por favor ingrese la historia clínica del paciente:");
            String historiaClinica = entrada.nextLine();

            System.out.println("Por favor ingrese el número de seguro del paciente:");
            String numeroDeSeguro = entrada.nextLine();

           Registro = new Paciente(id, nombre, apellido, edad, historiaClinica, numeroDeSeguro);

            break;

        case 2:

            System.out.println("Ingrese el Id del enfermero:");
            id = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Por favor ingrese el nombre del enfermero:");
            nombre = entrada.nextLine();

            System.out.println("Por favor ingrese el apellido del enfermero:");
            apellido = entrada.nextLine();

            System.out.println("Por favor ingrese la edad del enfermero:");
            edad = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Por favor ingrese el turno del enfermero:");
            String turno = entrada.nextLine();

            System.out.println("Por favor ingrese los años de experiencia del enfermero:");
            int yearExperiencia = entrada.nextInt();

           Registro = new Enfermero(id, nombre, apellido, edad, turno, yearExperiencia);

            break;

        case 3:

            System.out.println("Ingrese el Id del doctor:");
            id = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Por favor ingrese el nombre del doctor:");
            nombre =entrada.nextLine();

            System.out.println("Por favor ingrese el apellido del doctor:");
            apellido = entrada.nextLine();

            System.out.println("Por favor ingrese la edad del doctor:");
            edad = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Por favor ingrese la especialidad del doctor:");
            String especialidad = entrada.nextLine();

            System.out.println("Por favor ingrese los años de experiencia del doctor:");
            yearExperiencia = entrada.nextInt();

           Registro = new Doctor(id, nombre, apellido, edad, especialidad, yearExperiencia);

            break;

        default:

            System.out.println("Opción inválida");
            return;

    }

        if (Registro != null) {

        Registro.Informacion();
        Registro.darOpiniones();

    }

}

}

class padre{
    protected int id;
    protected String nombre;
    protected String apeliido;
    protected int edad;

    public padre() {}

    public padre(int id, String nombre, String apeliido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apeliido = apeliido;
        this.edad = edad;
    }

    public void Informacion (){
        System.out.println("Datos");
        System.out.println("Id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apeliido);
        System.out.println("Edad: " + edad);

    }
    public void darOpiniones(){

        System.out.println("Holii");
    }
}
class Paciente extends padre{
    private String historiaClinica;
    private String numeroDeSeguro;

    public Paciente(){}

    public Paciente(int id, String nombre, String apeliido, int edad, String historiaClinica, String numeroDeSeguro) {
        super(id, nombre, apeliido, edad);
        this.historiaClinica = historiaClinica;
        this.numeroDeSeguro = numeroDeSeguro;
    }
    @Override
    public void darOpiniones(){

        System.out.println("El paciente es libre de dar su opinion");
    }
    public void registrarse(){

        System.out.println("El paciente ya esta registrado");
    }

    public void solicitarCita(){

        System.out.println("Me puede solicitar una cita por favor");
    }
    public void recibirTratamiento(){

        System.out.println("Me puedo recibir algun tipo de tratamiento");
    }
}
class Enfermero extends padre{
    private String turno;
    private int aniosExperiencia;

    public Enfermero(){}

    public Enfermero(int id, String nombre, String apeliido, int edad, String turno, int aniosExperiencia) {
        super(id, nombre, apeliido, edad);
        this.turno = turno;
        this.aniosExperiencia = aniosExperiencia;
    }
    @Override
    public void darOpiniones(){

        System.out.println("El enfermero es libre de dar su opinion");
    }
    public void aplicarMedicamento(){

        System.out.println("El enfermero aplicara el medicamento adecuado");
    }

    public void asistirPaciente(){

        System.out.println("Me puede asistir por favor");
    }
    public void asistirDoctor(){

        System.out.println("Se puede asistir a doctores");
    }
}
class Doctor extends padre{
    private String especialidad;
    private int yearExperiencia;

    public Doctor(){}

    public Doctor(int id, String nombre, String apeliido, int edad, String especialidad, int aniosExperiencia) {
        super(id, nombre, apeliido, edad);
        this.especialidad = especialidad;
        this.yearExperiencia = aniosExperiencia;
    }
    @Override
    public void darOpiniones(){

        System.out.println("El doctor es libre de dar su opinion");
    }
    public void Diagnosticar(){

        System.out.println("El doctor le ha diagnosticado alguna enfermedad");
    }

    public void prescribirTratamiento(){

        System.out.println("Tiene que precibir su tratamiento");
    }
    public void darSeguimiento(){

        System.out.println("Debo de darle seguimiento");
    }
}