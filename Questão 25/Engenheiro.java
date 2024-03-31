public class Engenheiro extends Empregado {
    private double salario;

    public Engenheiro(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}