public class EmpWageBuilderUC1 {
    public static void main (String [] args) {
        int Is_Full_TIME =1;
        double empCheck =Math.floor(Math.random() *10) %2;
        if (empCheck == Is_Full_TIME)
            System.out.println(" Employee is Present");
        else
            System.out.println("Employee is absent");
    }
}
