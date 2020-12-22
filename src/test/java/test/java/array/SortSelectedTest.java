package test.java.array;

import org.junit.Test;
import ru.job4j.array.SortSelected;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {27, 48, -11};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-11, 27, 48};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort7() {
        int[] input = new int[] {108, -4, 0, 22, 85, 0, 790};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-4, 0, 0, 22, 85, 108, 790};
        assertThat(result, is(expect));
    }
}