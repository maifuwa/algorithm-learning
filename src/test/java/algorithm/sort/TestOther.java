package algorithm.sort;

import java.util.stream.IntStream;

import org.junit.Test;

public class TestOther {
    
    @Test
    public void testContent() {
        IntStream.range(0, 10).forEach(System.out::print);
        System.out.println("");
        IntStream.range(0, 10).map(i -> 10 - i).forEach(System.out::print);
    }
}
