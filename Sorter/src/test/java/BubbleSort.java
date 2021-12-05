import com.sparta.sorter.model.Bubblesort;
import com.sparta.sorter.model.Sorter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSort {

    private static Sorter sorter =  new Bubblesort();

    @BeforeAll
    public static void setUpAll(){
        sorter = new Bubblesort();
    }
    @DisplayName(("BubbleSort test to return expected result"))
    @Test
    public void randomArrayReturnSorted () {
        Integer[] actual = {9,8,7,6,5,4,3,2,1};
        sorter.sort(actual);
        int [] expected = {1,2,3,4,5,6,7,8,9};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    public void randomArrayListReturnSorted () {

    }
}
