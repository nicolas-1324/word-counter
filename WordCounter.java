import java.util.*;

public class WordCounter
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int st_besed = 1;

		System.out.print("Vnesi poljuben niz ki ima vec besed: ");
		String niz = in.nextLine();

		for(int i = 0; i<niz.length(); i++){
			if(Character.isWhitespace(niz.charAt(i))){
				st_besed++;
			}
		}

		System.out.println(st_besed);
	}
}
