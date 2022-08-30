import java.util.ArrayList;

public class Developer {
    private String name;
    private String surname;
    private int Age;
    private int ID;
    private String TechRole;

    public Developer(String name,String surname, int Age, int ID, String TechRole){
        this.name = name;
        this.surname = surname;
        this.Age = Age;
        this.ID = ID;
        this.TechRole = TechRole;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public int getID() {
        return ID;
    }

    public String getSurname() {
        return surname;
    }

    public String getTechRole() {
        return TechRole;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTechRole(String techRole) {
        TechRole = techRole;
    }

    public static void main(String[] args) {
        Developer developer = new Developer("david","Elias",22,1,"BackEndDeveloper");
        Developer developer2 = new Developer("matias","saralih",26,2,"FrontEndDeveloper");
        Developer developer3 = new Developer("nicolo","nic",26,3,"FullStackDeveloper");
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(developer.getTechRole());
        list.add(developer2.getTechRole());
        list.add(developer3.getTechRole());
        for( Object dev : list) {
            if(dev == "BackEndDeveloper" || dev == "FullStackDeveloper"){
                System.out.println("Viva el Back");
            }else{
                System.out.println("Js is shit use typescript");
            }
        }
        }

    }


