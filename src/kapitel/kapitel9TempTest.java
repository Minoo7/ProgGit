package kapitel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class kapitel9TempTest {

    @Test
    public void Test_S50_G10() {
        // Given
        // Givet vi har en instans av vår klass
        kapitel9 ClassCheck_kap9 = new kapitel9();

        // When
        // När vi anropar vår temperatur-metod
        double TempConvert = ClassCheck_kap9.tempconvert(50);

        // Then
        // Då ska celsius vara 10
        Assertions.assertEquals(10, TempConvert);
    }

}