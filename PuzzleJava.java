import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Random random = new Random();
        for( int i=0; i<10; i++ ){
            nums.add( random.nextInt( 19 ) + 1 );
        }
        return nums;
    }

    public String getRandomLetter(){
        String[] cadena = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random random = new Random();
        return cadena[random.nextInt( cadena.length )]; 
    }

    public String generatePassword(){
        String[] cadena = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String password = "";
        Random random = new Random();
        for( int i=0; i<8; i++ ){
            password += cadena[random.nextInt( cadena.length )];
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet( int num){
        String[] cadena = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String palabra = "";
        Random random = new Random();
        ArrayList<String> password = new ArrayList<String>();
        for( int i=0; i<num; i++ ){
            for( int j=0; j<8; j++ ){
                palabra += cadena[random.nextInt( cadena.length )];
            }
            password.add( palabra );
            palabra = "";
        }
        return password;
    }
}