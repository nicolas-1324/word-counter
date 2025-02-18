import java.util.*;
import java.io.File;
import java.io.FileReader;

public class WordCounter
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int st_besed = 1;

		System.out.print("Vnesi poljuben niz ki ima vec besed, ali pot do mape: ");
		String niz = in.nextLine();
		
		for(int i = 0; i<niz.length(); i++){
			if(niz.charAt(i) == '/'){
				try{
					File potDoMape = new File(niz);
					FileReader bralec = new FileReader(potDoMape);
					System.out.println("succes!");
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}
				break;
			}
		}
		for(int i = 0; i<niz.length(); i++){
			if(Character.isWhitespace(niz.charAt(i))){
				st_besed++;
			}
		}

		System.out.println("Stevilo besed v nizu: " + st_besed);
	}
}
