package EncapsulationChallenge;

public class Printer {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel < -1 || tonerLevel > 100){
            System.out.println("Toner level exceeded");
            tonerLevel = -1;
        }
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted=0;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount < 0 || tonerAmount > 100){
            return -1;
        }
        this.tonerLevel = this.tonerLevel + tonerAmount;
        if (this.tonerLevel > 100 || this.tonerLevel<0){
            System.out.println("Printer level exceeded");
            return -1;
        }else
            return this.tonerLevel;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        int sheetOfPaper=0;
        int remainderPages = 0;
        if (isDuplex()==true){
            System.out.println("Printing in duplex mode");
            remainderPages = pages % 2;
            sheetOfPaper = (pages / 2) + remainderPages;
            this.pagesPrinted = this.pagesPrinted + sheetOfPaper;
            return sheetOfPaper;

        }else {
            System.out.println("It is not a duplex printer");
            sheetOfPaper = pages;
        }
        return sheetOfPaper;
    }

}
