package org.jarlil;

import org.junit.jupiter.api.Test;
import org.springframework.kafka.test.context.EmbeddedKafka;

import static org.junit.jupiter.api.Assertions.assertEquals;

@EmbeddedKafka(partitions = 1, brokerProperties = {"listeners=PLAINTEXT://localhost:9092", "port=9092"})
public class TestClass {

    @Test
    public void testCase() {
        assertEquals(1, 1);
    }
}
