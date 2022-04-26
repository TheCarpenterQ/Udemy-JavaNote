public class Printer {

    private int tonerLevel;
    private int numberOfPages;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (this.tonerLevel >= 0 && this.tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
    }

    public int fillUpToner(int toner){
        if (toner >= 0 && toner <= 100){
            this.tonerLevel += toner;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int print){
        int pageToPrint = print;
        if (this.duplex){
            System.out.println("Printing in duplex mode");
            if (pageToPrint % 2 == 0) {
                pageToPrint /= 2;
            } else {
                pageToPrint = pageToPrint / 2 + 1;
            }
        }
        this.numberOfPages += pageToPrint;
        return pageToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
