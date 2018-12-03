package test.com.riverluoo;

import com.riverluoo.smooth.LinearSmooth;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
public class LinearSmoothTest {


    @Test
    public void test1() {

        Double[] squares = {319.0, 323.5, 328.0, 329.8, 345.8, 372.2, 404.8, 440.2, 476.6, 494.6, 499.8, 494.0, 480.6, 467.2};

        List<Double> doubles = List.of(squares);

        List<Double> smooth5 = LinearSmooth.linearSmooth5(doubles, doubles.size());
        System.out.println(smooth5);



    }


}
