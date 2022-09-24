package com.work.effectivejava.item17;


//Eğer kalıtım kullanacaksanız Bunun Constructor içinde kesinlikle Override edilebilecek
//Bir method kullanmayın!!


public class Super {

    public Super(){

        override();
    }
//Bir Metodun Override edilmesini istemiyorsan. Onun için Public Private çevirdiğimde bana diyor ki methodu sil
    public void override(){

    }
}
