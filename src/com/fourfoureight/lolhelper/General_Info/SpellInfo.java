public class SpellInfo {

private String name;
private String description;
private int cost [];
private String costType;
private double cooldown;

private int range;
private String statsPerLevel [];

//We need to figure out how we will be displaying the spell image: URL or storing the image in our app

public SpellInfo()
{
	name = null;
	description = null;
	cooldown = 0; 
	range = 0; 	
}

// setters for Spell Info
public void setSpellName(String namer)
{
	name = namer;
}

public void setDescription(String des)
{
	description = des; 
}
public void setCoolDown(double cool)
{
	cooldown = cool;
}
public void setSpellRange(int spellRange)
{
	range = spellRange; 
}
public void setStatsPerLevel(String stats [])
{
	statsPerLevel = new String[stats.length];
	
	for(int i = 0; i < stats.length; i++)
	{
		
		statsPerLevel[i] = stats[i];
		
	}
}
public void setCost(int costOf [])
{
	cost = new int[costOf.length];
	
	for(int i = 0; i < costOf.length; i++)
	{
		
		cost[i] = costOf[i];
		
	}
}
public void setCostType(String cosType)
{
	costType = cosType;
}

// getters for Spell Info
public String getSpellName()
{
	return name;
}
public String getDescription()
{
	return description;
}
public double getCoolDown()
{
	return cooldown;
}
public int getSpellRange()
{
	return range;
}
public String[] getStatsPerLevel()
{
	return statsPerLevel;
}

// Cost Info
public int[] getCost()
{
	return cost;
}
public String getCostType()
{
	return costType;
}


}
