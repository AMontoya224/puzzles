import java.util.ArrayList;

public class TestPuzzleJava {
	public static void main( String[] args ) {
		PuzzleJava generator = new PuzzleJava();

		System.out.println( "\n----- Arreglo Aleatorio -----" );
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println( randomRolls );
		
		System.out.println( "\n----- Letra Aleatoria -----" );
    	String randomLetter = generator.getRandomLetter();
		System.out.println( randomLetter );

		System.out.println( "\n----- Password Aleatoria -----" );
		String randomPassword = generator.generatePassword();
		System.out.println( randomPassword );

		System.out.println( "\n----- Matriz de Passwords Aleatoria -----" );
		ArrayList<String> randomPasswordSet = generator.getNewPasswordSet( 5 );
		System.out.println( randomPasswordSet );
	}
}