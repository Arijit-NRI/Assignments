public class Employee
{
    private int employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId,String employeeName) 
    {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
    }
    public int getEmployeeId()
    {
        return this.employeeId;
    }
    public void setEmployeeId(int employeeId)
    {
        this.employeeId=employeeId;
    }
    public String getEmployeeName()
    {
        return this.employeeName;
    }
    public void setEmployeeId(String employeeName)
    {
        this.employeeName=employeeName;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }

}