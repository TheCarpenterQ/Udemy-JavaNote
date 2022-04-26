public class Main {
    //Encapsulation:allow you to restrict access to certain components in the objects that you are creating
    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "TC";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer Player = new EnhancedPlayer("TC",50,"sword");
        System.out.println("Initial health is " + Player.getHealth());

    }
}
