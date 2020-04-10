package src.test;

import org.junit.jupiter.api.Test;
import src.helperClasses.Pair;
import src.examSources.MovieTheatreTimingsValidator;

class MovieTheatreTimingsValidatorTest
{
	@Test
	void defaultTestCase()
	{
//		Example:
//		Movie Length : 107 minutes
//		Length of Operation: 862 minutes
		Pair<Integer, Integer> result = MovieTheatreTimingsValidator.getMoviePlayTimeAnd5IntervalRunnings(107, 862);
		assert result.getKey().equals(8);
		assert result.getValue().equals(5);
	}
}