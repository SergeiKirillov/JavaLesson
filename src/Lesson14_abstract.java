public class Lesson14_abstract {
    public static void main(String[] args) {
        SmallTransport vw = new SmallTransport();
        vw.Name("Passat b3");
        vw.Run(10);
        vw.Stop(5);


        BigTransport Tatra = new BigTransport();
        Tatra.Name("Tatra");
        Tatra.Run(50);
        Tatra.Stop(20);


    }
}

abstract class Transport{
    void Stop(int x){
        for (int i = x; i > 0; i--) {
            System.out.println("До остановки "+i+" секунд");
        }
    }
    void Name(String nameTrasport){
        System.out.println(" Имя транспорта "+nameTrasport);
    }
    abstract void Run(int x);
}

class SmallTransport extends Transport{
    @Override
    void Run(int x){
        for (int i = x; i > 0 ; i--) {
            System.out.println("До максимальной скорости осталось " + i + "секунд.");
        }

    }
}

class BigTransport extends Transport{
    @Override
    void Run(int x){
        for (int i = x; i > 0 ; i--) {
            System.out.println("До максимальной скорости осталось " + i + "секунд.");
        }
    }
}