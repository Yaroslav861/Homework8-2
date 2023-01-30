public class Main {

    public static void calculateLeapYear(int leapYear) {

        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println(leapYear + " год - является високосным.");
        } else {
            System.out.println(leapYear + " год - не является високосным.");
        }
    }

    public static void identificationOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static int calculateDeliveryDistance(int DeliveryDistance) {
        if (DeliveryDistance <= 20) {
            return 1;
        } else if (DeliveryDistance <= 60) {
            return 2;

        } else if (DeliveryDistance <= 100) {
            return 3;
        } else {
            return 101;
        }

    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("Задание 1");
        int leapYear = 2025;
        calculateLeapYear(leapYear);
    }

    private static void task2() {
        System.out.println("Задание 2");
        int clientOS = 1;
        int clientDeviceYear = 2018;
        identificationOS(clientOS, clientDeviceYear);
    }


    private static void task3() {
        System.out.println("Задание 3");
        int DeliveryDistance = 105;
        int days = calculateDeliveryDistance(DeliveryDistance);
        if (days > 100) {
            System.out.println("Доставка на расстояние свыше 100км не доступна, ВАШЕ РАССТОЯНИЕ СОСТАВЛЯЕТ: " + DeliveryDistance + "КМ!");
        } else {
            System.out.println("Время доставки " + days + " дн.");
        }
    }
}