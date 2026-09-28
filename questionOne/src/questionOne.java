public class questionOne {
    public static void main(String[] args){

        //Cities
        String[] cities = {
                "CAPE TOWN",
                "PORT ELIZABETH",
                "PRETORIA"
        };
        //Console types
        String[] consoles = {
                "PS5",
                "XBOX",
                "SWITCH"
        };

        //Console Sales
        int[][] sales = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200}
        };

        System.out.println("---------------------------------------------------");
        System.out.println("     GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------------");

        System.out.printf("%-20s %-10s %-10s %-10s%n","", consoles[0], consoles[1], consoles[2]);

        //Display Sales
        for (int i=0;i<cities.length;i++){

            System.out.printf("%-20s %-10s %-10s %-10s%n",
            cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }
System.out.println("---------------------------------------------------");
        System.out.println("CONSOLE SALES TOTAL FOR EACH CITY");


        int highestSales=0;
        String cityWithMostSales="";

        //calculate totals
        for (int i=0;i<cities.length;i++){
            int total = 0;
            for (int j = 0;j<sales[i].length;j++){
                total = total + sales[i][j];
            }
            System.out.println(cities[i]+" "+total);

            if(total>highestSales){
                highestSales=total;
                cityWithMostSales = cities[i];
            }
        }
            System.out.println();
        System.out.println("CITY WITH MOST SALES:" +cityWithMostSales);

        }
    }
