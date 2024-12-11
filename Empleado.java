public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private Departamento departamento;
    private double tarifaHora;
    private String genero;

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.departamento = departamento;
        this.genero = genero;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }

    // Más metodos
}

abstract class Departamento{
    protected String dnombre;
    abstract double AddSalario();
    abstract String getNombre();
}
public class Sistemas extends Departamento{
    public Sistemas(String nombre){
        this.dnombre= nombre;
    }
    public double AddSalario(){
        return 20;
    }
    public String getNombre(){
        return dnombre;
    }
}
public class Contabilidad extends Departamento{
    public Contabilidad(String nombre){
        this.dnombre =nombre;
    }
    public double AddSalario(){
        return  10;
    }
    public String getNombre(){
        return dnombre;
    }
}
public class Medico extends Departamento{ //no era neesario, por si acaso
    public Contabilidad(String nombre){
        this.dnombre =nombre;
    }
    public double AddSalario(){
        return  0;
    }
    public String getNombre(){ 
        return dnombre;
    }
}
