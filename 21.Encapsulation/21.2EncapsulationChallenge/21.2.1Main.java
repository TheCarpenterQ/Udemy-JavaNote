public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("initial page count = " + printer.getNumberOfPages());
        int pagePrinted = printer.printPages(5);
        System.out.println("Page printed was " + pagePrinted + " new total print count for printer = " + printer.getNumberOfPages());
        pagePrinted = printer.printPages(4);
        System.out.println("Page printed was " + pagePrinted + " new total print count for printer = " + printer.getNumberOfPages());

    }
}
