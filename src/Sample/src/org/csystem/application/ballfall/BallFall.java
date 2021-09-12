package org.csystem.application.ballfall;

public class BallFall {
	public static boolean updateRightFlag(boolean isRight, int ballIndex, int width)
	{
		if (ballIndex == 0)
			isRight = true;		
		else if (ballIndex == width - 1)
			isRight = false;
		
		return isRight;		
	}
	
	public static int updateBallIndex(boolean isRight, int ballIndex)
	{
		if (isRight)
			return ballIndex + 1;
		
		return ballIndex - 1;			
	}
	
	public String shapeStr;
	
	public void fillSpace(int begin, int end) //[begin, end)
	{
		for (int i = begin; i < end; ++i)
			shapeStr += ' ';
	}
	
	public void fillBall(int ballIndex, int end)
	{
		fillSpace(0, ballIndex);
		shapeStr += '*';
		fillSpace(ballIndex + 1, end);
	}	
	
	
	public BallFall()
	{
		shapeStr = "";
	}
	
	public void play(int width, int height)
	{
		int ballIndex = 0;
		boolean isRight = false;
		shapeStr = "";
		
		for (int i = 1; i <= height; ++i) {
			shapeStr += '|';
			fillBall(ballIndex, width);
			if (width != 1) {				
				isRight = updateRightFlag(isRight, ballIndex, width);			
				ballIndex = updateBallIndex(isRight, ballIndex);
			}
			shapeStr += "|\r\n";
		}
	}
}