package com.example.sandbox;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SandboxApplicationTests {
    @Test
    void contextLoads() {
        SandboxApplication calc = new SandboxApplication();
        assertEquals("dep", calc.out());
    }
}
