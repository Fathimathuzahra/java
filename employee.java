class Employee
{
String name;
String jobTitle;
double salary;

public Employee(String name, String jobTitle, double salary)
{
this.name = name;
this.jobTitle = jobTitle;
this.salary = salary;
}

public void updateSalary(double newSalary)
{
this.salary = newSalary;
}

public double getSalary()
{
return salary;
}

public String getDetails()
{
return "Name: " + name + ", job Title: " + jobTitle + ",Salary: " + salary;
}

public String getName()
{
return name;
}

public String getjobTitle()
{
return jobTitle;
}

public static void main(String[] args)
{
Employee emp1 = new
Employee("Zahra", "Software Engineer", 90000);

Employee emp2 = new
Employee("Shaikha", "Data science", 750000);

Employee highestPaid = (emp1.getSalary() > emp2.getSalary()) ? emp1 :emp2;

System.out.println("Highest paid employee: " + highestPaid.getName() + ", Job: " + highestPaid.getjobTitle());
}
}
