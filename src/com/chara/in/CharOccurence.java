package com.chara.in;

public class CharOccurence {
	
	public static void main(String[] args) {
		
		
		String s="sachin tendulkar";
		char [] c= s.toLowerCase().toCharArray();
		int [] charcount = new int[256];
		
		
		for(char c1:c)
		{
			
			charcount[c1]++;
			
		}
		for(int i=1;i<charcount.length;i++)
		{
			if(charcount[i]>0)
			{
				
				System.out.println("the letter "+ (char)i+"  occurs   "+ charcount[i]++);
				
			}
		}
	}

}
