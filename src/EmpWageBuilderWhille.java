public class EmpWageBuilderWhille {


        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_DAILY_WAGE_PER_HOUR = 20;
        public static final int NUM_OF_WORKING_DAYS = 20;
         public static final int MAX_HRS_IN_MONTH_DAYS = 100;

        public static void main(String[] args) {
            int empHrs = 0;
            int empWage = 0;
            int totalEmpHrs=0;
            int totalWorkingdays = 0;
            while (totalEmpHrs <= MAX_HRS_IN_MONTH_DAYS || totalWorkingdays < NUM_OF_WORKING_DAYS);{
                totalWorkingdays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case IS_PART_TIME:
                        empHrs = 8;
                        break;
                    case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                    default:
                        empHrs = 0;

                }
                totalEmpHrs=totalEmpHrs + empHrs;
                System.out.println("Day#: "+ totalWorkingdays + "employee hour: "+empHrs);
            }
            int totalEmpwage= totalEmpHrs * EMP_DAILY_WAGE_PER_HOUR;
            System.out.println(" total employee wage:" + totalEmpwage);
        }
    }


