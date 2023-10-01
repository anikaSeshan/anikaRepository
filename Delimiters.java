import java.util.ArrayList;

public class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

	public ArrayList<String> getDelimitersList(String[] tokens)
	{
		ArrayList<String> delimiters = new ArrayList<>();

		for(String i: tokens)
		{
			if(i.equals(openDel) || i.equals(closeDel))
			{
				delimiters.add(i);
			}
		}

		return delimiters;
	}

	public boolean isBalanced(ArrayList<String> delimiters)
	{
		int countOpen = 0, countClose = 0;

		for(String x: delimiters)
		{
			if(x.equals(openDel))
			{
				countOpen += 1;
			}
			else
			{
				countClose += 1;
			}

			if(countClose > countOpen)
			{
				break;
			}
		}

		return countOpen == countClose;
	}
}