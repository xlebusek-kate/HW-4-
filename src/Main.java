public class Main {
    public static void main(String[] args) {
        // Задание номер 1
        byte clientOS;
        switch (clientOS) {
            case 0:
                System.out.println(" Установите версию приложения для iOS по ссылке ");
                break;
            case 1:
                System.out.println(" Установите версию приложения для Android по ссылке");
                break;
        }
        // Задание номер 2
        short clientDeviceYear = 2015;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    System.out.println(" Установите версию приложения для iOS по ссылке ");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear >= 2015) {
                    System.out.println(" Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
        }
        // Задание номер 3
        boolean trueOrFalse = true;
        short year = 2000;
        if (year >= 1584) {
            if (year % 400 != 0) {
                if (year % 100 != 0) {
                    if (year % 4 == 0) {
                        trueOrFalse = false;
                    }
                }
            }
        }
        if (true) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год  является високосным");
        }
        // Задание номер 4
        int deliveryDistance = 60;
        if (deliveryDistance <= 100) {
            if (deliveryDistance >= 60) {
                System.out.println("Потребуется дней: 3");
            } else if (deliveryDistance > 20) {
                System.out.println("Потребуется дней: 2");
            } else if (deliveryDistance <= 20 && deliveryDistance > 0) {
                System.out.println("Потребуется дней: 1");
            } else {
                System.out.println("Ошибка");
            }
        } else {
            System.out.println(" Доставки нет ");
        }
        // Задание номер 5
        byte monthNumber = 2;
        if (monthNumber <= 12) {
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
            }
        } else System.out.println(" Бред ");
    }
}