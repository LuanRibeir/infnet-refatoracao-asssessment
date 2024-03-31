public class Gerente extends Empregado {
    private double salario;
    private double bonus;

    public Gerente(double salario, double bonus) {
        this.salario = salario;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salario + bonus;
    }
}