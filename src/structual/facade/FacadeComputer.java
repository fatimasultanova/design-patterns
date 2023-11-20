package structual.facade;

public class FacadeComputer implements ComputerService {

    private void cpu(String title){
        System.out.println("Cpu " + title);
    }

    private void storage(String title){
        System.out.println("Storage " + title);
    }

    private void audio(String title){
        System.out.println("Audio " + title);
    }


    @Override
    public void turnOnComputer() {
        String message = "turned on";
        cpu(message);
        storage(message);
        audio(message);

    }

    @Override
    public void turnOffComputer() {
        String message = "turned off";
        cpu(message);
        storage(message);
        audio(message);
    }
}
