package ru.job4j.condition;

import org.assertj.core.api.AbstractStringAssert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class VectorTest {
    @Test
    void whenVectors12And34ThenResult46() {
        int x1 = 1, y1 = 2, x2 = 3, y2 = 4;
        String expected = "(4, 6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus23And34ThenResult11() {
        int x1 = -2, y1 = -3, x2 = 3, y2 = 4;
        String expected = "(1, 1)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus23AndMinus34ThenResultMinus57() {
        int x1 = -2, y1 = -3, x2 = -3, y2 = -4;
        String expected = "(-5, -7)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }
}
