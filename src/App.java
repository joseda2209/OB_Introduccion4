public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setEdad(28);
        cliente.setNombre("Daniel Muñoz");
        cliente.setTelefono("31569259");
        cliente.setCredito(1000000);

        System.out.println("el nombre del cliente es: " + cliente.getNombre() + ", edad:  " + cliente.getEdad() + ", telefono: " + cliente.getTelefono() + " y credito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(29);
        trabajador.setNombre("Mafe Tobar");
        trabajador.setTelefono("31830579");
        trabajador.setSalario(3500000);

        System.out.println("el nombre del trabajador es: " + trabajador.getNombre() + ", edad:  " + trabajador.getEdad() + ", telefono: " + trabajador.getTelefono() + " y credito: " + trabajador.getSalario());
    }
}
