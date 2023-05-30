public class Car {
    private void StartElectricity(){
        System.out.println("Start electricity");
    }
    private void StartCommand(){
        System.out.println("Start command");

    }
    private void StartFuelSystem(){
        System.out.println("Start fuel system");
    }
    // метод для показання роботи цього классу
    public void Start(){
        StartElectricity();
        StartCommand();
        StartFuelSystem();
        System.out.println();
    }
}

