
package Day7;

public class EmployeeWageUC {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static void computeWage(String company, int Emp_RATE_PER_HR, int NUM_OF_WORKING_DAYS, int MAX_HR_IN_MONTH ) {

        int EmpHr = 0;
        int day=1;
        int Total_Emp_Hr=0;
        int EmpWage = 0;
        int totalEmpWage = 0;

        while (day <= NUM_OF_WORKING_DAYS && EmpHr < MAX_HR_IN_MONTH)
        {

            int empcheck = (int) (Math.floor(Math.random() * 10) % 3);

            switch (empcheck) {
                case IS_PART_TIME:
                    EmpHr = 4;
                    break;

                case IS_FULL_TIME:
                    EmpHr = 8;
                    break;

                default:
                    EmpHr = 0;
            }

            EmpWage = EmpHr * Emp_RATE_PER_HR;
            totalEmpWage += EmpWage;
            Total_Emp_Hr += EmpHr;

            System.out.println("Day " + day + " Employee Wage : " + EmpWage + "    Total Working Hr : " + Total_Emp_Hr);
            day++;
        }
        System.out.println("Toatal Emp Wage : " + totalEmpWage);
    }

    public static void main(String[] args) {
        EmployeeWageUC e=new EmployeeWageUC();
        computeWage("Jio",10,15,15);
        computeWage("Reliance", 20 , 2 , 10);
    }
}