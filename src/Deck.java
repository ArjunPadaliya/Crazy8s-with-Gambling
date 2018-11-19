import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	public ArrayList<String> arrayOfCards = new ArrayList<String>();
	public ArrayList<String> graveYardCards = new ArrayList<String>();
	public String topCard = "";
	
	public Deck()
	{
		String[] cards = {"1D", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "11D", "12D", "13D",
						"1S", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "11S", "12S", "13S",
						"1H", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "11H", "12H", "13H",
						"1C", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "11C", "12C", "13C",
		};
		
		for(int i =  0; i < cards.length; i++)
		{
		     arrayOfCards.add(cards[i]);
		}
	}
	
	public ArrayList<String> shuffle(ArrayList<String> al)
	{
		Collections.shuffle(arrayOfCards);
		return al;
	}
	
	public void reset()
	{
		
		arrayOfCards.addAll(graveYardCards);
		graveYardCards.clear();
		this.shuffle(arrayOfCards);
	}
	
	public void flip()
	{
		graveYardCards.add(arrayOfCards.get(0));
		arrayOfCards.remove(0);
				
	}
	
	
}
