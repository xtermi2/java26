package com.github.xtermi2.java26.jep526lazyconstants;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class LazyConstants {

    public LazyConstants() {
        System.out.println("LazyConstants init...");
    }

    // OLD
    private final SomeService someServiceOld = new SomeService("old");

    // NEW - Specifying initialization at the declaration site
    private final Supplier<SomeService> someServiceNewWithInit = LazyConstant.of(() -> new SomeService("new declaration"));

    // NEW List
    private final List<String> someList = List.ofLazy(3, index -> "Content " + index);

    // NEW Map
    private final Map<String, String> someMap = Map.ofLazy(Set.of("key1", "key2"), key -> "Value for " + key);

    public void access() {
        // OLD
        someServiceOld.doSomething();

        // NEW
        someServiceNewWithInit.get().doSomething();

        // NEW
        System.out.println("Accessing someList: " + someList);

        // NEW
        System.out.println("Accessing someMap: " + someMap);
    }
}
