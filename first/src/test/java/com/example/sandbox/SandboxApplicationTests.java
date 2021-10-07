package com.example.sandbox;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class SandboxApplicationTests {
    @Test
    void contextLoads() {
        SampleController calc = new SampleController();
        assertEquals("dep", calc.out(), "test");
    }
}
