package com.vipin.EncapsulationTutorial;

//public class Main {
//
//        public static void main(String[] args) {
//            Player player = new Player();
//            player.Name = "Tim";
//            player.health = 20;
//            player.weapon = "Sword";
//
//            int damage = 10;
//            player.loseHealth(damage);
//            System.out.println("Remaining health =  " + player.healthRemaining());
//
//            damage = 11;
//            player.health = 200;
//            player.loseHealth(damage);
//            System.out.println("Remaining health =  " + player.healthRemaining());
//        }
//
////    public static void main(String[] args) {
////        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
////        System.out.println("Initial health is " + player.getHealth());
////    }
//}




public class Main {

    public static void main(String[] args) {
        Printer tonerfiller = new Printer(50);
        System.out.println("Toner Level is "+tonerfiller.getLevel());
        int pageprinted = tonerfiller.getPrintPages();
        System.out.println("Till now "+pageprinted +" Number of pages printed");
        int toprint = tonerfiller.PrintPages(10,true);
        System.out.println("Till now "+toprint +" Number of pages printed");

    }

}