package org.csystem.application.lotto;

public class LottoProbabiltySimulation {
	public int count;
	public double game1Prob;
	public double game2Prob;
	public double game3Prob;
	
	public LottoProbabiltySimulation(int n)
	{
		count = n;
	}
	
	public void run()
	{
		java.util.Random r = new java.util.Random();
		Lotto lotto = new Lotto(r);
		int win1Count, win2Count, win3Count;
		
		win1Count= win2Count = win3Count = 0;
		
		for (int i = 0; i < count; ++i) {
			lotto.play();
			
			if (lotto.winGame1)
				++win1Count;
			
			if (lotto.winGame2)
				++win2Count;
			
			if (lotto.winGame3)
				++win3Count;
		}
		
		game1Prob = (double)win1Count / count;
		game2Prob = (double)win2Count / count;
		game3Prob = (double)win3Count / count;
	}
} 
