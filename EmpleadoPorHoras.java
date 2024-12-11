public class EmpleadoPorHoras extends Empleado {
    

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento, genero);
        super.setSalarioBase(calcularSalario());
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + super.getGenero());
        System.out.println("Salario: " + super.getSalarioBase());
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
        System.out.println("Departamento: " + super.getDepartamento().getNombre());
    }

    @Override
    public double calcularSalario() {
        double salario = super.getHorasTrabajadas() * super.getTarifaHora();
        return salario;
    }

    // Más metodos
}