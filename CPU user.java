import java.util.Scanner;

public class CPU {
    double price;

    CPU(double price) {
        this.price = price;
    }

    class Processor {
        int numberOfCores;
        String manufacturer;

        Processor(int numberOfCores, String manufacturer) {
            this.numberOfCores = numberOfCores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Processor Info:");
            System.out.println("  Cores: " + numberOfCores);
            System.out.println("  Manufacturer: " + manufacturer);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("RAM Info:");
            System.out.println("  Memory: " + memory + "GB");
            System.out.println("  Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CPU price: ");
        double price = sc.nextDouble();

        CPU cpu = new CPU(price);

        System.out.print("Enter number of Processor cores: ");
        int cores = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Processor manufacturer: ");
        String procMan = sc.nextLine();

        CPU.Processor processor = cpu.new Processor(cores, procMan);

        System.out.print("Enter RAM size in GB: ");
        int memory = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter RAM manufacturer: ");
        String ramMan = sc.nextLine();

        CPU.RAM ram = new CPU.RAM(memory, ramMan);

        System.out.println("\n--- CPU Specifications ---");
        System.out.println("CPU Price: $" + cpu.price);
        processor.display();
        ram.display();

        sc.close();
    }
}
