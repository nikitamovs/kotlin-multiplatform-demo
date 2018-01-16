package org.sample.java;

import org.sample.kotlin.JavaInterOperable;

public class JavaClass {

    public String test(String subject) {
        final JavaInterOperable instance = new JavaInterOperable();
        return instance.execute(subject);
    }
}
