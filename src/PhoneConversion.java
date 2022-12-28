/*
 * Kurt Kangas
 * CIS 2212 Java Software Development I
 * Phone Conversion
 */

// TODO Phone keypad Layout is as follows...
/*
   1	 2		3
		ABC	   DEF
   4	 5		6
  GHI   JKL    MNO
   7	 8		9
  PQRS  TUV    WXYZ
 */

import java.util.Scanner;

public class PhoneConversion {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program inputs a word from the user and then converts the word into a phone number.\n");

		char again = 'y'; 
		do
		{
			System.out.print("\nEnter a phone phrase: ");
			String phrase = input.nextLine().toUpperCase();

			String convertedPhrase = " ";
			char matchingDigit = 0;
			char tempCh;

			for (int i = 0; i < phrase.length(); i++)
			{
				if (phrase.charAt(i) >= 'A' && phrase.charAt(i) <= 'Z')
				{
					switch (phrase.charAt(i))
					{
					case 'A':
						matchingDigit = '2';
						break;
					case 'B':
						matchingDigit = '2';
						break;
					case 'C':
						matchingDigit = '2';
						break;
					case 'D':
						matchingDigit = '3';
						break;
					case 'E':
						matchingDigit = '3';
						break;
					case 'F':
						matchingDigit = '3';
						break;
					case 'G':
						matchingDigit = '4';
						break;
					case 'H':
						matchingDigit = '4';
						break;
					case 'I':
						matchingDigit = '4';
						break;
					case 'J':
						matchingDigit = '5';
						break;
					case 'K':
						matchingDigit = '5';
						break;
					case 'L':
						matchingDigit = '5';
						break;
					case 'M':
						matchingDigit = '6';
						break;
					case 'N':
						matchingDigit = '6';
						break;
					case 'O':
						matchingDigit = '6';
						break;
					case 'P':
						matchingDigit = '7';
						break;
					case 'Q':
						matchingDigit = '7';
						break;
					case 'R':
						matchingDigit = '7';
						break;
					case 'S':
						matchingDigit = '7';
						break;
					case 'T':
						matchingDigit = '8';
						break;
					case 'U':
						matchingDigit = '8';
						break;
					case 'V':
						matchingDigit = '8';
						break;
					case 'W':
						matchingDigit = '9';
						break;
					case 'X':
						matchingDigit = '9';
						break;
					case 'Y':
						matchingDigit = '9';
						break;
					case 'Z':
						matchingDigit = '9';
						break;
					default:
						break;
					}
					tempCh = matchingDigit;
				} else
				{
					tempCh = phrase.charAt(i);
				}
				convertedPhrase = convertedPhrase + tempCh;
			}	
			System.out.println("The new phrase is: " + convertedPhrase);
			// REPEAT PROGRAM? LAST PART
			System.out.print("\nWould you like to convert another phrase? (Y/N): ");
			again = input.next().charAt(0);

			if (again != 'y' && again != 'Y' && again != 'n' && again != 'N')
			{
				System.out.println("\nInvalid input. Have a great day!.");
				again = 'n';
			}
			else
			{
				input.nextLine();
			}
		} while (again != 'n' && again != 'N');
		System.out.println("\nHave a great day!");
	}

}

