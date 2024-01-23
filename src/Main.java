public class Main {
    public static void main(String[] args) {
        /* первое задание */
        int a = 50000;
        System.out.println(a);
        byte b = 120;
        System.out.println(b);
        short c = 32000;
        System.out.println(c);
        long d = 300000000000L;
        System.out.println(d);
        float e = 3.14f;
        System.out.println(e);
        double f = 3.14159265358979323846264338327950288419716939937510582097f;
        System.out.println(f);
        /* второе задание */
        float fl = 27.12f;
        long lg = 987678965549L;
        float fl1 = 2.786f;
        short sh = 569;
        short sh1 = -159;
        short sh2 = 27897;
        byte bt = 67;
        /* третье задание */
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short paper = 480;
        byte sum = (byte) (teacher1 + teacher2 + teacher3);
        int res = paper / sum;
        System.out.println("На каждого ученика расчитано " + res + " листов бумаги.");
        /* четвертое задание */
        int boutle = 16;
        int min = 2;
        int speed = boutle / min;
        int time = 20;
        int product = (speed * time);
        System.out.println("За 20 минут машина произвела " + product + " штук бутылок");
        time = 1440;
        product = speed * time;
        System.out.println("За сутки машина произвела " + product + " штук бутылок");
        time = 3 * time;
        product = speed * time;
        System.out.println("За три дня машина произвела " + product + " штук бутылок");
        time = (time / 3) * 30;
        product = speed * time;
        System.out.println("За месяц машина произвела " + product + " штук бутылок");
        /* пятое задание */
        byte whytePaint = 2;
        byte brownPaint = 4;
        byte totalCans = 120;
        byte summ = (byte) (whytePaint + brownPaint);
        byte clas = (byte) (totalCans / summ);
        byte brown = (byte) (clas * brownPaint);
        byte whyte = (byte) (clas * whytePaint);
        System.out.println("В школе, где " + clas + " классов, нужно " + whyte + " банок белой краски и " + brown + " банок коричневой краски");
        /* шестое задание */
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        short mass = (short) (banana * 5 + milk * 2 + iceCream * 2 + egg * 4);
        float massKilo = mass / 1000f;
        System.out.println(massKilo);
        System.out.println(mass);
        /* седьмое задание */
        int sport = 7000;
        short q1 = 250;
        short q2 = 500;
        short day1 = (short) (sport / q1);
        short day2 = (short) (sport / q2);
        short dayMid = (short) ((day1 + day2) / 2);
        System.out.println(day1);
        System.out.println(day2);
        System.out.println(dayMid);
        /* восьмое задание */
        float Masha = 67760f;
        float Den = 83690f;
        float Krist = 76230f;
        float Masha10 = Masha * 1.1f;
        float Den10 = Den * 1.1f;
        float Krist10 = Krist * 1.1f;
        float MashaGod = Masha10 * 12 - Masha * 12;
        float DenGod = Den10 * 12 - Den * 12;
        float KristGod = Krist10 * 12 - Krist * 12;
        System.out.println();
        System.out.println("Маша теперь получает " + Masha10 + " рублей. Годовой доход вырос на " + MashaGod);
        System.out.println("Маша теперь получает " + Den10 + " рублей. Годовой доход вырос на " + DenGod);
        System.out.println("Маша теперь получает " + Krist10 + " рублей. Годовой доход вырос на " + KristGod);
    }
}