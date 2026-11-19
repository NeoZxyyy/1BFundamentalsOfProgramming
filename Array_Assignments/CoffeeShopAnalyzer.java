public class CoffeeShopAnalyzer { // class name
    public static void main (String[] args) { // Entrance ng JVM

        // Variables
        int totalSales = 0;
        double averageSales = 0;
        int maxSales = 0;
        int minSales = 0;
        String bestday = "";
        String worstday = "";

        // Mga values ng array natin
        int[]weeklySales = {120,145,130,155,180,210,195};
        String[]daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        // for loop para ma output lahat ng values ng nasa array natin then print
        System.out.println("Java Beans!");
        System.out.println("=== Daily Sales ===");
        for (int i = 0; i<weeklySales.length; i++){
            System.out.println(daysOfWeek[i] + " sales: "+ weeklySales[i]);
        }
        System.out.println();

        // enhanced for loop para mag add lahat ng sales per day
        for (int sales : weeklySales){
            totalSales += sales;
        }

        // para makuha avg sales basically total sales divided kung ilan o length ng index ng array
        averageSales = (double) totalSales / weeklySales.length;

        // pag output ng total sales at avg sales
        System.out.println("==== Sales ====");
        System.out.println("Total sales: " + totalSales + " cups.");
        System.out.printf("Average sales: %,.2f cups.",  averageSales);

        // max and min sales kukunin ang value ng 0 index from array
        maxSales = weeklySales[0];
        minSales = weeklySales[0];

        // for loop para makuha ang highest and lowest sale at kung anong araw eto
        for (int j = 0; j < daysOfWeek.length; j++){
            if (maxSales < weeklySales[j]){
                maxSales = weeklySales[j];
                bestday = daysOfWeek[j];
            }
        }

        // output ang mga data
        System.out.println();
        System.out.println("\n===== Best and worst day =====");
        System.out.printf("Best day was %s with %d cups.\n",bestday,maxSales);
        System.out.printf("Worst day was %s with %d cups.",worstday,minSales);


    }
}
