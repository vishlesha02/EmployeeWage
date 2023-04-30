
package Day7;

public class EmployeeWageUC {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int Emp_RATE_PER_Hr=20;

        int empHrs=0;
        int empWage=0;
        double empcheck=Math.floor(Math.random()* 10)% 2;

        if(empcheck== IS_FULL_TIME)
        {
            empHrs=8;
        }
        else
        {
            empHrs=0;

        }
        empWage=empHrs * Emp_RATE_PER_Hr;
        System.out.println("Employee Wage : " + empWage);

    }
}