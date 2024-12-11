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

    public double calcularSalario() {
        double salarioTotal = salarioBase;
        if (horasTrabajadas < 0 ){
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }

        if (salarioBase < 0 ){
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }

        if (horasTrabajadas > 40){
            salarioTotal += (horasTrabajadas - 40) * 50; // Pago de horas extra
        }

        return salarioTotal += departamento.AddSalario();
        
    }

    // Más metodos
}
