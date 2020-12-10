public class Lesson10 {
    public static void main(String[] args){
        Toyota Corola = new Toyota();
        System.out.println("Corolla имеет:");
        System.out.println("Кол-во мест--"+Corola.CountMest);
        System.out.println("Максимальная скорость--"+Corola.SpeedMaxCar());

    }
}
class Car{
    private int MaxSpeed = 250;
    public int SpeedMaxCar(){
        return MaxSpeed;
    }

}

class Toyota extends Car{
    public int CountMest = 2;
}