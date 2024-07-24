package main;

import person.Person;

public class Main{
    public static void main(String[] args){
    	//person1を生成し、名前を"鈴木太郎"、年齢を20、身長を1.7、体重を60として初期化
        Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
        //person1のprint()メソッドの呼び出し
        person1.print();
        //person2を生成し、名前を"山田花子"、年齢を22、身長を1.5、体重を40として初期化
        Person person2 = new Person("山田", "花子", 22, 1.5, 40);
        //person2のprint()メソッドの呼び出し
        person2.print();
        //printCount()メソッドの呼び出し
        Person.printCount();
    }
}