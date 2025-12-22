public class Main {
    public static void main(String[] args) {
        // Задание номер 1
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        } else {
            System.out.println(" Error ");
        }
        // Задание номер 2
        clientOS = 2;
        short clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println(" Error ");
        }
        // Задание номер 3
        short year = 2021;
        if (year % 4 == 0 && year % 100 != 0 && year >= 1584) {
            System.out.println(year + " год является високостным");
        } else if (year % 400 == 0 && year % 100 != 0 && year >= 1584) {
            System.out.println(year + " год является високостным");
        } else if (year < 1584) {
            System.out.println("Ошибка");
        } else {
            System.out.println(year + " год не является високостным");
        }
        // Задание номер 4
        int deliveryDistance = 60;
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 20 && deliveryDistance > 0) {
            System.out.println("Потребуется дней: 1");
        } else {
            System.out.println("Ошибка");
        }

        // Задание номер 5
        byte monthNumber = 9;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осень ");
                break;
            default: {
                System.out.println(" Ошибка ");
            }

        }
    }
}