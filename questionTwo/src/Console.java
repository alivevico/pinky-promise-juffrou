public abstract class Console {

    private String consoleType;
    private String store;
    private int totalSales;

    //constructor
    public Console(String consoleType, String store, int totalSales){
        this.consoleType=consoleType;
        this.store=store;
        this.totalSales=totalSales;
    }

    //Get consoletype
    public String getConsoleType() {
        return consoleType;
    }
    //get store
    public String getStore(){
        return store;
    }

    //calculate total sales
    public int getTotalSales(){
        return totalSales;

        //Abstract method
        public abstract void printReport;();
    }

    //print report
    public abstract void printReport();
}
