package LiveInClass;

public class OneHundred {
    Player p1 = new Player("Jack");
    Player p2 = new Player("Bob");


    void play(){
        System.out.println(p1+"\t"+p2);
        while(p1.sum<100 && p2.sum<100){
            p1.turn();
            p2.turn();
            System.out.println(p1.sum+"\t\t"+p2.sum);
            //System.out.printf("%d \t %d",p1.sum,p2.sum);



            }
            //Den er ikke i while loop
            if(p1.sum== p2.sum){
                System.out.println("I har begge lige mange point");

            } else if(p1.sum > p2.sum){
                System.out.printf("%s du vandt!!\n",p1);


            }else {
                System.out.printf("%s du vandt!!\n",p2);
        }
    }



    public static void main(String[] args) {
        OneHundred game = new OneHundred();
        game.play();

    }
}
