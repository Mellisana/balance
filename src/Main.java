public class Main {
    public static void main(String[] args) {

        int currentBalance = 389;// текущий баланс
        int amountUp = 10000; // сумма пополнения


        if (amountUp >= 1000) ; // проверяем условие о пополнении на сумму свыше 1000
        int bonus = (amountUp / 100);// считаем бонус

        int totalBalance = currentBalance + bonus + amountUp;// итоговый баланс

        if (bonus > 0) {
            System.out.println("Начислено " + bonus + " бонусных руб."); // Сообщение о начисленных бонусах
            System.out.println("Итоговый баланс: " + totalBalance + " руб."); // Итоговый баланс при начислении бонусов
        } else {
            System.out.println("Бонусные рубли отсутствуют."); // Сообщение о том, что бонусы отсутствуют
            System.out.println("Итоговый баланс: " + totalBalance + " руб."); // Итоговый баланс без бонусов
        }
    }
}
