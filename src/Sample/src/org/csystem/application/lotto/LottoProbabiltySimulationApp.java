package org.csystem.application.lotto;

class LottoProbabiltySimulationApp {
	public static void run()
	{
		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = Integer.parseInt(kb.nextLine());
		
		LottoProbabiltySimulation simulation = new LottoProbabiltySimulation(n);
		
		simulation.run();
		
		System.out.printf("1. oyunun kazanma olasılığı:%f%n", simulation.game1Prob);
		System.out.printf("2. oyunun kazanma olasılığı:%f%n", simulation.game2Prob);
		System.out.printf("3. oyunun kazanma olasılığı:%f%n", simulation.game3Prob);
	}
}
