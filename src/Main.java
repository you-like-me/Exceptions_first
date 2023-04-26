

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
        String[] sArray = {"first str", null, "third str"};
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        //division(10, 0);
        //printValueByIndex(array,12);
        //printStringArray(sArray);

        //Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
        // и возвращающий новый массив, каждый элемент которого равен разности элементов
        // двух входящих массивов в той же ячейке.
        //Если длины массивов не равны, необходимо как-то оповестить пользователя.
        int[] firstArray = getFilledArray(10);
        //int[] secondArray = getFilledArray(9);

        //int[] divArray = diffArrays(firstArray, secondArray);

        //Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
        // и возвращающий новый массив, каждый элемент которого равен частному элементов
        // двух входящих массивов в той же ячейке.
        //Если длины массивов не равны, необходимо как-то оповестить пользователя.
        //Важно: При выполнении метода единственное исключение, которое пользователь может
        // увидеть - RuntimeException, т.е. ваше.

        int[] secondArray = getFilledArray(10);
        int[] diffArray = diffArrays(firstArray, secondArray);
        printArray(diffArray);
    }
    //First task
    // division by zero
    public static void division(double firstNum, double secondNum){
        if(secondNum == 0)
            throw new ArithmeticException("На ноль делить нельзя! Код ошибки 101");
        double result = firstNum/secondNum;
        System.out.printf("Результат деления %f на %f равен %f.\n", firstNum, secondNum, result);
    }
    // out of bounds
    public static void printValueByIndex(int[] array, int index){
        if(index > array.length-1)
            throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не существует. Код ошибки 202");
        else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }

    // Null pointer exception
    public static void printStringArray(String[] sArray){
        for (String item: sArray){
            if(item == null)
                throw new NullPointerException("Элемент отсутствует! Код ошибки 303");
            System.out.println(item);
        }
    }
    //Second task
    public static int[] diffArrays(int[] firstArray, int[] secondArray) {
        if(firstArray.length != secondArray.length)
            throw new RuntimeException("Длины массивов не равны! Код ошибки 404");
        int[] resultArr = new int[firstArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = firstArray[i] - secondArray[i];
        }
        return resultArr;
    }

    public static int[] getFilledArray(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(20);
        }
        return array;
    }
    //Third task
    public static int[] divisionArrays(int[] firstArray, int[] secondArray) {
        if (firstArray == null || secondArray == null)
            throw new RuntimeException("Нет массивов! Код ошибки 505");
        if(firstArray.length != secondArray.length)
            throw new RuntimeException("Длины массивов не равны! Код ошибки 404");
        int[] resultArr = new int[firstArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = firstArray[i]/secondArray[i];
        }
        return resultArr;
    }

//    public static int[] getFilledArray(int length){
//        int[] array = new int[length];
//        Random rnd = new Random();
//        for (int i = 0; i < length; i++) {
//            array[i] = rnd.nextInt(1,20);
//        }
//        return array;
//    }

    public static void printArray(int[] array){
        for (int number: array){
            System.out.println(number);
        }
    }
}