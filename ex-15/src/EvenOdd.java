public class EvenOdd {
    public String EvenOdd(int number){
        if(number%2 == 0){
            return "even";
        }else{
            return "false";
        }
    }
     public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        System.out.println(evenOdd.EvenOdd(6));
    }
}
