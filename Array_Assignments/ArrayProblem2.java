public class ArrayProblem2 { // Array Utility para ma access ung array class
    public static void main(String[] args) { // Entry point ng JVM

        //  Values ng Variable/Array ng Temperatures
        double[]temperatures = { 32.5, 34.0, 31.8, 33.2,35.1};

        // Nag print lang ako ng title sir
        System.out.println("Temperatures");

        // For loop tapos gumamit ng .length para ma print lahat ng nasa array
        //dahil yang .length kinukuha kung gaano kadami karga ng nasa Array
        for(int i = 0; i < temperatures.length; i++){
            System.out.print(temperatures[i]+" ");
        }
        // papalitan neto kung ano yung nasa Temperature index 2 from 31.8 to 32.0
        temperatures[2] = 32.0;

        // nag add langf ako space para mas maganda kapag nasa  console na
        System.out.println();

        // title lang ng updated na temperature ( day 3 )
        System.out.println("\nUpdated 3rd Day");

        // same for loop langf sa kanina
        for(int i = 0; i < temperatures.length; i++){
            System.out.print(temperatures[i]+" ");


        }
    }
}
