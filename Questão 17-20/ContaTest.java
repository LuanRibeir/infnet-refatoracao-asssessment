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
}