package Day2;

public class Person {
    String name;
    int age;
    String address;

    public String getname(){
        if (name.equals("")) {
            return null;
        }
        return this.name;
    }
    public void setname(String name){
        this.name = name;
    }

    public int getage(){
        if (age == 0) {
            return 0;
        }
        return this.age;
    }
    public void setage(int age){
        this.age = age;
    }

    public String getaddress(){
        if (address.equals("")) {
            return null;
        }
        return this.address;
    }
    public void setaddress(String address){
        this.address = address;
    }
}
