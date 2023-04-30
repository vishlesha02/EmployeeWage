
package Day7;

public class EmployeeWageUC {
    static final  int IS_PART_TIME=1;
    static final int IS_FULL_TIME=2;
    static  final  int Emp_RATE_PER_HR=20;

    public static void main(String[] args) {


        int EmpHr=0;
        int EmpWage=0;
        int empcheck= (int) (Math.floor(Math.random()* 10 )% 3);

        switch(empcheck)
        {
            case IS_PART_TIME:
                EmpHr=4;
                break;

            case IS_FULL_TIME:
                EmpHr=8;
                break;

            default:
                EmpHr=0;
        }
        EmpWage=EmpHr*Emp_RATE_PER_HR;
        System.out.println("Employee Wage : " + EmpWage);
    }
}