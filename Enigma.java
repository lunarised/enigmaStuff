public class Enigma{
    static Rotor r1;
    static Rotor r2;
    static Rotor r3;
    public static void main(String[] args){
        System.out.println("Hi");
        setup();
        System.out.println(r1.encrypt('c'));
    }
    public static void setup(){
        r1 = new Rotor("EKMFLGDQVZNTOWYHXUSPAIBRCJ", 0, 'Q');
        r2 = new Rotor("AJDKSIRUXBLHWTMCQGZNPYFVOE", 0, 'E');
        r3 = new Rotor("BDFHJLCPRTXVZNYEIWGAKMUSQO", 0, 'V');
    }
}