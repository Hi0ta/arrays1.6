import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arrCosts = generateRandomArray();
        System.out.println(Arrays.toString(arrCosts));
        //  int[] arrCosts = {157_598, 176_054, 199_860, 165_455, 155_645, 186_099, 154_761, 187_563, 113_021, 108_225, 167_568, 199_997, 109_860, 100_005, 155_644, 188_109, 144_771, 107_503, 143_421, 128_215, 187_568, 156_004, 191_861, 162_225, 185_624, 181_192, 153_758, 183_354, 110_012, 105_378};
        // for (int i = 0; i < arrCosts.length; i++) {
        // System.out.println(i+1 + " число: " + arrCosts[i]);
        // }
        System.out.println("Задание 1");

        // Задание 1
        int monthlyPaymentAmount = 0;
        // for (int index = 0; index < arrCosts.length; index++) {
        //    monthlyPaymentAmount += arrCosts[index];
        //  }
        for (int element : arrCosts) {
            monthlyPaymentAmount += element;
        }
        System.out.println("Сумма трат за месяц составила " + monthlyPaymentAmount + " рублей");


        System.out.println("Задание 2");
        // Задание 2
        int monthlyPaymentMin = 200_000;
        int monthlyPaymentMax = 100_000;
        for (int index = 0; index < arrCosts.length; index++) {
            if (arrCosts[index] > monthlyPaymentMax) {
                monthlyPaymentMax = arrCosts[index];
            }
            if (arrCosts[index] < monthlyPaymentMin) {
                monthlyPaymentMin = arrCosts[index];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + monthlyPaymentMin + " рублей");
        System.out.println("Максимальная сумма трат за день составилa " + monthlyPaymentMax + " рублей");

        System.out.println("Задание 3");

        // Задание 3
        double averageSpendingPerMonth = 0.0;

        //for (int index = 0; index < arrCosts.length; index++) {
        //  averageSpendingPerMonth += arrCosts[index];
        //}
        // averageSpendingPerMonth = averageSpendingPerMonth / arrCosts.length;

        averageSpendingPerMonth = monthlyPaymentAmount / arrCosts.length;

        System.out.println("Средняя сумма трат за месяц составила " + averageSpendingPerMonth + " рублей");


        System.out.println("Задание 4");
        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        // System.out.println(reverseFullName);
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


        System.out.println();
        System.out.println("Задание 5");
        // Задание 5
        int size = 3;
        int number = 1;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = number;
            matrix[i][size - i - 1] = number;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }


        System.out.println("Задание 6.1");
        // Задание 6.1 (до разбора домашки)
        int[] arrNumbers = {9, 6, 1, 8, 2};
        System.out.println(Arrays.toString(arrNumbers));
        int[] arrNumbers2 = new int[arrNumbers.length];
        int k = 0;
        int l = arrNumbers.length - 1;
        for (; l >= 0; ) {
            arrNumbers2[k] = arrNumbers[l];
            ++k;
            l--;
        }
        arrNumbers = arrNumbers2;

        //  Или Arrays.sort(arrNumbers);
        System.out.println(Arrays.toString(arrNumbers));


        System.out.println();
        System.out.println("Задание 6.2");
        // Задание 6.2 (после разбора домашки)
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[arr.length - 1 - i] = arr[i];
        }
        arr = arr2;
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println("Задание 7");
        // Задание 7

        int[] arrChaoticNumbers = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(arrChaoticNumbers));
        for (int m = arrChaoticNumbers.length - 1; m >= 0; m--) {
            System.out.print(arrChaoticNumbers[m] + ", ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Задание 8 и 9");
        // Задание 8 и 9

        int[] arrForFound = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arrForFound);
        // System.out.println(Arrays.toString(arrForFound));
        int bingo = -2;
        int x = 0;
        int y = x + 1;
        while (x < arrForFound.length) {
            for (; y < arrForFound.length; y++)
                if (arrForFound[x] + arrForFound[y] == bingo) {
                    System.out.println(arrForFound[x] + ", " + arrForFound[y]);
                }
            x++;
            y = x + 1;
        }


    }
}






