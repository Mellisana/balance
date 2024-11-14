public class Main {
    public static void main(String[] args) {

        int currentBalance = 100;// текущий баланс
        int amountUp = 300; // сумма пополнения


        int bonus = 0;             // начальное значение бонуса
        int totalBalance = 0;      // итоговый баланс

        if (amountUp >= 1000) {
            bonus = (amountUp / 100);//формула расчета бонусов
        }

        totalBalance = currentBalance + bonus + amountUp;//формула расчета итогового баланса при начислении бонусов

        if (bonus > 0) {
            System.out.println("Начислено " + bonus + " бонусных руб."); // Сообщение о начисленных бонусах
            System.out.println("Итоговый баланс: " + totalBalance + " руб."); // Итоговый баланс при начислении бонусов
        } else {
            System.out.println("Бонусные рубли отсутствуют.");
            System.out.println("Итоговый баланс: " + totalBalance + " руб."); // Итоговый баланс без бонусов
        }
    }
}