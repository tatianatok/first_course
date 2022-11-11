import java.util.Arrays;

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

        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        System.out.print(nums[0] +", ");
        System.out.print(nums[1] +", ");
        System.out.print(nums[2] +"  ");
        System.out.println(" ");
        System.out.print(nums[2] + ", ");
        System.out.print(nums[1] + ", ");
        System.out.print(nums[0]);

        System.out.println(" ");
        System.out.println(" ");

        double[] decimal = {1.57, 7.654, 9.986};
        for (int i = 0; i < decimal.length; i++) {
           System.out.print(decimal[i] + ", ");//Так и не смогла найти способ, как вывести данные через запятую, при том, чтоб в конке запятой не было
        }
        System.out.println(" ");
        double[] decimalReverse = {1.57, 7.654, 9.986};
        for (int i = decimalReverse.length - 1; i >= 0; i--) {
            System.out.print(decimal[i] + ", ");
        }
        System.out.println(" ");
        System.out.println(" ");

        String[] catsNames = {"Васька", "Кузя", "Барсик", "Мурзик", "Леопольд"};
        for (int i = 0; i < catsNames.length; i++) {
            System.out.print(catsNames[i] + ", ");
        }
        System.out.println(" ");

        String[] catsNamesReverse = {"Васька", "Кузя", "Барсик", "Мурзик", "Леопольд"};
        for (int i = catsNamesReverse.length - 1; i >=0; i--) {
            System.out.print(catsNamesReverse[i] + ", ");
        }
        System.out.println(" ");

//4 задача
//Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
//Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать
// циклы. Распечатайте результат преобразования в консоль.

        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < number.length; i++) {
            if (i % 2 == 0) {
                System.out.println(number[i]); //Не понимаю, куда записать +1, чтоб получчились четные вместо нечетных
            }
        }

    }
}