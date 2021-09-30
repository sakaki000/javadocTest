package com.example.sandbox;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class SandboxApplicationTests {

  @Test
  public void canConstructAPersonWithAName() {
    Exclude personA = new Exclude("A");
    assertEquals("A", personA.getName());
  }
}
