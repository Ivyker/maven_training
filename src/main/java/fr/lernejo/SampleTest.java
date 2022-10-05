package fr.lernejo;

import org.assertj.core.api.Assertions;

class Test {

    @org.junit.jupiter.api.Test
    void sum_of_10_and_5_equal_15(){
        int u = 10;
        int v = 5;

        int sum = Sample.op(Sample.Operation.ADD, u, v);

        Assertions.assertThat(sum).as("sum of 10 + 5").isEqualTo(15);
    }
    @org.junit.jupiter.api.Test
    void sum_of_negative_11_and_12_equals_1(){
        int u = -11;
        int v = 12;

        int sum = Sample.op(Sample.Operation.ADD, u, v);
        Assertions.assertThat(sum).as("sum of  -11+12").isEqualTo(1);
    }


}
