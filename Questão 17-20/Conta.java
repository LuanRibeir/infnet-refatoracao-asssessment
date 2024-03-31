public class Conta {
    private String nome;
    private double especial;
    private double saldo;

    public Conta(String nome, double saldo, double especial) {
        this.nome = nome;
        this.saldo = saldo;
        this.especial = especial;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double calcularSaldoEspecial() {
        return saldo + especial;
    }

    public void debitar(double valor) {
        double saldoTotal = saldo + especial;
        if (valor > saldoTotal) {
            throw new IllegalArgumentException("ERRO: Saldo insuficiente");
        }
        saldo -= valor;
    }

    // Getters e setters para Nome e Especial
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getEspecial() {
        return especial;
    }

    public void setEspecial(double especial) {
        this.especial = especial;
    }

    // Main
    public static void main(String[] args) {
        Conta conta = new Conta("luan", 1000.00, 2.0);

        System.out.println(conta);
    }
}