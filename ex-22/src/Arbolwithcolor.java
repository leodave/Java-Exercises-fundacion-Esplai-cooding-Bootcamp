public class Arbolwithcolor {
    public class ColorFlags {
        public void flags() {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10 - i; j++)
                    System.out.print(" ");
                for (int k = 0; k < (2 * i + 1); k++)
                    System.out.print("\u001B[42m *\u001B[0m");
                // System.out.print("*");
                System.out.println();
            }
        }
        public void main(String[] args) {
            ColorFlags colorflags = new ColorFlags();
            colorflags.flags();

        }
    }
}
