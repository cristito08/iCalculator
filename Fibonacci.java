public class Fibonacci {

        public static class ICalculator{

        private int[] fiboCalculator(int number){
            if (number < 0){
                System.out.println("Error: Fibonacci series does not calculate negative numbers");
                System.exit(0);
                return null;
            }
            int[] fibonacciSerie = new int[number];

            fibonacciSerie[0]= 0;
            fibonacciSerie[1]= 1;

            if (number == 0)
                return fibonacciSerie;
            if (number == 1)
                return fibonacciSerie;
            

            for(int i=2; i<number; i++){
                fibonacciSerie[i] = fibonacciSerie[i -1] + fibonacciSerie[i-2];
            }

            return fibonacciSerie;
        }

        public void serie10(){
            int number = 10;   
            int[] array = fiboCalculator(number);
            
            for(int i = 0; i < number; i++){
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args){
        ICalculator calc = new ICalculator();
        calc.serie10();

    }
}

