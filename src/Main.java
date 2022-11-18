import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
// 1 задача
//Объявите три массива:
//1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
//
//2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
//
//3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания
// массива: с помощью ключевого слова или сразу заполненный элементами.

        int[] nums = {1, 2, 3};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        int[] numsReverse = {1, 2, 3};
        for (int i = numsReverse.length - 1; i >= 0; i--) {
            System.out.print(numsReverse[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");

        double[] decimal = {1.57, 7.654, 9.986};
        for (int i = 0; i < decimal.length; i++) {
            System.out.print(decimal[i]);
            if (i != decimal.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(" ");

        double[] decimalReverse = {1.57, 7.654, 9.986};
        for (int i = decimalReverse.length - 1; i >= 0; i--) {
            System.out.print(decimalReverse[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println(" ");
        System.out.println(" ");

        String[] catsNames = {"Васька", "Кузя", "Барсик", "Мурзик", "Леопольд"};
        for (int i = 0; i < catsNames.length; i++) {
            System.out.print(catsNames[i]);
            if (i != catsNames.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(" ");

        String[] catsNamesReverse = {"Васька", "Кузя", "Барсик", "Мурзик", "Леопольд"};
        for (int i = catsNamesReverse.length - 1; i >= 0; i--) {
            System.out.print(catsNamesReverse[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println(" ");
        System.out.println(" ");

//4 задача
//Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
//Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать
// циклы. Распечатайте результат преобразования в консоль.

        int[] number = {1, 2, 3};
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] += 1;
                System.out.println(Arrays.toString(number));
            }
        }
        System.out.println(" ");

// Задание 1
//Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
//Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
//в формате: «Сумма трат за месяц составила … рублей».


        Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum += arr[i];
        }
            System.out.println("Сумма трат за месяц составила " + sum  + " рублей");
            // return arr;

//Задание 2
//Следующая задача — найти минимальную и максимальную трату за день. Нужно написать программу, которая решит
// эту задачу, и вывести в консоль результат в формате: «Минимальная сумма трат за день составила … рублей.
// Максимальная сумма трат за день составила … рублей».

        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
          if(arr[i] > max)
            max = arr[i];
          if(arr[i] < min)
            min = arr[i];
    }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей." +
                " Максимальная сумма трат за день составила " + max + " рублей.");

//Задание 3
//А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
//Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат
// за месяц поделить на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат
// за месяц составила … рублей».
//
//**Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).

        double average = sum/arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

//Задание 4
//Отойдем от подсчетов. В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О.
// сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ
// навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов (char[]).
//Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
// В качестве данных для массива используйте:
// char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//В результате в консоль должно быть выведено "Ivanov Ivan".
//
//**Важно**: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти
// по массиву циклом и распечатать его элементы в правильном порядке.

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(reverseFullName);
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println(" ");

//Задание 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = " ";
        fullName = fullName + lastName + firstName + middleName;
        System.out.println("ФИО сотрудника —" + fullName + " ");

//Задание 2
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);

//Задание 3
        String fullName2 = "Иванов Семён Семёнович";
        String newLetter = fullName2.replace('ё','е');
        System.out.println("Данные ФИО сотрудника — " + newLetter);

    }
}










