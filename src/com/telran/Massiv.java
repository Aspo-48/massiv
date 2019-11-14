package com.telran;

public class Massiv {

    public static void main(String[] args) {

        System.out.println("Its test,dont worry andrej man,chill!");
        int[] Test = {1, 2, 3};


        System.out.println("git is best");

        System.out.println(Test[1]);
        System.out.println(Test.length);

        int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // fill in array2 with numbers
        int[] array2 = fillArray(20);
        System.out.println(array2[15]);

        // fill in array 3 with numbers 0,2,4,6...
        int[] array3 = fillArrayAgain(30);
        System.out.println(array3[1]);

        // mirror numbers in massiv
        int[] array4 = {1, 2, 3, 4};
        int[] array5 = reverse(array4);
        System.out.println(array5[0]);

        // mirror numbers again but better yk
        int[] toReverse = {1, 2, 3, 4, -56, 3};
        int[] alreadyReversed = reverse2(toReverse);
        System.out.println(alreadyReversed);


        System.out.println(isNumberInArray(10, new int[]{5, 2, 10, -13}));


        System.out.println(sumNumbersNonGreaterThanNInArray(10,new int[]{-11,15,8,5,20,4,-6}));//
    }


    static int[] fillArray(int length) {
        int[] res = new int[length];

        for (int i = 0; i < length; i++) {

            res[i] = i + 1;
        }
        return res;


    }

    static int[] fillArrayAgain(int length2) {
        int[] res2 = new int[length2];

        for (int i = 0; i < length2; i++) {
            res2[i] = i * 2;
        }
        return res2;
    }

    static int[] reverse(int[] array) {
        int[] res = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            res[i] = array[array.length - 1 - i];

        }
        return res;
    }

    static boolean areThereOddNumbers() {
        int[] result = new int[0];
        for (int i = 0; i < 10; i++) {
            result[i] = i;
            if (result[i] % 2 == 1) {
                return true;
            } else {
                break;
            }


        }
        return false;

    }

    static int[] reverse2(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array.length - 1 - i;

        }
        return result;
    }

    static int[] multipliePositiveNumBy3(int[] array) {
        int lenght = array.length;
        int[] result = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            if (array[i] > 0) {
                result[i] = array[i] * 3;
            } else {
                result[i] = array[i];

            }

        }
        return result;
    }

    static boolean isNumberInArray(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }

        }
        return false;

    }

    static int sumNumbersNonGreaterThanNInArray(int n, int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= n && array[i] % 2 == 0)
                sum+=array[i];

        }
        return sum;

    }

}

