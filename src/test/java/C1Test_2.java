import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C1Test_2 {

    AssertionError ae = new AssertionError("Error from test");

    @Test
    public void test() {
        throw ae;
    }

}