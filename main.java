package recap1;

public class main {
	boolean[] myDeck = new boolean[52];
	final int cardsPerRow = 8;
	int cardsThisRow = 0;
	int myCard;
	initDeck(myDeck);
	System.out.println("\nHere is a shuffled deck ...\n");
	while (!emptyDeck(myDeck))
	{
	myCard = dealCard(myDeck);
	++cardsThisRow;
	if (cardsThisRow <= cardsPerRow)
	{
	printCard(myCard);
	System.out.print(" ");
	}
	else
	{
	System.out.println("");
	cardsThisRow = 1;
	printCard(myCard);
	System.out.print(" ");
	}
	}
	System.out .println(’\n’);
}
