import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.lang.StringBuilder;

public class WordCounter
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		StringBuilder nizPrebran = new StringBuilder();

		int st_besed = 0;

		System.out.print("Vnesi poljuben niz ki ima vec besed, ali pot do mape: ");
		String niz = in.nextLine();
		
		for(int i = 0; i<niz.length(); i++){
			if(niz.charAt(i) == '/'){
				try{
					File potDoMape = new File(niz);
					FileReader bralec = new FileReader(potDoMape);

					int data = bralec.read();

					System.out.print("Niz v mapi: ");
					while(data != -1){
						char znak = (char)data;
						nizPrebran.append(znak);
						System.out.print(znak);
						data = bralec.read();
					}
					bralec.close();
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}
				break;
			}
		}
		if(){

		}
		for(int i = 0; i<niz.length(); i++){
			if(Character.isWhitespace(niz.charAt(i))){
				st_besed++;
			}
		}
		System.out.println("Stevilo besed v nizu: " + st_besed);
	}
}
