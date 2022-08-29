public class Federico {
    public Federico(String name, String Lastname){
        if(name == "Fredrico" && Lastname == "Garcia Lorca"){
            Lorca lorca = new Lorca();
        }else{
            NotAuthorized notAuthorized = new NotAuthorized();
        }
    }
    public static void main(String[] args) {
        Federico federico = new Federico("Fredrico","Garcia Lorca");
    }
}
