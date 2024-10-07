package LiveInClass;

public class Player {
    Cup cup = new Cup();
    String name;
    int sum=0;

    Player(String name){
        this.name=name;  //Det her er et navn som siger "Hey Din Fucktart this.XX er en del af instancen af variablet som hører til klassen"
    }

    void turn(){
        cup.roll();
        sum+=cup.getSum();
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {



    }
}
