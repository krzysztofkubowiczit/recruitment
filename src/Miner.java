import java.util.ArrayList;
import java.util.Scanner;

public class Miner extends Employee implements SetTool{
    private Tool tool;
    public Miner(String name, String surname, int salary, Level level) {
        super(name, surname, salary, level);
    }
    public Miner(){};
    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
    public void addMiner(ArrayList<Employee> employees){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String inputName = scanner.next();
        this.setName(inputName);
        System.out.println("Podaj nazwisko: ");
        String inputSurname = scanner.next();
        this.setSurname(inputSurname);
        System.out.println("Podaj wynagrodzenie: ");
        this.setSalary(scanner.nextInt());
        System.out.println("Podaj doświadczenie (JUNIOR,REGULAR,SENIOR): ");
        String inputLevel = scanner.next();
        this.setLevel(Level.valueOf(inputLevel));
        System.out.println("Podaj narzędzie (EXCAVATOR, BULLDOZER, PLOW): ");
        String inputTool = scanner.next();
        this.setTool(Tool.valueOf(inputTool));
        employees.add(this);
    }
}
