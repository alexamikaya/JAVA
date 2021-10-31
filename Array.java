package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Напишите программу, которая проверяет отсортирован ли массив по возрастанию. Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”");
        int[] first = {67, 32, 3, 87, 95, 5};

        Arrays.sort(first);
        System.out.println(Arrays.toString(first));
        for (int i = 1; i < first.length; i++) {
            if (first[i + 1] > first[i]) {
                System.out.println("OK");
                break;
            } else if (first[i - 1] < first[i]) {
                System.out.println("Please, try again");
                break;
            }
        }
        System.out.println("Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь вводит цифру 4), затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов.");
        System.out.println(" ");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int num = in.nextInt();
        int[] array = new int[num];
        System.out.print("Введите числа: ");
        for (int g = 0; g < num; g++) {
            array[g] = in.nextInt();
        }
        System.out.print("Введенные элементы: ");
        for (int g = 0; g < num; g++) {
            System.out.print(" " + array[g]);
        }
        System.out.println();

        System.out.println("Напишите метод, который меняет местами первый и последний элемент массива.");
        int[] second = {5, 6, 7, 2};
        int z = second[0];
        second[0] = second[second.length - 1];
        second[second.length - 1] = z;
        System.out.println(Arrays.toString(second));

        System.out.println("Вычислить N-е число Фибоначчи. Не использовать рекурсию и массивы, только циклы.");
        int k = 15; // количество элементов в массиве
        int[] arr = new int[k]; //создаем массив
        arr[0] = 0; //0-ой элемент
        arr[1] = 1; //1-ый элемент
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        } //складываем два предыдущих элемента
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]); //выводим на экран
        }


        System.out.println("Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием.");


        int nn = 10; //задаем величину массива

       int arrr []= new int[nn];//инициализируем массив
        for (int i = 0; i < arrr.length; i++) {
            arrr[i] = (int) (Math.random() * nn);
            // заполняем рандомными значениями

            System.out.print(arrr[i]); //массив после заполнения
            int right = arrr.length - 1;// последний элемент
            int left = 0;//нулевой элемент элемент
            quickSort(arrr, left, right); // вызываем метод быстрой сортировки


        }
        System.out.print(Arrays.toString(arrr)); //что стало

        System.out.println("\n\nДан массив чисел. Найдите первое уникальное в этом массиве число. \n" +
                "Например, для массива [1, 2, 3, 1, 2, 4] это число 3\n");
        int [] arrays = {1,2,3,1,2,4};
        System.out.println(findUniqueElement(arrays)); //выводим результат метода

    }
    public static int findUniqueElement(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            int j;//инициализируем переменную
            boolean flag = true;
            for (j = 0; j < arrays.length; j++)
                if (i != j && arrays[i] == arrays[j]) //сравниваем ячейки
                    break;
            if (j == arrays.length)
                return arrays[i];
        }

        return 0;
    }

    public static void quickSort(int[] arrr, int left, int right) {
        if (arrr.length == 0)
            return;//завершить выполнение если длина массива равна 0
        if (left >= right)
            return;//завершить выполнение если уже нечего делить
            if (left < right) {
                int pivotIndex = partition(arrr, left, right); //вызываем метод
                quickSort(arrr, left, pivotIndex - 1);  // сортировка в левом подмассиве
                quickSort(arrr, pivotIndex + 1, right); // сортировка в правом подмассиве

            }
        }
        private static int partition(int[] arrr, int left, int right) {
            int pivot = arrr[right];  // выберите крайний правый элемент в качестве опорного элемента
            int partitionIndex = left; // первый элемент больше, чем точка поворота
            /* переместить большие значения в правую часть массива */
            for (int i = left; i < right; i++) {
                if (arrr[i] <= pivot) { //если элементы меньше или равны крайнево правого элемента
                    swap(arrr, i, partitionIndex); //переносим их в левую часть
                    partitionIndex++;
                }
            }
            swap(arrr, partitionIndex, right); // вызываем метод перестановки
            return partitionIndex; //возвращаем точку поворота
        }

        private static void swap(int[] arrr, int i, int j) { //меняем местами
            int temp = arrr[i];
            arrr[i] = arrr[j];
            arrr[j] = temp;
            i++;
            j--;
        }









}
