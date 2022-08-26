public class REcursion {
    static String[] technologies = {"MarkDown","RegExp","CSS","JS","SQL","HTML","JAVA"};
    int counter = 0;
    public void recursion(String[] tech){

        System.out.println(tech[counter]);
        counter++;
            if(tech[counter] != "HTML"){
                recursion(tech);
            }

    }

    public static void main(String[] args) {
        REcursion rEcursion = new REcursion();
        rEcursion.recursion(technologies);
    }
}
