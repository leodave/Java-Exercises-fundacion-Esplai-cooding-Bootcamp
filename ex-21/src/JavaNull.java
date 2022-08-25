public class JavaNull {
    public String javaNull(String word){
        if (word == "java"){
            return "java";
        }else{
            return null;
        }
    }
    public Boolean login(String role, String password){
        if(role == "admin" && password == "1234"){
            System.out.println("login true");
            return   true;
        }else{
            System.out.println("login false");
            return false;
        }
    }
    public String evenOdd(int num){
        if(num % 2 == 0){
            return "even";
        }else{
            return "odd";
        }
    }

    public static void main(String[] args) {
        JavaNull javaNull = new JavaNull();
        System.out.println(javaNull.javaNull("java"));
        System.out.println(javaNull.login("admin","1234"));
        System.out.println(javaNull.evenOdd(6));
    }
}
