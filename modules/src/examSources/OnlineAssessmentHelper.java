package src.examSources;

//You should generally ignore everything in here

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class OnlineAssessmentHelper
{
	public static void main(String[] args)
	{
		String word = "aaabbcccd";
		Set<Character> chars = new HashSet<Character>(Arrays.asList('a', 'b'));
	}

	////*********************************START Determine if loop in directed edge graph
//	public static class Edge
//	{
//		Integer sourceNode;
//		Integer targetNode;
//
//		public Edge(int source, int target)
//		{
//			sourceNode = source;
//			targetNode = target;
//		}
//	}
//
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input = br.readLine();
//		String[] nodesAndEdges = input.split(" ");
//		Integer numNodes = Integer.parseInt(nodesAndEdges[0]);
//		Integer numEdges = Integer.parseInt(nodesAndEdges[1]);
//		Map<Integer, List<Edge>> edgesGoingOutOfNodes = new HashMap<>();
//
//		for(int i = 0; i < numEdges; i++)
//		{
//			//split into Integers to create edge object
//			String[] edgeAsArray = br.readLine().split(" ");
//			Integer sourceNode = Integer.parseInt(edgeAsArray[0]);
//			Integer targetNode = Integer.parseInt(edgeAsArray[1]);
//			Edge edge = new Edge(sourceNode, targetNode);
//
//			//add or create in hashmap
//			List<Edge> edges = edgesGoingOutOfNodes.get(sourceNode);
//			if(edges == null)
//			{
//				edges = new ArrayList<>();
//			}
//			edges.add(edge);
//			edgesGoingOutOfNodes.put(sourceNode, edges);
//		}
//
//		//Could be a disconnected map. Starting from every node, search for a loop.
//		for(Map.Entry<Integer, List<Edge>> entrySet : edgesGoingOutOfNodes.entrySet())
//		{
//			List<Integer> nodesVisited = new ArrayList<>();
//
//			Boolean loop = doesLoopExistFromThisNode(entrySet.getKey(), entrySet.getValue(), nodesVisited, edgesGoingOutOfNodes);
//			if(loop)
//			{
//				System.out.println("true");
//				return;
//			}
//		}
//
//		System.out.println("false");
//	}
//
//	private static Boolean doesLoopExistFromThisNode(Integer currentNode, List<Edge> currentConnections, List<Integer> nodesVisited,
//													 Map<Integer, List<Edge>> edgesGoingOutOfNodes)
//	{
//		if(nodesVisited.contains(currentNode))
//		{
//			return true;
//		}
//		else
//		{
//			nodesVisited.add(currentNode);
//		}
//
//		if(currentConnections.isEmpty())
//		{
//			return false;
//		}
//
//		Boolean loopExistsInConnections = false;
//		for(Edge e : currentConnections)
//		{
//			List<Edge> edgesGoingOutOfConnectingNode = edgesGoingOutOfNodes.get(e.targetNode);
//			if(edgesGoingOutOfConnectingNode != null)
//			{
//				Boolean loops = doesLoopExistFromThisNode(e.targetNode, edgesGoingOutOfConnectingNode, nodesVisited, edgesGoingOutOfNodes);
//				if(loops)
//				{
//					loopExistsInConnections = true;
//					break;
//				}
//			}
//		}
//		return loopExistsInConnections;
//	}
	//*********************************END Determine if loop in directed edge graph

	//****************************START Smallest Stick combination problem
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input = br.readLine();
//		String[] stickLengthsAsStrings = input.split(" ");
//		List<Integer> stickLengths = new ArrayList<>();
//
//		//Put the Integer values of stick sizes in an array.
//		for(int i = 0; i < stickLengthsAsStrings.length; i++)
//		{
//			stickLengths.add(Integer.parseInt(stickLengthsAsStrings[i]));
//		}
//		Integer targetSizeSum = getFirstIntInLine(br.readLine());
//
//		HashMap<Integer, Integer> stickSizePairings = new HashMap<>();
//		for(int i = 0; i < stickLengths.size(); i++)
//		{
//			//removing this logic made it go from O(n^2) => O(n)
//			//List<Integer> localStickLengths = new ArrayList<>();
//			//localStickLengths.addAll(stickLengths);
//
//			Integer currentStick = stickLengths.remove(i);
//			Integer targetStick = targetSizeSum-currentStick;
//			if(stickLengths.contains(targetStick))
//			{
//				stickLengths.remove(targetStick);
//				//put the pairing in the list, smaller stick first/as the key
//				if(currentStick < targetStick)
//				{
//					stickSizePairings.put(currentStick, targetStick);
//				}
//				else
//				{
//					stickSizePairings.put(targetStick, currentStick);
//				}
//			}
//		}
//
//		Integer smallestStick = Integer.MAX_VALUE;
//		if(stickSizePairings.size() >= 1)
//		{
//			for(Map.Entry<Integer, Integer> entry : stickSizePairings.entrySet())
//			{
//				Integer smallerStickSize = entry.getKey();
//				if(smallerStickSize < smallestStick)
//				{
//					smallestStick = smallerStickSize;
//				}
//			}
//			System.out.println(smallestStick + " " + stickSizePairings.get(smallestStick));
//		}
//		else
//		{
//			System.out.println(-1);
//		}
//	}
	//***********************************END Smallest Stick combination problem

	private static Integer getFirstIntInLine(String input)
	{
		String[] sanitizedInput = input.split(" ");
		String integerAsString = sanitizedInput[0];
		Integer returnInt = Integer.parseInt(integerAsString);
		return returnInt;
	}

	//***********************************START Sliding Window input problem
//	public static class SlidingWindowView
//	{
//		Integer windowSize;
//		Map<Integer, Integer> numberAndOccurrences;
//		Integer maxNumber;
//		List<Integer> windowView;
//
//	}
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String inputLine = br.readLine();
//		//Get window size
//		Integer windowSize = getFirstIntInLine(inputLine);
//
//		SlidingWindowView slidingWindowView = new SlidingWindowView();
//		slidingWindowView.windowSize = windowSize;
//
//		//A map of numbers and how many times they're in the list
//		slidingWindowView.numberAndOccurrences = new HashMap<>();
//		//The current max number in the window view
//
//		//The list, representing what the window is currently viewing
//		slidingWindowView.windowView = new ArrayList<>();
//		try
//		{
//			//Get the first value, to set the maxNumber
//			Integer currentInt = getFirstIntInLine(br.readLine());
//			slidingWindowView.windowView.add(currentInt);
//			slidingWindowView.numberAndOccurrences.put(currentInt, 1);
//			slidingWindowView.maxNumber = currentInt;
//			//Populate W amount of elements first.
//			for(int i = 1; i < windowSize-1; i++)
//			{
//				slidingWindowView = addAndRecalculateMaximum(br, slidingWindowView);
//			}
//			//We added W-1 items. Need to add 1 more before we can loop the sliding/removal logic.
//			slidingWindowView = addAndRecalculateMaximum(br, slidingWindowView);
//			System.out.println(slidingWindowView.maxNumber);
//
//			//keep reading, we don't know how many items are coming
//			while(br.ready())
//			{
//				slidingWindowView = shiftWindowViewAndRecalculateMaxNumber(br, slidingWindowView);
//				System.out.println(slidingWindowView.maxNumber);
//			}
//		}
//		catch(IOException e)
//		{
//			//Suppress exception. Not normally, but the problem doesn't call for it.
//		}
//	}
//
//	private static SlidingWindowView addAndRecalculateMaximum(BufferedReader br, SlidingWindowView slidingWindowView) throws IOException
//	{
//		//Get the number
//		Integer currentInt = getFirstIntInLine(br.readLine());
//		//Add to list
//		slidingWindowView.windowView.add(currentInt);
//		//Update or create in hashmap
//		Integer timesOccured = slidingWindowView.numberAndOccurrences.get(currentInt);
//		if(timesOccured == null)
//		{
//			timesOccured = 0;
//		}
//		timesOccured++;
//		slidingWindowView.numberAndOccurrences.put(currentInt, timesOccured);
//		//determine if it's still the max number
//		if(currentInt > slidingWindowView.maxNumber)
//		{
//			slidingWindowView.maxNumber = currentInt;
//		}
//
//		return slidingWindowView;
//	}
//
//	private static SlidingWindowView shiftWindowViewAndRecalculateMaxNumber(BufferedReader br, SlidingWindowView slidingWindowView)
//																			throws IOException
//	{
//		//Remove the previous item in the window.
//		Integer removedInt = slidingWindowView.windowView.remove(0);
//		//Decrement or remove from hashmap
//		Integer timesOccured = slidingWindowView.numberAndOccurrences.get(removedInt);
//		if(timesOccured.equals(1))
//		{
//			slidingWindowView.numberAndOccurrences.remove(removedInt);
//			if(removedInt.equals(slidingWindowView.maxNumber))
//			{
//				slidingWindowView.maxNumber = null;
//			}
//		}
//		else
//		{
//			slidingWindowView.numberAndOccurrences.put(removedInt, timesOccured-1);
//		}
//
//		//add the new number
//		Integer currentInt = getFirstIntInLine(br.readLine());
//		//add to list
//		slidingWindowView.windowView.add(currentInt);
//		//update or create
//		timesOccured = slidingWindowView.numberAndOccurrences.get(currentInt);
//		if(timesOccured == null)
//		{
//			timesOccured = 0;
//		}
//		timesOccured++;
//		slidingWindowView.numberAndOccurrences.put(currentInt, timesOccured);
//
//		//if the max number was removed and no more instances remain of it
//		//then recalculate what the new max number is
//		if(slidingWindowView.maxNumber == null)
//		{
//			//redetermine the max number
//			slidingWindowView.maxNumber = Collections.max(slidingWindowView.windowView);
//		}
//		else
//			//otherwise determine if the (possibly) new number is the new max number
//			if(timesOccured == 1 && currentInt > slidingWindowView.maxNumber)
//			{
//				slidingWindowView.maxNumber = currentInt;
//			}
//
//		return slidingWindowView;
//	}
	//****************************END Sliding Window input problem

	//*************************START input FIFO max size queue
//	public enum FIFO_QUEUE_COMMAND
//	{
//		OFFER,
//		TAKE,
//		SIZE
//	}
//
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input = br.readLine();
//		String[] inputNumbers = input.split(" ");
//		Integer numCommands = Integer.parseInt(inputNumbers[0]);
//		Integer capacity = Integer.parseInt(inputNumbers[1]);
//		List<String> queue = new ArrayList<>();
//
//		for(int i = 0; i < numCommands; i++)
//		{
//			FIFO_QUEUE_COMMAND currentCommand = null;
//			String offeredString = null;
//			String commandInput = br.readLine();
//			if(commandInput.contains("TAKE"))
//			{
//				currentCommand = FIFO_QUEUE_COMMAND.TAKE;
//			}
//			else
//			if(commandInput.contains("SIZE"))
//			{
//				currentCommand = FIFO_QUEUE_COMMAND.SIZE;
//			}
//			else
//			if(commandInput.contains("OFFER"))
//			{
//
//				currentCommand = FIFO_QUEUE_COMMAND.OFFER;
//				offeredString = commandInput.substring(6);
//
//			}
//
//			enumSubroutine(currentCommand, offeredString, capacity, queue);
//		}
//	}
//
//	private static void enumSubroutine(FIFO_QUEUE_COMMAND currentCommand, String offeredString, Integer capacity, List<String> queue) throws Exception
//	{
//		if(currentCommand.equals(FIFO_QUEUE_COMMAND.OFFER))
//		{
//			offerSubroutine(offeredString, capacity, queue);
//		}
//		else
//		if(currentCommand.equals(FIFO_QUEUE_COMMAND.TAKE))
//		{
//			takeSubroutine(queue);
//		}
//		else
//		if(currentCommand.equals(FIFO_QUEUE_COMMAND.SIZE))
//		{
//			sizeSubroutine(queue);
//		}
//		else
//		{
//			throw new Exception("Command is null");
//		}
//	}
//
//	private static void sizeSubroutine(List<String> queue)
//	{
//		System.out.println(queue.size());
//	}
//
//	private static void takeSubroutine(List<String> queue)
//	{
//		String takenString = queue.remove(0);
//		System.out.println(takenString);
//	}
//
//	private static void offerSubroutine(String offeredString, Integer capacity, List<String> queue)
//	{
//		Integer currentSize = queue.size();
//
//		if(currentSize >= capacity)
//		{
//			System.out.println("false");
//		}
//		else
//		{
//			queue.add(offeredString);
//			System.out.println("true");
//		}
//	}
	//*******************************END input FIFO max size queue

	//*******************************START Which tree to cut to make lawn aesthetically pleasing
//	public int howManyCombinationsOfOneTreeToCut(int[] treeHeightsInOrder)
//	{
//		List<Integer> treesMasterList = intArrayToIntegerList(treeHeightsInOrder);
//
//		if(areTreesAstheticallyPleasing(treesMasterList))
//		{
//			return 0;
//		}
//
//		List<Integer> indeciesRemovable = new ArrayList<>();
//		//else check every combination of 1 removal
//
//		for(int i = 0; i < treeHeightsInOrder.length; i++)
//		{
//			List<Integer> localTreeList = new ArrayList<>();
//			localTreeList.addAll(treesMasterList);	//consider the whole thing
//
//			localTreeList.remove(i);	//pick one to cut down
//
//			if(areTreesAstheticallyPleasing(localTreeList))
//			{
//				indeciesRemovable.add(i);
//			}
//		}
//
//		if(indeciesRemovable.isEmpty())
//		{
//			return -1;
//		}
//		else
//		{
//			return indeciesRemovable.size();
//		}
//	}
//	public boolean areTreesAstheticallyPleasing(List<Integer> treeHeightsInOrder)
//	{
//		if(treeHeightsInOrder.size() <= 1)
//		{
//			return true;
//		}
//
//		//Compare the first two to see the pattern start.
//		int currentHeight = treeHeightsInOrder.get(0);
//		boolean descendingAscendingFlag = false;
//		if(treeHeightsInOrder.get(1) < currentHeight)	//if the height of the 2nd tree is LESS than the height of the first:
//		{
//			descendingAscendingFlag = false;	//then we are descending in height historically
//		}
//		else
//		{
//			descendingAscendingFlag = true;		//then we are ascending in height historically
//		}
//		currentHeight = treeHeightsInOrder.get(1);
//
//		for(int i = 2; i < treeHeightsInOrder.size(); i++)
//		{
//			Integer nextHeight = treeHeightsInOrder.get(i);
//			if(descendingAscendingFlag == true)	//if we were ascending
//			{
//				if(nextHeight > currentHeight)	//our next height is higher while already going up. Not pleasing.
//				{
//					return false;
//				}
//				descendingAscendingFlag = false;
//			}
//			else	//else we were descending
//			{
//				if(nextHeight < currentHeight)	//our next height is shorter while already going down. Not pleasing.
//				{
//					return false;
//				}
//				descendingAscendingFlag = true;
//			}
//			//Flag swapped, next tree considered to eval
//			currentHeight = nextHeight;
//		}
//
//		return true;
//	}
	//**************************END Which tree to cut to make lawn aesthetically pleasing

	public List<Integer> intArrayToIntegerList(int[] input)
	{
		List<Integer> returnList = new ArrayList<>();
		for(int i = 0; i < input.length; i++)
		{
			returnList.add(input[i]);
		}

		return returnList;
	}

//	************************* START Reverse Words in Sentence
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input = br.readLine();
//		String[] sanitizedInput = input.split(" ");
//		Integer lines = Integer.parseInt(sanitizedInput[0]);
//		String outputPrint = "";
//		for(int i = 0; i < lines; i++)
//		{
//			String inputSentence = br.readLine();
//			outputPrint = reverseWordsInString(inputSentence);
//			System.out.println(outputPrint);
//			outputPrint = "";
//		}
//	}
//
//	public static String reverseWordsInString(String sentence)
//	{
//		String output = "";
//		String[] splitWords = sentence.split(" ");
//		for(int i = splitWords.length-1; i >= 0; i--)
//		{
//			output += splitWords[i] + " ";
//		}
//		output = output.substring(0, output.length()-1);
//		return output;
//	}
	// ******************* END Reverse Words in Sentence

//	********************** START Fibbonaci - like sequence
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input = br.readLine();
//		String[] numbers = input.split(" ");
//		Integer case1 = Integer.parseInt(numbers[0]);
//		Integer case2 = Integer.parseInt(numbers[1]);
//		Integer targetCase = Integer.parseInt(numbers[2]);
//
//		List<Integer> resultsCases = new ArrayList<>();
//		resultsCases.add(case1);
//		resultsCases.add(case2);
//
//		for(int i = 2; i < targetCase; i++)
//		{
//			Integer caseMinus2 = resultsCases.get(i-2);
//			Integer caseMinus1 = resultsCases.get(i-1);
//			Integer caseCurrent = caseMinus2 + caseMinus1;
//			resultsCases.add(caseCurrent);
//		}
//
//		System.out.println(resultsCases.get(targetCase-1));
//	}
	// ****************** END Fibonnaci - like sequence
}
