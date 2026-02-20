package com.github.xtermi2.java26.jep500final;

public class Final {

    // A normal class with a final field
    static class C {
        final int x;

        C() {
            x = 100;
        }
    }

    static void main() throws NoSuchFieldException, IllegalAccessException {
        // 1. Perform deep reflection over the final field in C
        java.lang.reflect.Field f = C.class.getDeclaredField("x");
        f.setAccessible(true);      // Make C's final field mutable

        // 2. Create an instance of C
        C obj = new C();
        System.out.println(obj.x);  // Prints 100

        // 3. Mutate the final field in the object
        f.set(obj, 200);
        System.out.println(obj.x);  // Prints 200
        f.set(obj, 300);
        System.out.println(obj.x);  // Prints 300
    }
}
