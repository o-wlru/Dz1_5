package ru.sky.pro;

public class Main {

    public static void main(String[] args) {
        // write your code here


        //Задание 1
        System.out.println("Задание 1");

        //первый массив, целочисленный
        int[] per = new int[3];
        per[0] = 1;
        per[1] = 2;
        per[2] = 3;
        //второй массив, дробный
        float[] vtor = {1.57f, 7.654f, 9.986f};
        //третий массив, произвольный
        float[] tret = new float[5];
        tret[0] = 12;
        tret[1] = 2.54f;
        tret[2] = 117;
        tret[3] = 27;
        tret[4] = 48.9f;


        //Задание 2
        System.out.println("Задание 2");

        //вывод первого массива
        for (int i = 0; i < 3; i++) {
            if (i != per.length - 1) {
                System.out.print(per[i] + ", ");
            } else {
                System.out.println(per[i]);
            }
        }
        //вывод второго массива
        for (int a = 0; a < 3; a++) {
            if (a != vtor.length - 1) {
                System.out.print(vtor[a] + ", ");
            } else {
                System.out.println(vtor[a]);
            }
        }
        //вывод третьего массива
        for (int b = 0; b < 5; b++) {
            if (b != tret.length - 1) {
                System.out.print(tret[b] + ", ");
            } else {
                System.out.println(tret[b]);
            }

        }

        //Задание 3
        System.out.println("Задание 3");

        //Обратный вывод первого массива
        for (int i = per.length-1; i >= 0; i--)
            if (i >= 1) {
                System.out.print(per[i] + ", ");
            } else {
                System.out.println(per[i]);
            }




        //обратный вывод второго массива
        for (int i = vtor.length-1; i >= 0; i--)
            if (i >= 1) {
                System.out.print(vtor[i] + ", ");
            } else {
                System.out.println(vtor[i]);
            }

        //обратный вывод третьего массива
        for (int i = tret.length-1; i >= 0; i--)
            if (i >= 1) {
                System.out.print(tret[i] + ", ");
            } else {
                System.out.println(tret[i]);
            }


        //Задание 4
        System.out.println("Задание 4");

        // Перевод нечетных элементов массива в четные
        for (int i = 0; i < 3; i++) {
            if (i != per.length) {
                if (per[i] % 2 != 0) {
                    per[i] = per[i]+1;
                }

                System.out.print(per[i] + ", ");
            } else {
                System.out.println(per[i]);
            }
        }






            }

        }
