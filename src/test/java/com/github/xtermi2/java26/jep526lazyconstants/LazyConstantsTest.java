package com.github.xtermi2.java26.jep526lazyconstants;

import org.junit.jupiter.api.Test;

class LazyConstantsTest {

    @Test
    void access() {
        System.out.println("create LazyConstants instance in test");
        final LazyConstants lazyConstants = new LazyConstants();
        System.out.println("1st access LazyConstants instance in test");
        lazyConstants.access();

        System.out.println("2nd access LazyConstants instance in test");
        lazyConstants.access();
    }
}