package com.sysops.trewismirre;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    public void should_return_hello_world() {
        HelloWorld helloworld = new HelloWorld();
        String result = helloworld.helloworld();

        assertThat(result).isEqualTo("Hello World");

    }
}