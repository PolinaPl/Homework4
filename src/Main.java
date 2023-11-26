public class Main {
    public static void main(String[] args) {

        System.out.println("Задача № 1");
            int age = 10;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
            } else {
                System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия," +
                        "нужно немного подождать.");
            }
        System.out.println("Задача № 2");
            int degree = 5;
            if (degree > 5) {
                System.out.println("На улице " + degree + " градусов, можно идти без шапки.");
            } else {
                System.out.println("На улице " + degree + " градусов, нужно надеть шапку.");
            }
        System.out.println("Задача № 3");
            int speed = 61;
            if (speed > 60) {
                System.out.println("Если скорость " + speed + " км/ч, то  придется заплатить штраф.");
            } else {
                System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно.");
            }
        System.out.println("Задача № 4");
            int vozrast  = 30;
            if (vozrast >= 2 && vozrast <= 6) {
                System.out.println("Если возраст человека равен " + vozrast + ", то ему нужно " +
                        "ходить в детский сад.");
            } else if (vozrast >= 7 && vozrast <= 17) {
                System.out.println("Если возраст человека равен " + vozrast + ", то ему нужно " +
                        "ходить в школу.");
            } else if (vozrast >= 18 && vozrast <= 24) {
                System.out.println("Если возраст человека равен " + vozrast + ", то ему нужно " +
                        "ходить в университет.");
            } else if (vozrast > 24) {
                System.out.println("Если возраст человека равен " + vozrast + ", то ему нужно " +
                        "ходить на работу.");
            }
        System.out.println("Задача № 5");
            int ageChild  = 15;
            if (ageChild < 5) {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то он не может кататься " +
                        "на аттракционе.");
            } else if (ageChild >= 5 && ageChild <= 14)  {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься " +
                        "на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься " +
                        "на аттракционе один.");
            }
        System.out.println("Задача № 6");
            int ticketPay = 70;
            if (ticketPay < 60) {
                System.out.println("В вагоне есть сидячие места.");
            } else if (ticketPay >=60 && ticketPay < 102) {
                System.out.println("В вагоне есть стоячие места.");
            } else {
                System.out.println("В вагоне мест нет.");
            }
        System.out.println("Задача № 7");
            int one = 5;
            int two = 7;
            int three = 2;
            if (one > two && one > three) {
                System.out.println("Самое большое число " + one);
            } else if (two > one && two > three) {
                System.out.println("Самое большое число " + two);
            } else {
                System.out.println("Самое большое число " + three);
            }




        }

        }

