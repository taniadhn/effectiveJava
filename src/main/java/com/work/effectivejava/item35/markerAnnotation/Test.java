package com.work.effectivejava.item35.markerAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Genelde Annotation'lar iki tane daha annotation almak zorunda
@Retention(RetentionPolicy.RUNTIME) // çalışma zamanında korunması gerektiğini belirtmektedir. Bu annotation Runtime iş yapacak
@Target(ElementType.METHOD) // bu notasyonun sadece metotlar üzerinde kullanılabileceğini belirtmektedir. Bu annotation Methodlarda geçerli


//Bir Annotation yazmak istediğimizde arayüz tasarlar gibi yazöamız gerekiyor. Ve interface başına @ eklememiz lazım
public @interface Test {  //aşağıda bizim bir annotation yazmaya başladığımızı gösteriyor. //Bu annotation bir Parametre almıyor
}
