import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PassKeyGen {
    public static void main(String[] args) {
        List<Character> passl = new ArrayList<Character>();
        passl.add('a');
        passl.add('b');
        passl.add('c');
        passl.add('d');
        passl.add('e');
        passl.add('f');
        passl.add('g');
        passl.add('h');
        passl.add('i');
        passl.add('j');
        passl.add('k');
        passl.add('l');
        passl.add('m');
        passl.add('n');
        passl.add('o');
        passl.add('p');
        passl.add('q');
        passl.add('r');
        passl.add('s');
        passl.add('t');
        passl.add('u');
        passl.add('v');
        passl.add('w');
        passl.add('x');
        passl.add('y');
        passl.add('z');
        passl.add('A');
        passl.add('B');
        passl.add('C');
        passl.add('D');
        passl.add('E');
        passl.add('F');
        passl.add('G');
        passl.add('H');
        passl.add('I');
        passl.add('J');
        passl.add('K');
        passl.add('L');
        passl.add('M');
        passl.add('N');
        passl.add('O');
        passl.add('P');
        passl.add('Q');
        passl.add('R');
        passl.add('S');
        passl.add('T');
        passl.add('U');
        passl.add('V');
        passl.add('W');
        passl.add('X');
        passl.add('Y');
        passl.add('Z');
        passl.add('1');
        passl.add('2');
        passl.add('3');
        passl.add('4');
        passl.add('5');
        passl.add('6');
        passl.add('7');
        passl.add('8');
        passl.add('9');
        passl.add('0');

        StringBuilder password = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < 12; i++) {
            password.append(passl.get(rand.nextInt(passl.size())));
        }

        System.out.println("Your new Password is:\n" + password.toString());
    }
}
//This code comes up with a new password for 12 symbols