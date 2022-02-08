public class PerfectNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int perfectNumber = 24;
        int sumOfDivisior = 0;
        for (int index=1;index <=perfectNumber/2;index++)
        {
            if(perfectNumber % index == 0)
            {
                sumOfDivisior = sumOfDivisior + index;

            }
        }
        if(sumOfDivisior == perfectNumber)
        {
            System.out.println(perfectNumber + "is a perfect number");
        }
        else
        {
            System.out.println(perfectNumber + "is not a perfect number");

        }
    }

}