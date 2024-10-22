package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double overTimePayRate;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
        this.startTime = 0;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }


    public String getDepartment() {
        return department;
    }


    public double getPayRate() {
        return payRate;
    }


    public double getHoursWorked() {
        return hoursWorked;
    }


    public double getTotalpay() {
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return (40 * payRate) * ((hoursWorked - 40) * (payRate * 1.5));
        }
    }

    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 0;
        }
    }

    public double getOverTimePayRate() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public void punchIn(double time) {
        startTime = time;
    }
    public void punchOut(double time){
        double duration = time - startTime;
        hoursWorked += duration;
        startTime=0;
    }

}
