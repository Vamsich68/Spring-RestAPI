package com.SpringApi.RestApi;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringHelperTest {
    @Test
    public void test(){
        //assertEquals("ABC","ABC");
        int[] numbers={1,3,2,3,4,2};
        int[] exepcted={1,2,2,3,3,4};
        Arrays.sort(numbers);
        assertArrayEquals(exepcted,numbers);
    }

}
