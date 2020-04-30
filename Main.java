package ru.geekbrains.java3.hw1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"sadf", "dffg", "jhfr"} ;
        swap(arr1,1,4);
        swap(arr2,0,2);

        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);

        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        System.out.println("Задание 3");
        System.out.println("добавляем фрукты");
        orangeBox.addFruit(new Orange(),10);
        orangeBox1.addFruit(new Orange(),12);
        appleBox.addFruit(new Apple(),8);
        appleBox1.addFruit(new Apple(),4);
        System.out.println("коробка 1: "+orangeBox.getWeight());
        System.out.println("коробка 2: "+orangeBox1.getWeight());
        System.out.println("коробка 3: "+appleBox.getWeight());
        System.out.println("коробка 4: "+appleBox1.getWeight());
        System.out.println("сравниваем");
        System.out.println("коробка 1 равна коробке 3: "+orangeBox.compare(appleBox));
        System.out.println("коробка 2 равна коробке 4: "+orangeBox1.compare(appleBox1));
        System.out.println("пересыпаем");
        orangeBox.pourTo(orangeBox1);
        appleBox.pourTo(appleBox1);
        System.out.println("вычисляем вес коробки");
        System.out.println("коробка 1: "+orangeBox.getWeight());
        System.out.println("коробка 2: "+orangeBox1.getWeight());
        System.out.println("коробка 3: "+appleBox.getWeight());
        System.out.println("коробка 4: "+appleBox1.getWeight());


    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Задание 1: "+Arrays.toString(arr));
        Object tmp = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=tmp;
        System.out.println("Результат замены: "+Arrays.toString(arr));
    }
    public static <T> void asList(T[]arr){
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Результат задания 2: "+alt);
    }
}