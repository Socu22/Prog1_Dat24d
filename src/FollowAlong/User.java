package FollowAlong;

public class User {
    //fields (attributes)
    public String name;
    public int age;
    public User(String name, int age){
        this.name=name;
        this.age=age;

    }
    //methods
    public void sayHello(){
        System.out.println("Hello, my name is "+name+" and my age is "+age);
    }
}
