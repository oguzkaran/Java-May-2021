package org.csystem.application.lotto;

import org.csystem.util.number.NumberUtil;

public class Lotto {
	public boolean winGame1;
	public boolean winGame2;
	public boolean winGame3;
	public java.util.Random random;
	
	public int getRandom()
	{
		return random.nextInt(99) + 1;
	}
	
	public int getFirst()
	{
		return getRandom();
	}
	
	public int getSecond(int first)
	{
		int second = 0;
		
		while ((second = getRandom()) == first)
			;
		
		return second;
	}
	
	public int getThird(int first, int second)
	{
		int third = 0;
		
		while ((third = getRandom()) == first || third == second)
			;
		
		return third;		
	}
	
	
	public void playGame1(int first, int second, int third)
	{
		winGame1 = first + second + third < 150;
	}
	
	public void playGame2(int first, int second, int third)
	{
		winGame2 = NumberUtil.isPrime(first + second + third);
	}
	
	public void playGame3(int first, int second, int third)
	{
		int min = Math.min(Math.min(first, second), third);
		int max = Math.max(Math.max(first, second), third);
		int mid = first + second + third - max - min;
		
		winGame3 = max - min > mid;
	}
	
	
	public Lotto(java.util.Random r)
	{
		random = r;
	}	
	
	public void play()
	{
		int first = getFirst();
		int second = getSecond(first);
		int third = getThird(first, second);		
		
		playGame1(first, second, third);
		playGame2(first, second, third);
		playGame3(first, second, third);				
	}
}
