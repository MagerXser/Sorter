import com.sparta.sorter.model.Bubblesort;
import com.sparta.sorter.model.Sorter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeSort {

    private static com.sparta.sorter.model.BinaryTreeSort bts = new com.sparta.sorter.model.BinaryTreeSort();

//    @BeforeAll
//    public static void setUpAll(){
//        bts = new com.sparta.sorter.model.BinaryTreeSort();
//
//    }
//    @DisplayName(("BubbleSort test to return expected result"))
//    @Test
//    public void randomArrayReturnSorted () {
//        Integer[] actual = {9,8,7,6,5,4,3,2,1};
//        for (int i = 0; i < actual.length; i++)
//        {
//            bts.insert(actual[i]);
//        }
//        Integer A = 10;
//        final Class<?> data = A.getClass();
//        Integer newArray = (Integer) Array.newInstance(data,actual.length);
//        bts.order(bts.root, newArray);
//        int [] expected = {1,2,3,4,5,6,7,8,9};
//        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
//    }
}
