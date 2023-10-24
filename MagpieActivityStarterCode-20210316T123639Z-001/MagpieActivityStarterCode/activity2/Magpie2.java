/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
    
		String response = "";

    //2.3 A2.2
    if (statement.trim().equals(""))
    {
      response = "Say something, please.";
    }
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
    else if (statement.indexOf("city") >= 0)
    {
      response = "Tell me more about that city.";
    }
    else if (statement.indexOf("friend") >= 0)
    {
      response = "Tell me more about your friend.";
    }
    else if (statement.indexOf("school") >=0)
    {
      response = "Sounds like an interesting school.";
    }
    //2.1
    else if (statement.indexOf("dog") >= 0
        || statement.indexOf("cat") >= 0)
    {
      response = "Tell me more about your pets.";
    }
    //2.2
    else if (statement.indexOf("Mrs Shawver") >= 0)
    {
      response = "Mrs Shawver is the most amazing, intelligent, helpful, and hard-working teacher EVER! We couldn't ask for a better teacher than her!";
    }
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
  //private-- 
	private String getRandomResponse()
	{
    //x.changed the four
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
    //2.4
    else if (whichResponse == 4)
		{
			response = "Who told you that?";
		}
    else if (whichResponse == 5)
		{
			response = "Cool...but I didn't ask";
		}

		return response;
	}
}
