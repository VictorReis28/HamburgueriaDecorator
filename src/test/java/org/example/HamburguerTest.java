package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {

    @Test
    void deveRetornarHamburguerBase(){
        Hamburguer hamburguer = new HamburguerBase(20);
        assertEquals(20, hamburguer.getPreco());
    }

    @Test
    void deveRetornarHambuguerBaseComBacon(){
        Hamburguer hamburguer = new Bacon(new HamburguerBase(20));
        assertEquals(23, hamburguer.getPreco());
    }

    @Test
    void deveRetornarHambuguerBaseComAlfaceBaconeBacon(){
        Hamburguer hamburguer = new Bacon(new Bacon(new Alface(new HamburguerBase(20))));
        assertEquals(27, hamburguer.getPreco());
    }

    @Test
    void deveRetonarIngredientesCheddarQueijoTomateBaconAlface(){
        Hamburguer hamburguer = new Alface(new Bacon(new Tomate(new Queijo(new Cheddar(new HamburguerBase(20))))));
        assertEquals("Hambúrguer, Cheddar, Queijo, Tomate, Bacon, Alface", hamburguer.getIngredientes());
    }
}