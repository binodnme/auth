package com.github.binodnme.rs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** This is just a sample test class
 *
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 8/19/17.
 */
class HelloRsTest {

    private HelloRs helloRs = new HelloRs();

    @Test
    @DisplayName("should say hello auth")
    void sayHellOTest() throws Exception {
        assertEquals("hello auth", helloRs.sayHello());
    }

}