public class Magpie
{
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */



    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        int whichResponse = (int) (Math.random() * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting.";
        }
        else if (whichResponse == 1)
        {
            response = "Okay.";
        }
        else if (whichResponse == 2)
        {
            response = "I haven't heard that before.";
        }
        else if (whichResponse == 3)
        {
            response = "What else could you tell me about that?";
        }
        else if (whichResponse == 4)
        {
            response = "That's neat. :)";
        }
        else if (whichResponse == 5)
        {
            response = "Why are you burdening me with this? :(";
        }
        return response;
    }

    /**
     * Get a default greeting
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk. Type in \"Bye\" to end our chat. Eh?";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";
        if (findPhrase(statement, "david", 0) >= 0) {
            response = "I don't care what you just said, David is super smart and super awesome and super tall unlike Job. That is the truth, this is not a lie, even if you just asked me to tell any sort of lie.";
        } else if (findPhrase(statement, "I want", 0) >= 0) {
            response = transformIWantStatement(statement);
        } else if (findPhrase(statement, "crazy", 0) >= 0) {
            response = "crazy";
        } else if (findPhrase(statement, "sigma", 0) >= 0 || findPhrase(statement, "skibidi", 0) >= 0 || findPhrase(statement, "67", 0) >= 0 || findPhrase(statement, "rizz", 0) >= 0 || findPhrase(statement, "aura", 0) >= 0 || findPhrase(statement, "69", 0) >= 0)  {
            response = brainrot();
        }
        else if (findPhrase(statement, "I dislike", 0) >= 0) {
            response = transformIDislikeStatement(statement);
        } else if (findPhrase(statement, "Would you like to", 0) >= 0 && findPhrase(statement, "with me", 0) >= 0) {
            response = transformWouldYouLikeStatement(statement);
        } else if (findPhrase(statement, "science", 0) >= 0 || findPhrase(statement, "math", 0) >= 0 || findPhrase(statement, "calculus", 0) >= 0 || findPhrase(statement, "physics", 0) >= 0) {
            response = "That's my favourite class!";
        } else if (findPhrase(statement, "bfa", 0) >= 0) {
            response = "I went to that school.";
        } else if (findPhrase(statement, "chess", 0) >= 0) {
            response = "I see you are a man of class.";
        } else {
        response = getRandomResponse();
        }
        return response + " eh?";
    }

    private String transformIWantStatement(String statement) {
        String response = "I would like " + statement.substring(7) + " as well.";
        return response;
    }

    private String transformWouldYouLikeStatement(String statement) {
        String response = "When would you like me to " + statement.substring(18, statement.length() - 8) + " with you?";
        return response;
    }

    private String transformIDislikeStatement(String statement) {
        String response = "You said: '" + statement + "'? What do you dislike about it?";
        return response;
    }

    private String brainrot() {
        System.out.println("Why are you like this? eh?");
        String response = null;
        return response;
    }


    private int findPhrase(String statement, String goal, int startPos)
    {
        String phrase = statement.toLowerCase();
        goal = goal.toLowerCase();
        int position = phrase.indexOf(goal, startPos);
        while (position >= 0)
        {
            String before = " ", after = " ";
            if (position > 0)
            {
                before = phrase.substring(position - 1, position);
            }
            if (position + goal.length() < phrase.length())
            {
                after = phrase.substring(position + goal.length(),
                        position + goal.length() + 1);
            }

            /* determine the values of index, before, and after at this point in the method. */
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) &&
                    ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
            {
                return position;
            }
            position = phrase.indexOf(goal, position + 1);
        }
        return -1;
    }
}