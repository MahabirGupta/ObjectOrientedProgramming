package Encapsulation;

public class Printer {

    public static void main(String[] args) {
        Printer printer = new Printer(86,true);
       int newTonerLevel = printer.addToner(12);
        System.out.println("New printer toner level = " + newTonerLevel);
        newTonerLevel = printer.addToner(22);
        System.out.println("New printer toner level = " + newTonerLevel);
        int sheetOfPaper = printer.printPages(3);
        System.out.println(sheetOfPaper + " sheets of paper is required");
        System.out.println();
        Printer printer1 = new Printer(50,true);
        newTonerLevel = printer1.addToner(24);
        System.out.println("New printer toner level = " + newTonerLevel);
        newTonerLevel = printer1.addToner(100);
        System.out.println("New printer toner level = " + newTonerLevel);
        sheetOfPaper = printer1.printPages(8);
        System.out.println(sheetOfPaper + " sheets of paper is required");
        System.out.println();
        Printer printer2 = new Printer(13,false);
        newTonerLevel = printer2.addToner(24);
        System.out.println("New printer toner level = " + newTonerLevel);
        newTonerLevel = printer2.addToner(100);
        System.out.println("New printer toner level = " + newTonerLevel);
        sheetOfPaper = printer2.printPages(9);
        System.out.println(sheetOfPaper + " sheets of paper is required");

    }

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
//        new Printer(tonerLevel,3,duplex);
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int addToner(int tonerAmount){
        this.tonerLevel = this.tonerLevel + tonerAmount;
        if (this.tonerLevel > 100 || this.tonerLevel<0){
            System.out.println("Printer level exceeded");
            return -1;
        }else
            return this.tonerLevel;
    }

    public int printPages(int pagesPrinted){
        int sheetOfPaper=0;
        int remainderPages = 0;
        if (isDuplex()==true){
            System.out.println("It is a duplex printer");
            remainderPages = pagesPrinted % 2;
            sheetOfPaper = (pagesPrinted / 2) + remainderPages;
            return sheetOfPaper;

        }else {
            System.out.println("It is not a duplex printer");
            sheetOfPaper = pagesPrinted;
        }
        return sheetOfPaper;
    }
}
