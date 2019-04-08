package src.test;

import org.junit.jupiter.api.Test;
import src.examSources.PasswordStengtheningChecker;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStengtheningCheckerTest
{

	@Test
	void strongPasswordCheckerNoChangesNeeded() throws InterruptedException
	{
		String password = "aBcDeF69";
		Integer changesNeeded = PasswordStengtheningChecker.strongPasswordChecker(password);
		assert changesNeeded.equals(0);
	}

	@Test
	void strongPasswordCheckerRemoveTriplicate() throws InterruptedException
	{
		String password = "aBcccDeF69";
		Integer changesNeeded = PasswordStengtheningChecker.strongPasswordChecker(password);
		assert changesNeeded.equals(1);
	}
}