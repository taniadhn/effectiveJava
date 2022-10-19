package com.work.effectivejava.item29;


///Neden Heterojenlığı  kullanıyorum: Bildiğiniz gibi veritabanında sütünlar ve satırlar vardır. Bu sütünlar herzaman String olmayabilir. String olabilir Farklı Obj alabilir. Da
///daha esnek bir yapı yapmal için Heterojen kullanabilir
/** Generic Type bir Class vardır*/
public class Column<T> {

    private final Class<T> type;

    public Column(Class<T> type) {  //Costructor larak bana bir sınıf type vermek zorunda
        this.type = type;
    }

    public T cast(Object obj){  //Benim girdim olan obj null ise null döndür null değilse bunu bir cast et

        return  obj == null ? null: type.cast(obj);
    }
}
