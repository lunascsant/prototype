package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    @Test
    void cloneDeveSerIgualAoOriginal() {
        Produto p1 = new Produto("Mouse", 99.99);
        Produto p2 = p1.clone();
        assertEquals(p1, p2);
    }

    @Test
    void cloneDeveSerObjetoDiferente() {
        Produto p1 = new Produto("Teclado", 199.99);
        Produto p2 = p1.clone();
        assertNotSame(p1, p2);
    }

    @Test
    void alteracaoNoCloneNaoAfetaOriginal() {
        Produto p1 = new Produto("Monitor", 899.99);
        Produto p2 = p1.clone();
        Produto p3 = new Produto("Monitor", 799.99);
        assertNotEquals(p3, p1);
        assertEquals(p1, p2);
    }

    @Test
    void cloneComValoresExtremos() {
        Produto p1 = new Produto("SuperPC", Double.MAX_VALUE);
        Produto p2 = p1.clone();
        assertEquals(p1, p2);
    }

    @Test
    void cloneComNomeNulo() {
        Produto p1 = new Produto(null, 10.0);
        Produto p2 = p1.clone();
        assertEquals(p1, p2);
    }
}

