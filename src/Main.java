public class Main {
    public static void main(String[] args) {
        int age = 23;
        if (age >= 18) {
            System.out.println("Если возраст человека равен,то совершеннолетний");
        }

        if (age < 18) {
            System.out.println("Если возраст человека равен,то он Несовершеннолетний ");
        }
        System.out.println("Задача 2");
        int temperature = 2;
        if (temperature < 5) {
            System.out.println("На улице" + temperature + "холодно нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло" + temperature + "можно идти без шапки");
        }
        System.out.println("Задача 3");
        int speed = 67;
        if (speed > 60) {
            System.out.println("Если скорость" + speed + "это больше 60 км.ч,то скорость превышена,придется заплатить штраф");
        } else {
            System.out.println("Если скорость" + speed + " это меньше 60 км.ч,то превышения скорости нет,можно езлдить спокойно");
        }
        System.out.println("задача 4");
        int year = 32;
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человека равен" + year + "то ему нужно ходить в садик ");
        } else if (year >= 7 && year <= 17) {
            System.out.println("Если возраст человека равен " + year + "то ему нужно ходить в школу");
        } else if (year >= 18 && year <= 24) {
            System.out.println("Если возраст равен" + year + "то ему нужно ходить в универ");
        }else if (year >= 24) {
            System.out.println("Если возраст равен" + year + "то ему нужно ходить на работу");
        }
        System.out.println("Задача 5");
        int children = 16;
        if (children < 5) {
            System.out.println("если ребенку меньше" + children + "то он не может кататься на аттракционе");
        } else if (children >=5 && children <=14) {
            System.out.println("если ребенку больше"+children+"но меньше"+children+"то он может кататься в сопровождении взрослого");
        } else if (children >14) {
            System.out.println("если ребенку больше "+children+"то он может кататься один");
        }
        System.out.println("задача 6");
        int railway = 35;
        int railwatseat = 40;
        if (railway > 120) {
            System.out.println("В вагоне " + railway + " человек то в вагоне нет места");
        } else {
            System.out.println("Если вагоне" + railway + "то в вагоне есть места");
        }
        if (railwatseat > 60) {
            System.out.println("если в вагоне" + railwatseat + "то в вагоне остались только стоячие места");
        } else {
            System.out.println("Если в вагоне" + railwatseat + "то в вагоне остались сидячие места");
        }
        System.out.println("задача 7");
        int apple = 1;
        int baby = 2;
        int cross = 3;
        if ((cross > baby) && (baby>apple)  ){
            System.out.println("Если "+cross+"больше чем "+baby+"то "+cross+"будет большее число" );
    }else {
            System.out.println("если"+baby+"больше чем"+apple+"и меньше чем "+cross+"то полкчается"+cross+"будет наибольшое число");
        }
        System.out.println("Сделано!");
    }
}








