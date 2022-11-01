import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CartaoVirtualTest {

    @Test
    void testClone() throws CloneNotSupportedException {

        Usuario usuario = new Usuario(123, "Usuario Original");
        CartaoVirtual cartaoVirtual = new CartaoVirtual(123, 1, "20/12/2023", usuario);
        CartaoVirtual cartaoVirtualClone = cartaoVirtual.clone();

        cartaoVirtualClone.setNumero(456);
        cartaoVirtualClone.setCodigoSeguranca(2);

        Assertions.assertEquals("Cartao Virtual{numero=123, codigo seguranca=1, vencimento='20/12/2023', usuario=Usuario{id=123, nome='Usuario Original'}}", cartaoVirtual.toString());
        Assertions.assertEquals("Cartao Virtual{numero=456, codigo seguranca=2, vencimento='20/12/2023', usuario=Usuario{id=123, nome='Usuario Original'}}", cartaoVirtualClone.toString());
    }

}