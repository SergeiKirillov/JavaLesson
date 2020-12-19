public interface IПримерИнтерфейс extends ICar {
    void Stop();
}
interface ICar {
    void Start();
}

class Запуск implements IПримерИнтерфейс{
    @Override
    public void Stop(){
        System.out.println("Stop");
    }
    public void Start(){
        System.out.println("Start");
    }

}