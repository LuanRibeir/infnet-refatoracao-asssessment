import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

public class ContaTest {
    @Test
    public void testCreditar() {
        Conta conta = new Conta("john doe", 1000.00, 10.0);

        double valor = 500.0;
        double saldoAntes = conta.consultarSaldo();

        conta.creditar(valor);

        double saldoEsperado = saldoAntes + valor;

        assertEquals(saldoEsperado, conta.consultarSaldo(), 0.0);
    }

    @Test
    public void testCalcularSaldoEspecial() {
        Conta conta = new Conta("Teste", 1000.00, 2.0);

        double saldoEspecialEsperado = conta.consultarSaldo() + conta.getEspecial();

        assertEquals(saldoEspecialEsperado, conta.calcularSaldoEspecial(), 0.0);
    }
}