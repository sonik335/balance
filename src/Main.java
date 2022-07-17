public class Main {
    public static void main(String[] args) {


        int balans = 191; // баланс

        int replenishment = 1350; // пополнение баланса в рублях

        int bonusValue = 100; // Стоимость 1-го бонусного рубля

        int bonus;


        if (replenishment > 1000) {

            bonus = (replenishment / bonusValue);

            System.out.println((replenishment / bonusValue) + " бонусов ");
            System.out.println(bonus + (balans + replenishment) + " баланс ");
        } else {

            System.out.println(" нет бонусов " + (balans + replenishment) + " баланс ");
        }

    }
}
