import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Employee implements SetSpecialisation{

    private Specialisation specialisation;


    public Doctor(String name, String surname, int salary, Level level) {
        super(name, surname, salary, level);
    }
    public Doctor(){};

    public Specialisation getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(Specialisation specialisation) {
        this.specialisation = specialisation;
    }
    public void addDoctor(ArrayList<Employee> employees){
        Scanner scanner=new Scanner(System.in);

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
        System.out.println("Podaj specjalizacje (CARDIOLOGIST, NEUROLOGIST, ORTHOPEDIST): ");
        String inputSpecialisation = scanner.next();
        this.setSpecialisation(Specialisation.valueOf(inputSpecialisation));
        employees.add(this);
    }
}
