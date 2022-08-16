public class Main {
    public static void main(String[] args) {



        int [] arrCosts = {157_598, 176_054, 199_860, 165_455, 155_645, 186_099, 154_761, 187_563, 113_021, 108_225, 167_568, 199_997, 109_860, 100_005, 155_644, 188_109, 144_771, 107_503, 143_421, 128_215, 187_568, 156_004, 191_861, 162_225, 185_624, 181_192, 153_758, 183_354, 110_012, 105_378};
       // for (int i = 0; i < arrCosts.length; i++) {
       // System.out.println(i+1 + " число: " + arrCosts[i]);
       // }
        System.out.println("Задание 1");

        // Задание 1
           int monthlyPaymentAmount = 0;
        // for (int index = 0; index < arrCosts.length; index++) {
        //    monthlyPaymentAmount += arrCosts[index];
        //  }
            for (int element: arrCosts) {
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

        for (int index = 0; index < arrCosts.length; index++) {
            averageSpendingPerMonth += arrCosts[index];
        }
            averageSpendingPerMonth = averageSpendingPerMonth / arrCosts.length;

        System.out.println("Средняя сумма трат за месяц составила " + averageSpendingPerMonth + " рублей");


        System.out.println("Задание 4");
        // Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        // System.out.println(reverseFullName);
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}





