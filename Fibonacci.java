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

        public void createSerie(){
            int number = 10;   
            int[] array = fiboCalculator(number);
            
            for(int i = 0; i < number; i++){
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args){
        ICalculator print10numbers = new ICalculator();
        print10numbers.createSerie();
        Calculator print20numbers = new Calculator();
        print20numbers.createSerie();

    }

    public static class Calculator extends ICalculator{

        public int addition(int num1, int num2){
            return num1 + num2;
        }

        public int substract(int num1, int num2){
            return num1 - num2;
        }

        @Override
        public void createSerie(){
            int number = 20;   
            int[] array = super.fiboCalculator(number);
            
            for(int i = 0; i < number; i++){
                System.out.println(array[i]);
            }
        }
    }
}

