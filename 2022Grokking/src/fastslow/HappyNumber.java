package fastslow;

public class HappyNumber {

    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        do{
            slow=findDigitSquareSum(slow);
            fast=findDigitSquareSum(findDigitSquareSum(fast));
        }while(slow != fast);

        return slow == 1;

    }

    int findDigitSquareSum(int n){
        int sum=0;
        int digit=0;

        while(n > 0){
            digit = n %10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;

    }

    public static void main(String[] args) {
        new HappyNumber().isHappy(19);
    }
}
