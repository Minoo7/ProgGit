package kapitel.kapitelX_Enhetstester;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometriTest {

    @Test
    public void skickaIn0SkaGe0() { // om vi skickar in sidan 0 ska manteln vara 0
        // Given
        // Givet vi har en instans av vår klass
        Geometri minKlassSomSkaTestas = new Geometri();

        // When
        // När vi anropr vår mantelarea-metod
        double mantelArea = minKlassSomSkaTestas.mantelareaKub( 0);

        // Then
        // Då ska manteln vara 0
        Assertions.assertEquals(0, mantelArea);
    }
    @Test
    public void skickaIn1SkaGe1() { // om vi skickar in sidan 1 ska manteln vara 1
        // Given
        // Givet vi har en instans av vår klass
        Geometri minKlassSomSkaTestas = new Geometri();

        // When
        // När vi anropr vår mantelarea-metod
        double mantelArea = minKlassSomSkaTestas.mantelareaKub( 1);

        // Then
        // Då ska manteln vara 0
        Assertions.assertEquals(6, mantelArea);
    }
    @Test
    public void skickaIn57SkaGe342() { // om vi skickar in sidan 57 ska manteln vara 342 k8i,  bn.mmmmmmmmmmmmmmmm
        // Given
        // Givet vi har en instans av vår klass
        Geometri minKlassSomSkaTestas = new Geometri();

        // When
        // När vi anropr vår mantelarea-metod
        double mantelArea = minKlassSomSkaTestas.mantelareaKub( 57);

        // Then
        // Då ska manteln vara 0
        Assertions.assertEquals(342, mantelArea);
    }
}