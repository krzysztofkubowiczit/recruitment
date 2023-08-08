import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner=new Scanner(System.in);
        boolean systemDown=false;
        ArrayList<Employee> employees=new ArrayList<>();
        System.out.println("Witaj w rekrutacji!");
        while(!systemDown){
            System.out.println("Wybierz opcję:\n1.Wyświetl pracowników\n2. Dodaj pracownika\n3. Usuń pracownika\n4. Wyjdź");
            choice=scanner.nextInt();
            switch (choice){
                case(1)-> {
                    for (Employee employee:employees
                         ) {
                        System.out.print(employees.indexOf(employee)+1+". ");
                        System.out.println(employee.toString());

                    }
                }
                case(2)-> {
                    System.out.println("Chcę dodać:\n1. Doktora\n2. Górnika");
                    choice = scanner.nextInt();
                    String inputName;
                    if (choice == 1) {
                        Doctor doctor = new Doctor();
                        doctor.addDoctor(employees);
                    } else {
                        Miner miner = new Miner();
                        miner.addMiner(employees);
                    }

                }
                case(3)->{
                    System.out.println("Wybierz pracownika do usunięcia: ");
                    for (Employee employee:employees
                    ) {
                        System.out.print(employees.indexOf(employee)+1+". ");
                        System.out.println(employee.toString());

                    }
                    int toRemove= scanner.nextInt();
                    employees.remove(toRemove-1);
                }
                case(4)->systemDown=true;
            }
        }

    }
}