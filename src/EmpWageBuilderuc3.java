public class EmpWageBuilderuc3 {
    public static void main( String [] args) {
        int Is_FULL_TIME =1;
        int Is_PART_TIME=2;
        int EMP_DAILY_WAGE_HOUR=20;
        int empHrs=0;
        int empWage=0;
        double empCheck =Math.floor(Math.random() * 10) % 3;
        if (empCheck == Is_FULL_TIME)
            empHrs=8;
        else if ( empCheck == Is_PART_TIME)
            empHrs=8;
        else
            empHrs=0;
        empWage= empHrs * EMP_DAILY_WAGE_HOUR;
        System.out.println(" emp wage: " +empWage);
    }
}
