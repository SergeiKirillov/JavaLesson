public class Lesson11 {
    public static void main(String[] args){
        Toyota Corola = new Toyota();
        System.out.println("Lesson.main");
        System.out.println("Corolla имеет:");
        System.out.println("Кол-во мест--"+Corola.CountMest);
        System.out.println("Максимальная скорость--"+Corola.SpeedMaxCar());

        System.out.println();

        Toyota Bugati = new SportCar();
        System.out.println("Bugatti имеет:");
        System.out.println("Кол-во мест--"+Bugati.CountMest);
        System.out.println("Мах speed Bugatti -- "+Bugati.SpeedMaxCar());




    }
}

class SportCar extends Toyota{
    @Override
    public int SpeedMaxCar(){
        return 300;
    }
}