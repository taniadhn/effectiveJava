package com.work.effectivejava.item35.markerAnnotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTest {

    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        //Tüm alanlara bakmak istediğimizde Reflection Çağırımı yapıyorduk
        Class<?> testClass = Class.forName("com.effectivejava.tutorial.effectivejava.itema39.markerannotation.Sample");
        //getDeclare kısmında tüm methodlarını dönecem
        for (Method m : testClass.getDeclaredMethods())
        {
            //Eğer beni Test sınıfında bir methodum gösteriyorsa üstünde
            if (m.isAnnotationPresent(Test.class))
            {
                tests++;
                try
                {
                    //Methodumu kaldır. Burdaki  null ne zaman kullanıyorduk? Normalde Object veriliyor
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + " failed: " + exc);
                } catch (Exception exc) {
                    System.out.println("Invalid @Test: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
    }
}
