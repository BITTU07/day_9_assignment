public class EmpwagebuilderUC2 {
    public static void main(String [] args) {
        int Is_FULL_TIME =1;
        int EMP_DAILY_WAGE_PER_HOUR =20;
        int empHrs =20;
        int empWage=0;
        double empCheck = Math.floor(Math.random() * 10 ) % 2;
        if ( empCheck == Is_FULL_TIME)
            empHrs=8;
        else
            empHrs=0;
        empWage= empHrs * EMP_DAILY_WAGE_PER_HOUR;
        System.out.println( " emp Daily wage:" + empWage);
    }
}
