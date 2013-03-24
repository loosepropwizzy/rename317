package rs2;


import rs2.model.entity.Entity;

public class Item extends Entity {

    public final Model getRotatedModel()
    {
        ItemDef itemDef = ItemDef.forID(ID);
            return itemDef.getModelForAmmount(itemCount);
    }

    public Item()
    {
    }

    public int ID;
    public int x;
	public int y;
	public int itemCount;
}
