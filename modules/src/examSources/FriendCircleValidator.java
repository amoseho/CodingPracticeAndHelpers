package src.examSources;

/*
There are N students in a class. Some of them are friends, while some are not. Their friendship is transitive in nature. For example, if A is a direct friend of B, and B is a direct friend of C, then A is an indirect friend of C. And we defined a friend circle is a group of students who are direct or indirect friends.

Given a N*N matrix M representing the friend relationship between students in the class. If M[i][j] = 1, then the ith and jth students are direct friends with each other, otherwise not. And you have to output the total number of friend circles among all the students.

Example 1:
Input:
[[1,1,0],
 [1,1,0],
 [0,0,1]]
Output: 2
Explanation:The 0th and 1st students are direct friends, so they are in a friend circle.
The 2nd student himself is in a friend circle. So return 2.
Example 2:
Input:
[[1,1,0],
 [1,1,1],
 [0,1,1]]
Output: 1
Explanation:The 0th and 1st students are direct friends, the 1st and 2nd students are direct friends,
so the 0th and 2nd students are indirect friends. All of them are in the same friend circle, so return 1.
Note:
N is in range [1,200].
M[i][i] = 1 for all students.
If M[i][j] = 1, then M[j][i] = 1.
 */

import src.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FriendCircleValidator
{

	public static Integer findCountOfFriendsGroup(int[][] friendMap)
	{
		Integer friendCircles = 0;
		List<List<Integer>> friendsFriends = new ArrayList<>();
		for(int i = 0; i < friendMap.length; i++)
		{
			List<Integer> friends = new ArrayList<>();
			friendsFriends.add(friends);
		}
		//Now we have N empty lists. Cool.

		HashMap<Integer,Boolean> friendsAccountedFor = new HashMap<>();
		for(int i = 0; i < friendMap.length; i++)
		{
			friendsAccountedFor.put(i, false);
		}
		//Now we have N false friends. Cool.

		List<Pair<Integer, Integer>> coordinatesVisited = new ArrayList<>(friendMap.length);

		for(int i = 0; i < friendMap.length; i++)
		{
			List<Integer> friendsOfCurrentPerson = friendsFriends.get(i);

			//guaranteed to be N*N
			for(int j = 0; j < friendMap.length; j++)
			{
				if(friendMap[i][j] == 1 && !friendsOfCurrentPerson.contains(j))
				{
					friendsOfCurrentPerson.add(j);
				}
			}
			friendsFriends.set(i, friendsOfCurrentPerson);
		}

		for(int i = 0; i < friendsFriends.size(); i++)
		{
			//For every friend of this friend
			//Check all their friends
			//True-ify me cap'n.
			truifyAllFriendsForFriendsOfIndex(i, friendsFriends, friendsAccountedFor);
			friendCircles++;
		}

		return friendCircles;
	}

	private static void truifyAllFriendsForFriendsOfIndex(Integer friend, List<List<Integer>> friendsFriends,
														  HashMap<Integer, Boolean> friendsAccountedFor)
	{
		List<Integer> friendsOfCurrentPerson = friendsFriends.get(friend);
		for(Integer currentFriend : friendsOfCurrentPerson)
		{
			if(friendsAccountedFor.get(currentFriend))
			{
				continue;
			}
			else
			{
				friendsAccountedFor.put(friend, true);
				truifyAllFriendsForFriendsOfIndex(friend, friendsFriends, friendsAccountedFor);
			}
		}
	}

	private static void traverseMap(int[][] friendMap, int i, int j, List<Pair<Integer, Integer>> coordinatesVisited)
	{
		Pair currentCoordinate = new Pair(i, j);
		//Add it to the coords visited
		addCoordinateToList(currentCoordinate, coordinatesVisited);

		//Check up
		currentCoordinate = new Pair<>(i-1, j);
		if(!coordinatesVisited.contains(currentCoordinate) && (i > 0) && (friendMap[i-1][j] == 1))
		{
			traverseMap(friendMap, i-1, j, coordinatesVisited);
		}
		//Check down
		currentCoordinate = new Pair<>(i+1, j);
		if(!coordinatesVisited.contains(currentCoordinate) && ((i+1) < friendMap.length) && (friendMap[i+1][j] == 1))
		{
			traverseMap(friendMap, i+1, j, coordinatesVisited);
		}
		//Check left
		currentCoordinate = new Pair<>(i, j-1);
		if(!coordinatesVisited.contains(currentCoordinate) && (j > 0) && (friendMap[i][j-1] == 1))
		{
			traverseMap(friendMap, i, j-1, coordinatesVisited);
		}
		//Check right
		currentCoordinate = new Pair<>(i, j+1);
		if(!coordinatesVisited.contains(currentCoordinate) && ((j+1) < friendMap.length) && (friendMap[i][j+1] == 1))
		{
			traverseMap(friendMap, i, j+1, coordinatesVisited);
		}

		//Return. We scouted the whole island, I mean, friend group
		return;
	}

	private static void addCoordinateToList(Pair currentCoordinate, List<Pair<Integer, Integer>> coordinatesVisited)
	{
		if(coordinatesVisited.contains(currentCoordinate))
		{
			try
			{
				throw new Exception("Wait what");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		coordinatesVisited.add(currentCoordinate);
	}
}
