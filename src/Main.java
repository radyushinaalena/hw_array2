
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        System.out.println("Ежедневные траты: ");
        for (int i : arr) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = 200_001;
        int max = 99_000;
        System.out.println("Ежедневные траты: ");
        for (int i : arr) {
            System.out.println(i);
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double average = 0;
        double sum = 0;
        System.out.println("Ежедневные траты: ");
        for (int i : arr) {
            System.out.println(i);
            sum += i;
        }
        average = sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", average);
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char buf = 0;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            buf = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = buf;
        }
        System.out.print(reverseFullName);
    }
}


