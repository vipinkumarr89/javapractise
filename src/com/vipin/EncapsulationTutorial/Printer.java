package com.vipin.EncapsulationTutorial;

public class Printer {
   private int Level = 10;
   private int PrintPages;
   private boolean Duplex;

    public Printer(int level) {
        this.Level = level;
    }

    public int PrintPages(int PrintPages, boolean Duplex){
        int pages = PrintPages;
        if(Duplex) {
            pages = pages / 2 + pages % 2;
            System.out.println("printing in duplex mode");
            return this.PrintPages+pages;
        }
        System.out.println("in else");
            return this.PrintPages;
    }

    public int getPrintPages() {
        return PrintPages;
    }

    public int addToner(int Level){
        if(this.Level > 0 && this.Level < 100){
            if(this.Level + Level > 100){
                return -1;
            } this.Level+=Level;
            return this.Level;
        }else
            return -1;
    }

    public int getLevel() {
        return Level;
    }
}


