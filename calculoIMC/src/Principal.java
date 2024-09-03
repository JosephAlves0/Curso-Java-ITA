public class Principal {
    public static void main(String[] args){
        Paciente p1 = new Paciente(72.5, 1.83);
        System.out.println(p1.diagnostico());

        Paciente p2 = new Paciente(50.0, 1.75);
        System.out.println(p2.diagnostico());

        Paciente p3 = new Paciente(110.0, 1.90);
        System.out.println(p3.diagnostico());
    }
}
