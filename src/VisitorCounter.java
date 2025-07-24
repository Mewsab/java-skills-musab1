public class VisitorCounter {

    private static int totalVisitors = 0;

    private int sessionVisits;
    private String visitorName;

    public VisitorCounter(String name){
        this.visitorName = name;
        this.sessionVisits = 0;
        totalVisitors++; // Increment the total number of visitors when a new one is added
    }
    public void recordVisit(){
        sessionVisits++;
        System.out.println(visitorName + " visited. Sessions visits: " + sessionVisits);
    }
    public static void displayTotalVisitors(){
        System.out.println("Total number of visitors today: " + totalVisitors);
    }
    public static int getTotalVisitors(){
        return totalVisitors;
    }
    public static void main (String[] args){
        VisitorCounter Visitor1 = new VisitorCounter("Musab");
        VisitorCounter Visitor2 = new VisitorCounter("Alice");
        VisitorCounter Visitor3 = new VisitorCounter("John");

        Visitor1.recordVisit();
        Visitor1.recordVisit();
        Visitor2.recordVisit();
        Visitor3.recordVisit();
        Visitor3.recordVisit();

        VisitorCounter.displayTotalVisitors();

    }

}
