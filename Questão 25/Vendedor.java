public class Vendedor extends Empregado {
    private double salario;
    private double comissao;

    public Vendedor(double salario, double comissao) {
        this.salario = salario;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salario + comissao;
    }
}