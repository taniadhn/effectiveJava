package com.work.effectivejava.item21;



public class TestDrive {
public static void main(String[] args){
    	/*
		 * statik olan iç içe geçmiş sınıflar (static nested classes)
		   statik olmayan iç içe geçmiş sınıflar (non-static nested classes)
		   yerel sınıflar (local classes)
		   anonim sınıflar (anonymous classes)
		 *
		 */
/*

    //Static MethodN
    StaticNested.staticNestedClass st = new StaticNested.staticNestedClass();
    // HesapMakinesi.Operasyon.TOPLA
    //Builder ders kullandık

    ////NonStatic
    //OpenFor a memory leak
    NonStaticNested ns = new NonStaticNested();

    //Inner sınıfa ulaşıp ikinci nesneyi oluşturuyoruz
    //Ana sınıfa bağlılık var Nesne oluştururken
    NonStaticNested.NonStaticNestedClass n = ns.new NonStaticNestedClass();
   /// n.yazBunu();
*/

    LocalClass lc = new LocalClass();

   /* // Anonim
    SuperClass sc = new SuperClass() {
        @Override
        public void yazBeni() {
            System.out.println("anonim");
        }
    };

		sc.yazBeni();

*/

    SuperClassDerin scd = new SuperClassDerin() {
        @Override
        public void yazBeni() {
            System.out.println("Anonim");
        }
    };
    scd.yazBeni();

}
}