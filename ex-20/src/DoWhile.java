public class DoWhile {
    public void doWhile(int num){
        while (num <= 10){
            num++;
            if(num == 5){
                System.out.println("not allowed");
                break;
            }else{
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        DoWhile doWhile = new DoWhile();
        doWhile.doWhile(1);
    }
}
