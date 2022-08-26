
public class ColorFlags {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public void unitedstates() {
        System.out.println( ANSI_BLUE_BACKGROUND +"      " + ANSI_RED_BACKGROUND + "             ");
        System.out.println( ANSI_BLUE_BACKGROUND +"      " +ANSI_WHITE_BACKGROUND + "             ");
        System.out.println( ANSI_BLUE_BACKGROUND +"      " +ANSI_RED_BACKGROUND + "             ");
        System.out.println( ANSI_BLUE_BACKGROUND +"      " +ANSI_WHITE_BACKGROUND + "             ");
        System.out.println( ANSI_BLUE_BACKGROUND +"      " +ANSI_RED_BACKGROUND + "             ");
        System.out.println( ANSI_WHITE_BACKGROUND + "                   ");
        System.out.println( ANSI_RED_BACKGROUND + "                   ");
        System.out.println( ANSI_WHITE_BACKGROUND +  "                   ");
        System.out.println( ANSI_RED_BACKGROUND +  "                   ");
        System.out.println( ANSI_WHITE_BACKGROUND + "                   ");
        System.out.println( ANSI_RED_BACKGROUND +  "                   ");
        System.out.println( ANSI_WHITE_BACKGROUND +  "                   \n\n" );

    }
    public void  ukraine() {
        System.out.println( ANSI_BLUE_BACKGROUND + "                   ");
        System.out.println( ANSI_BLUE_BACKGROUND + "                   ");
        System.out.println( ANSI_BLUE_BACKGROUND + "                   ");
        System.out.println( ANSI_BLUE_BACKGROUND + "                   ");
        System.out.println( ANSI_YELLOW_BACKGROUND + "                   ");
        System.out.println( ANSI_YELLOW_BACKGROUND + "                   ");
        System.out.println( ANSI_YELLOW_BACKGROUND + "                   ");
        System.out.println( ANSI_YELLOW_BACKGROUND + "                   \n\n");

    }
    public void spain() {
        System.out.println( ANSI_RED_BACKGROUND + "                   ");
        System.out.println( ANSI_RED_BACKGROUND + "                   ");
        System.out.println( ANSI_YELLOW_BACKGROUND + "                   ");
        System.out.println( ANSI_YELLOW_BACKGROUND + "                   ");
        System.out.println( ANSI_YELLOW_BACKGROUND + "                   ");
        System.out.println( ANSI_YELLOW_BACKGROUND + "                   ");
        System.out.println( ANSI_YELLOW_BACKGROUND + "                   ");
        System.out.println( ANSI_RED_BACKGROUND + "                   ");
        System.out.println( ANSI_RED_BACKGROUND + "                   \n\n");

    }
    public void germany() {
        System.out.println( ANSI_BLACK_BACKGROUND + "                   ");
        System.out.println( ANSI_BLACK_BACKGROUND + "                   ");
        System.out.println( ANSI_BLACK_BACKGROUND + "                   ");
        System.out.println( ANSI_RED_BACKGROUND + "                   ");
        System.out.println( ANSI_RED_BACKGROUND + "                   ");
        System.out.println( ANSI_RED_BACKGROUND + "                   ");
        System.out.println( ANSI_YELLOW_BACKGROUND + "                   ");
        System.out.println( ANSI_YELLOW_BACKGROUND + "                   ");
        System.out.println( ANSI_YELLOW_BACKGROUND + "                   ");

    }
    public static void main(String[] args) {
        ColorFlags loopTree = new ColorFlags();
        loopTree.unitedstates();
        loopTree.ukraine();
        loopTree.spain();
        loopTree.germany();
    }
}

