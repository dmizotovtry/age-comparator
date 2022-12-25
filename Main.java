public class Main {
    public static void main(String[] args) {
        int vasyaAge = 9;
        int katyaAge = 41;
        int mishaAge = 71;

        if (vasyaAge < mishaAge && vasyaAge < katyaAge) {
            System.out.println("Minimal age: " + vasyaAge);
        } else if (vasyaAge < mishaAge && vasyaAge > katyaAge || vasyaAge > mishaAge && vasyaAge < katyaAge) {
            System.out.println("Middle age: " + vasyaAge);
        } else if (vasyaAge > mishaAge && vasyaAge > katyaAge) {
            System.out.println("Maximum age: " + vasyaAge);
        }

        if (katyaAge < vasyaAge && katyaAge < mishaAge) {
            System.out.println("Minimum age: " + katyaAge);
        } else if (katyaAge < vasyaAge && katyaAge > mishaAge || katyaAge > vasyaAge && katyaAge < mishaAge) {
            System.out.println("Middle age: " + katyaAge);
        } else if (katyaAge > vasyaAge && katyaAge > mishaAge) {
            System.out.println("Maximum age: " + katyaAge);
        }

        if (mishaAge < vasyaAge && mishaAge < katyaAge) {
            System.out.println("Minimum age: " + mishaAge);
        } else if (mishaAge < vasyaAge && mishaAge > katyaAge || mishaAge > vasyaAge && mishaAge < katyaAge) {
            System.out.println("Middle age: " + mishaAge);
        } else if (mishaAge > vasyaAge && mishaAge > katyaAge) {
            System.out.println("Maximum age: " + mishaAge);
        }
    }
}