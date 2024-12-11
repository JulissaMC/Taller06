public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento, genero);
        this.bonoAnual = bonoAnual;
       
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + super.getGenero());
        System.out.println("Salario: " + super.getSalarioBase());
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
        System.out.println("Departamento: " + super.getDepartamento().getNombre());
        System.out.println("bonoAnual: " + bonoAnual);
    }

    // Más metodos
}
