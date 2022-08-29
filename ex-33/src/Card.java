public class Card {
    private int money = 1000;
    private boolean active = false;

    public boolean cardActive(){
        this.active = true;
        return active;
    }
    public int payment(int number){
       if(active == true){
           if(money <= 0){
               System.out.println("Balance is insufficient");
           }else{
               money = money -number;
           }
       }
       return money;

    }
    public int getMoney(){
        return this.money;
    }

    public static void main(String[] args) {
        Card card = new Card();
        card.cardActive();
        card.payment(400);
        System.out.println(card.getMoney());
    }
}
