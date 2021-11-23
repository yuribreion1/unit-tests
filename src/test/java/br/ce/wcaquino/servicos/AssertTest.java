package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

    @Test
    public void test() {

        // Verificando booleano
        Assert.assertTrue(true);

        // Comparando dois valores
        Assert.assertEquals(1, 1);

        // Comparando strings
        Assert.assertEquals("bola", "bola");
        Assert.assertTrue("bola".equalsIgnoreCase("Bola"));

        Usuario u1 = new Usuario("Usuario1");
        Usuario u2 = new Usuario("Usuario1");
        Usuario u3 = null;

        // Comparando nome
        Assert.assertEquals(u1, u2);

        // Comparando instancias
        Assert.assertNotSame(u1, u2);

        // Comparando nulo
        Assert.assertNull(u3);
    }
    
}
