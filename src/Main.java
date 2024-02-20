public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 и 2");
        int clientOS = 1;
        int yearRelease = 2017;
        if (clientOS == 0) {
            if (yearRelease < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if(clientOS == 1 && yearRelease < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        System.out.println("Задача 3");
        int year = 2300;
        if (year < 1584) {
            System.out.println(" ");
        } if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int daysDelivery = 1;
        if (deliveryDistance < 60){
            System.out.println("Мы доставим карту на ваш адрес!");
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней: " + daysDelivery);
            }
            else {
                System.out.println("Потребуется дней: " + (daysDelivery + 1));
            }
        }
        else {
            if (deliveryDistance > 60 && deliveryDistance < 100){
                System.out.println("Потребуется дней для доставки: " + (daysDelivery + 2));
            } else {
                System.out.println("Доставки нет, простите!");
            }
        }

        System.out.println("Задача 5");
        int monthNumber = 14;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц весенний");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц осенний");
            default:
                System.out.println("Такого месяца не существует");
                break;
        }
    }
}