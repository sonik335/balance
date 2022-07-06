public class Main {
    public static void main(String[] args) {


        int x = 200; // баланс

        int s = 1050; // пополнение баланса в рублях

        int y = 100; // Стоимость 1-го бонусного рубля

        int bonus;


        if (s > 1000) {

            bonus = (s / y);

            System.out.println((s / y) + " бонусов ");
            System.out.println(bonus + (x + s) + " баланс ");
        } else {

            System.out.println(" нет бонусов " + (x + s) + " баланс ");
        }

    }
}
