package FollowAlong;

public class Main_DesignPatternsCodeWithMosh {
    public static void main(String[] args) {

      //  User user = new User("Jens",30);
        //user.sayHello();
       // TaxCalculator calculator = getCalculator();
        //calculator.calculatorTax();

      /*  var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

       */
        /*var mailService = new MailService();
        mailService.sendMail();

         */
        /*
        var texbox = new Textbox();
        texbox.enable();

         */
        /*drawUiControl(new Checkbox());
        drawUiControl(new Textbox());

         */
        //momento Pattern
       /* var editor = new Editor();
        var history = new History();

        editor.setContent("A");
        history.push(editor.createState());
        editor.setContent("B");
        history.push(editor.createState());
        editor.setContent("C");
        editor.restore(history.pop());
        editor.restore(history.pop());


        System.out.println(editor.getContent());

        */
        //statepattern
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();







    }
    /*public static TaxCalculator getCalculator(){
        return new TaxCalculator2022();
    }

     */
    /*public static void drawUiControl(UIControl uiControl){
        uiControl.draw();

    }

     */
}
