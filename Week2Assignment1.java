package week2day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Week2Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================== reverse the string==================");
		String s="feeling good";
		char[] charArray = s.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}
		System.out.println("");
		System.out.println("===================== sum of digits from string==================");
		String s2="Test12Le79af65";
		int sum=0;
		char[] charArray2 = s2.toCharArray();
		for(int j=0;j<charArray2.length;j++)
		{
			if(Character.isDigit(charArray2[j])) 
			{
				sum=sum+Character.getNumericValue(charArray2[j]);
			}
			else
			{
				continue;
			}
		}
		System.out.println(sum);
		
		System.out.println("");
		System.out.println("===================== Remove duplicates from string==================");
		
		String s3 = "we learn java basics as part of java session week1";
        String s4 = "";
        for (int i = 0; i < s3.length(); i++) {
            Boolean found = false;
            for (int j = 0; j < s4.length(); j++) {
            	if(s3.charAt(i) == ' ')
            	{
            		break;
            	}
                if (s3.charAt(i) == s4.charAt(j) ) {
                    found = true;
                    break; //don't need to iterate further
                }
            }
            if (found == false) {
                s4 = s4.concat(String.valueOf(s3.charAt(i)));
            }
        }
        System.out.println(s4);
        
        System.out.println("");
		System.out.println("===================== reverse even number from string==================");
		
		String s5="I am Software tester";
		String[] split = s5.split(" ");
		for(int i=0;i < split.length;i++)
		{
			if(i%2==1)
			{
				char[] charArray3 = split[i].toCharArray();
				for(int j=charArray3.length-1;j>=0;j--)
				{
					System.out.print(charArray3[j]);
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(split[i]+" ");
			}
		}


	}

}
