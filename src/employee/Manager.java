package employee;


class Manager extends Employee {
    public Manager(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
        setSpecialAllowance(basicSalary * 0.2);
        setTransportAllowance(20000);
    }
}