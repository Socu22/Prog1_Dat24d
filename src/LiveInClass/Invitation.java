package LiveInClass;

public class Invitation {
    public static void main(String[] args) {
        invitation("Jens");
        invitation("Lars");
        invitation("Bob");

    }

    static void invitation(String navn){
        System.out.println("Kære "+navn);
        System.out.println("Vil du komme til min fødseldag?");
        System.out.println("Fredag 13/9-2024");
        System.out.println("Kærlig hilsen Lucas");
        System.out.println("-----------------------------------");
    }
}
