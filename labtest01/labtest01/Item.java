package labtest01;

/**
 * An item in a grocery store: 
 * Jar of peanut butter, package of pasta,
 * whatever.
 */
public class Item implements Comparable<Item>
{
	private final String aName;
	private final int aId;
	private final int aPrice; // In cents: 100 = one dollar
	private static int aId2=0;

	
	/**
	 * Creates a new item.
	 * @param pName The name of the item. Not necessarily unique.
	 * @param pId A unique id for the item
	 * @param pPrice The price of the item in cents
	 */
	public Item(String pName, int pPrice, int pID)
	{
		aName = pName;
		aPrice = pPrice;
		aId=pName.hashCode()+pPrice+aId2;
		aId2++;
	}
	
	
	/**
	 * @return The name of the item
	 */
	public String getName()
	{
		return aName;
	}
	
	/**
	 * @return The ID of the item.
	 */
	public int getId()
	{
		return aId;
	}
	
	/**
	 * @return The price of the item in cents
	 */
	public int getPrice()
	{
		return aPrice;
	}
	@Override
	public int compareTo(Item o) {
		if(aPrice-o.getPrice()<0){
			return -1;
		}else if(aPrice-o.getPrice()>0){
			return 1;
		}else{
			return 0;
		}
		
	}
}
