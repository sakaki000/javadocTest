package com.exclude;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SandboxApplicationTests {
    @Test
    void contextLoads() {
        Exclude calc = new Exclude("A");
        assertEquals("A", calc.getName());
    }
}
