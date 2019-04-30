package src.examSources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindLargestIsland
{
	public static Integer findLargestShape(boolean[][] pictureArray)
	{
		Integer longestChain = 0;
		Integer currentChain = 0;

		for(int i = 0; i < pictureArray.length; i++)
		{
			for(int k = 0; k < pictureArray[i].length; k++)
			{
				//See if it's a black-pixel hit
				System.out.println("currently examining pixels: " + i + ", " + k);
				if(pictureArray[i][k] == true)
				{
					HashMap<Integer,List<Integer>> nodesVisited = new HashMap<>();
					howLongIsTheChainConnectedToPointXY(pictureArray, i, k, nodesVisited);

					System.out.println("x values: " + nodesVisited.keySet());
					System.out.println("y values: " + nodesVisited.values());
					for(Integer key : nodesVisited.keySet())
					{
						currentChain += nodesVisited.get(key).size();
					}
				}

				if( currentChain > longestChain)
				{
					longestChain = currentChain;
				}
				currentChain = 0;
				//Record as we finish.
			}
		}

		return longestChain;
	}

	public static void howLongIsTheChainConnectedToPointXY(boolean[][] pictureArray,
														   int x, int y,
														   HashMap<Integer,List<Integer>> nodesVisited)
	{
		//As we're finding out, make sure we don't loop in a square
		List<Integer> listRetrieved = nodesVisited.get(x);
		if(listRetrieved != null && listRetrieved.contains(y) == true)
		{
			return;
		}
		else
		{
			if(listRetrieved == null)
			{
				listRetrieved = new ArrayList<Integer>();
			}
			listRetrieved.add(y);
			nodesVisited.put(x, listRetrieved);
		}

		//Find out how long this chain goes
		if(x-1 >= 0 && pictureArray[x-1][y] == true )
		{
			howLongIsTheChainConnectedToPointXY(pictureArray, x-1,y, nodesVisited);
		}
		if(x+1 < pictureArray.length && pictureArray[x+1][y] == true)
		{
			howLongIsTheChainConnectedToPointXY(pictureArray, x+1,y, nodesVisited);
		}
		if(y-1 >= 0 && pictureArray[x][y-1] == true)
		{
			howLongIsTheChainConnectedToPointXY(pictureArray, x,y-1, nodesVisited);
		}
		if(y+1 < pictureArray[x].length && pictureArray[x][y+1] == true)
		{
			howLongIsTheChainConnectedToPointXY(pictureArray, x,y+1, nodesVisited);
		}
	}

	public static boolean isCoordinateContainedInMap(HashMap<Integer,List<Integer>> nodesVisited)
	{
		return false;
	}
}


/*
Your previous Plain Text content is preserved below:


We are given a black and white picture with black shapes over a white background.
A shape is a continuous set of pixels. A shape can have holes, and is not constrained to any particular geometrical structure.
The size of a shape is the number of black pixels in it.
Find the size of the largest shape

X 0 X 0
0 0 X 0
0 X X 0
X X 0 X

 */