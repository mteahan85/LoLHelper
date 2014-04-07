

public class ChampionInfo {

// Name, Title, and Roles
private	String name;
private String title;
private String primary;
private String secondary;

// Physical Stats
private double armor;
private double attackDam;
private double attackSpeed;
private double range;
private String rangeType;
private double health;
private double healthRegen;
private double movespeed;
private double mana;
private double manaRegen;
private double magicRes;

//Health and Magic Stats
private double healthPerLevel;
private double healthRegenPerLevel;
private double manaPerLevel;
private double manaRegenPerLevel;
private double attackDamPerLevel;
private double attackSpeedPerLevel;
private double armorPerLevel;
private double magicResPerLevel;

// Skill Rankings
private int attack;
private int defense;
private int difficulty;
private int magicAbility;

//Spells
private SpellInfo spells [];


//We need to figure out how we will be displaying the champion image: URL or storing the image in our app
//Note: Any setter with a Growth input. The Growth input is the increase in
//that stat per level (or the extra number next to the stat on the wiki page)
public ChampionInfo()
{
	name = null;
	title = null;
	primary = null;
	secondary = null;
	armor = 0;
	attackDam = 0; 
	attackSpeed = 0;
	range = 0;
	rangeType= null;
	health = 0;
	healthRegen = 0;
	movespeed = 0;
	mana = 0; 
	manaRegen = 0;
	magicRes = 0; 
	attack = 0;
	defense = 0; 
	difficulty = 0; 
	magicAbility = 0; 

}


//setters
public void setNameTitle(String nameOf, String titleOf)
{
	name = nameOf; 
	title = titleOf;
	
}

public void setTypes(String prim, String sec)
{
	primary = prim;
	secondary = sec;
}

public void setInfo(int att, int def, int mag, int diff)
{
	attack = att;
	defense = def;
	difficulty = diff;
	magicAbility = mag; 
	
}
public void setAttackDam(double attDam, double attDamGrowth)
{
	attackDam = attDam;
	attackDamPerLevel = attDamGrowth;
	
	
}
public void setAttackSpeed(double attSpeed, double attSpeedGrowth)
{

	attackSpeed = attSpeed;
	attackSpeedPerLevel = attSpeedGrowth;
	
}

public void setRange(double attRange, String ragType)
{

	range = attRange; 
	rangeType = ragType;
	
}
public void setArmor(double arm, double armorGrowth)
{
	armor = arm; 	
	armorPerLevel = armorGrowth;
}

public void setMoveSpeed(double ms)
{
	movespeed = ms; 	
}

public void setHealthInfo(double heal, double healGrowth, double healreg, double healregGrowth)
{
	health = heal;
	healthPerLevel = healGrowth;
	healthRegen = healreg;
	healthRegenPerLevel = healregGrowth; 
}
public void setManaInfo(double mn, double mnGrowth, double mnreg, double mnregGrowth, double magRes, double magResGrowth)
{
	mana = mn;
	manaPerLevel = mnGrowth;
	manaRegen = mnreg;
	manaRegenPerLevel = mnregGrowth;
	magicRes = magRes;
	magicResPerLevel = magResGrowth; 
}

public void setSpells(SpellInfo spellArray [] )
{
	spells = new SpellInfo[spellArray.length];
	
	for(int i = 0; i < spells.length; i++)
	{
		spells[i] = spellArray[i];
	}
}


//getters for names/titles
public String getName()
{
	return name;
}
public String getTitle()
{
	return title;
}
public String getPrimary()
{
	return primary;
}
public String getSecondary()
{
	return secondary;
}

//getters for Info
public int getAttack()
{
	return attack;
}
public int getDefense()
{
	return defense;
}
public int getDifficulty()
{
	return difficulty;
}
public int getMagicOrAbility()
{
	return magicAbility;
}

//getters for Stats


// Armor Info 
public double getArmor()
{
	return armor;
}
public double getArmorPerLevel()
{
	return armorPerLevel;
}


// Attack Damage Info 
public double getAttackDam()
{
	return attackDam;
}
public double getAttackDamPerLevel()
{
	return attackDamPerLevel;
}


// Attack Speed Info
public double getAttackSpeed()
{
	return attackSpeed;
}
public double getAttackSpeedPerLevel()
{
	return attackSpeedPerLevel;
}


//Range Info 
public double getRange()
{
	return range;
}
public String getRangeType()
{
	return rangeType;
}

// Health Info
public double getHealth()
{
	return health;
}
public double getHealthPerLevel()
{
	return healthPerLevel;
}


// Health Regen Info
public double getHealthRegen()
{
	return healthRegen;
}
public double getHealthRegenPerLevel()
{
	return healthRegenPerLevel;
}


//Mana Info
public double getMana()
{
	return mana;
}
public double getManaPerLevel()
{
	return manaPerLevel;
}

//Mana Regen Info
public double getManaRegen()
{
	return manaRegen;
}
public double getManaRegenPerLevel()
{
	return manaRegenPerLevel;
}


// Magic Res Info 
public double getMagicRes()
{
	return magicRes;
}
public double getMagicResPerLevel()
{
	return magicResPerLevel;
}



// Movespeed Info 
public double getMoveSpeed()
{
	return movespeed;
}

// Spell Info
public SpellInfo[] getSpells()
{
	return spells;
}























}
