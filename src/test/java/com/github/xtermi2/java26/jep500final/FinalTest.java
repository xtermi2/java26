package com.github.xtermi2.java26.jep500final;

import org.junit.jupiter.api.Test;

class FinalTest {
    @Test
    void testFinalIsFInalWarning() throws NoSuchFieldException, IllegalAccessException {
        new Final().modifyFinalFieldViaReflection();
        // The Warning is only shown once, not for each mutation of the final field
        new Final().modifyFinalFieldViaReflection();
    }
}