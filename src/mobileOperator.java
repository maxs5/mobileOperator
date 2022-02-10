public class mobileOperator {
    public static void main(String[] args) {
        int score = 100;
        int deposit = 1500;
        int amount = score + deposit;

        int bonus;
        int finish;
        if (deposit > 1000) {
            bonus = deposit / 100;
            finish = amount + bonus;
            System.out.println("Ваш бонусный счет: " + bonus + " рубль(ей)");
            System.out.println("Ваш счет: " + finish + " рубль(ей)");}
        else {
            System.out.println("Ваш счет: " + amount + " рубль(ей)");
        }

    }
}