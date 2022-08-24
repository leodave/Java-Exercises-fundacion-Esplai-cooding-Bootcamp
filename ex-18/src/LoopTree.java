public class LoopTree {
    public void arbol(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LoopTree loopTree = new LoopTree();
        loopTree.arbol();
    }
}
