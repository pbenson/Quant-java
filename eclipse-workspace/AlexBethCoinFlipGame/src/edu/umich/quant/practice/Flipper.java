package edu.umich.quant.practice;

public class Flipper {

	public static void main(String[] args) {
		int numTrials = 10000000;
		int bethWinCount = 0;
		int bethWinsOn2ndTurnCount = 0;
		for (int i = 0; i < numTrials; ++i) {
			int bethTurnCount = 0;
			while (true) {
				boolean alexWins = Math.random() < 0.25;
				if (alexWins) {
					break;
				}
				++bethTurnCount;
				boolean bethWins = Math.random() < 0.25;
				if(bethWins) {
					++bethWinCount;
					if(bethTurnCount == 2) {
						++bethWinsOn2ndTurnCount;
					}
					break;
				}
			}
		}
		System.out.println("won on 2nd: " 
				+ bethWinsOn2ndTurnCount + " / " + bethWinCount);
	}

}
