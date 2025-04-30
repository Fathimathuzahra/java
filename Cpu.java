class CPU {
    double price;

    public CPU(double price) {
        this.price = price;
    }

    class Processor {
        int numCores;
        String manufacturer;

        public Processor(int numCores, String manufacturer) {
            this.numCores = numCores;
            this.manufacturer = manufacturer;
        }

        public void displayProcessorInfo() {
            System.out.println("Processor Manufacturer: " + manufacturer);
            System.out.println("Number of Cores: " + numCores);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
 }

        public void displayRAMInfo() {
            System.out.println("RAM Manufacturer: " + manufacturer);
            System.out.println("Memory Size: " + memory + " GB");
        }
    }

    public void displayPrice() {
        System.out.println("CPU Price: $" + price);
    }

    public static void main(String[] args) {
        CPU cpu = new CPU(499.99);
        CPU.Processor processor = cpu.new Processor(8, "Intel");
        CPU.RAM ram = new CPU.RAM(16, "Corsair");

        cpu.displayPrice();
        processor.displayProcessorInfo();
        ram.displayRAMInfo();
    }
}
