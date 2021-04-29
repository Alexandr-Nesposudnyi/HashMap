package com.company;

public class Main {

    public static void main(String[] args) {

        HashMapAlgoritm testMap = new HashMapAlgoritm();
        // вложил данные

        testMap.put(new Key(1) , new Value(01));
        testMap.put(new Key(2),new Value(10));
        // вложил в значение null

        testMap.put(new Key(100),new Value(null));
        // вывод данных по ключам
        System.out.println(testMap.get(new Key(1)).getValue());
        System.out.println(testMap.get(new Key(100)).getValue());

        // вывод размера
        System.out.println(testMap.size());

    }
}
