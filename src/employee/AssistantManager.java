package employee;


class AssistantManager extends Employee {
    public AssistantManager(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
        setSpecialAllowance(basicSalary * 0.12);
        setTransportAllowance(12000);
    }
}