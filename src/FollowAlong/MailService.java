package FollowAlong;

public class MailService {
    public void sendMail(){
        connect();
        authenticate();
        disconnect();

    }
    private void connect(){
        System.out.println("connect");}
    private void disconnect(){
        System.out.println("disconnect");}
    private void authenticate(){
        System.out.println("authenticate");

    }
}
