package cat.inspla.ra3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsAppTest {

    private final StringUtilsApp utils = new StringUtilsApp();

    @ParameterizedTest
    @CsvSource({
            "'hola   mon', 'hola mon'",
            "'  java   junit  ', 'java junit'",
            "'a   b   c', 'a b c'"
    })
    void TODO_normalizeSpacesRedueixEspaisMultiples(String input, String expected) {
        // TODO
    }

}

