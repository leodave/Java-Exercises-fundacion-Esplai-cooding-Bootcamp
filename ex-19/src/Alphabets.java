public class Alphabets {
    public void alphabet(){
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i = 0; i < alpha.length; i++) {
            for (int j = alpha.length -1 - i; j >= 0; j--)
                System.out.print(alpha[j]);
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print(" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Alphabets alphabets = new Alphabets();
        alphabets.alphabet();
    }
}
