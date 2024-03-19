public class Main {
    public static void main(String[] args) {
        {
            //task 1
            int os = 0;
            if (os == 0) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else if (os == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Ваша операционная система не поддерживается");
            }
        }
        {
            //task 2
            int year = 2013;
            int os = 0;
            if (os == 0) {
                if (year < 2015) {
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для IOS по ссылке");
                }
            } else if (os == 1) {
                if (year < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            } else {
                System.out.println("Ваша операционная система не поддерживается");
            }
        }
        {
            //task 3
            int year = 2021;
            if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
                System.out.println("високосный год");
            } else {
                System.out.println("не високосный год");
            }
        }
        {
            //task 4
            int deliveryDays = 0;
            int deliveryDistance = 95;
            if (deliveryDistance <= 20) {
                System.out.println("Доставка займет " + (deliveryDays = deliveryDays + 1) + " день");
            } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
                System.out.println("Доставка займет " + (deliveryDays = deliveryDays + 2) + " дня");
            } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                System.out.println("Доставка займет " + (deliveryDays = deliveryDays + 3) + " дня");
            } else {
                System.out.println("Доставки нет");
            }
        }
        {
            //task 5
            int monthNumber = 11;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("осень");
                    break;
                default:
                    System.out.println("такого месяца нет");
            }
        }

    }
}
