import java.util.Scanner;
class EmployeeUser {
    String name;
    String jobTitle;
    double salary;

    public EmployeeUser(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }

    public String getDetails() {
        return "Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for the first employee:");

        System.out.print("Name: ");
        String name1 = scanner.nextLine();

        System.out.print("Job Title: ");
        String jobTitle1 = scanner.nextLine();

        System.out.print("Salary: ");
        double salary1 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character left by nextDouble()

        EmployeeUser emp1 = new EmployeeUser(name1, jobTitle1, salary1);

        System.out.println("\nEnter details for the second employee:");

        System.out.print("Name: ");
        String name2 = scanner.nextLine();

        System.out.print("Job Title: ");
        String jobTitle2 = scanner.nextLine();

        System.out.print("Salary: ");
 double salary2 = scanner.nextDouble();

        EmployeeUser emp2 = new EmployeeUser(name2, jobTitle2, salary2);

        EmployeeUser highestPaid = (emp1.getSalary() > emp2.getSalary()) ? emp1 : emp2;

        System.out.println("\nHighest paid employee: " + highestPaid.getName() + ", Job: " + highestPaid.getJobTitle());

        scanner.close();
    }
}

