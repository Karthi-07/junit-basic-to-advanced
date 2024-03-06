package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddTest {
 Add a = new Add();

 @Test
 public void test(){
     assertEquals(4,a.add(2,2));
 }
}