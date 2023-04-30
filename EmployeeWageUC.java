
package Day7;

public class EmployeeWageUC {
    public static void main(String[] args) {
        int IS_PART_TIME=1;
        int IS_FULL_TIME=2;
        int Emp_RATE_PER_Hr=20;

        int EmpWage=0;
        int EmpHrs=0;
        double empcheck=Math.floor(Math.random()* 10)% 3;


        if(empcheck==IS_PART_TIME)
        {
            EmpHrs=4;
        }
        else if(empcheck == IS_FULL_TIME)
        {
            EmpHrs=8;
        }
        else {
            EmpHrs=0;
        }
        EmpWage=EmpHrs*Emp_RATE_PER_Hr;
        System.out.println("Employee Wage : "+ EmpWage);

    }
}