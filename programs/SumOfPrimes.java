public class SumOfPrimes {
    public static void main(String[] args){
        int sum=0;
        for(int i=2;i<=100;i++){
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                sum+=i;
            }
        }
        System.out.println("sum of prime numbers upto 100 is : "+sum);
    }
}
