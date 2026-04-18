package OOPS;

public class Human {

    private Heart heart;

    public void insertHeart(Heart heart) {
        if (this.heart == null) {
            this.heart = heart;
        } else {
            System.out.println("Heart already exists");
        }
    }

    public Heart getHeart() {
        return heart;
    }
}
