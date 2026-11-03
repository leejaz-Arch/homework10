//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");

        int[] numbers = new int[]{1, 2, 3};

        System.out.println("Первый элемент: " + numbers[0]);
        System.out.println("Второй элемент: " + numbers[1]);
        System.out.println("Третий элемент: " + numbers[2]);
        System.out.println("Длина массива: " + numbers.length);

        double[] decimals = new double[]{1.57, 7.654, 9.986};

        System.out.println("Первый элемент: " + decimals[0]);
        System.out.println("Второй элемент: " + decimals[1]);
        System.out.println("Третий элемент: " + decimals[2]);
        System.out.println("Длина массива: " + decimals.length);

        String[] languages = new String[]{"Java", "Python", "JavaScript"};

        System.out.println("Первый язык: " + languages[0]);
        System.out.println("Второй язык: " + languages[1]);
        System.out.println("Третий язык: " + languages[2]);
        System.out.println("Длина массива: " + languages.length);

        System.out.println("Задание №2");


        int[] numbers1 = new int[]{1, 2, 3};
        double[] decimals1 = new double[]{1.57, 7.654, 9.986};
        String[] languages1 = new String[]{"Java", "Python", "JavaScript"};

        for (int i = 0; i < numbers1.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers1[i]);
        }
        System.out.println();


        for (int i = 0; i < decimals1.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(decimals1[i]);
        }
        System.out.println();


        for (int i = 0; i < languages1.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(languages1[i]);
        }

        System.out.println("Задание №3");

        int[] numbers2 = new int[]{1, 2, 3};
        double[] decimals2 = new double[]{1.57, 7.654, 9.986};
        String[] languages2 = new String[]{"Java", "Python", "JavaScript"};

        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.print(numbers2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = decimals2.length - 1; i >= 0; i--) {
            System.out.print(decimals2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = languages2.length - 1; i >= 0; i--) {
            System.out.print(languages2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задание №4");

        int[] numbers3 = new int[]{1, 2, 3, 4, 5, 7, 10};

        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] % 2 != 0) {
                numbers3[i] += 1;
            }
        }

        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i]);

            if (i < numbers3.length - 1) {
                System.out.print(", ");
            }
        }





    }
}