package dk.gamingtutsdk.minescape.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityMan extends EntityMob//extend this to make mob hostile
{
public EntityMan(World par1World)
{
	super(par1World);//super call
	this.texture = "/mods/minescape/textures/mobs/man.png";//specifies texture
	this.moveSpeed = .3f;//sets how fast this mob moves
	//below this is all the ai tasks that specify how the mob will behave mess around with it to see what happens
	this.tasks.addTask(0, new EntityAISwimming(this));
	this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
	this.tasks.addTask(2, new EntityAIMoveTwardsRestriction(this, this.moveSpeed));
	this.tasks.addTask(3, new EntityAIWander(this, this.moveSpeed));
    this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(5, new EntityAILookIdle(this));
	this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, false));

	//end of ai tasks
}

/**
 * Returns the amount of damage a mob should deal.
 */
public int getAttackStrength(Entity par1Entity)
{
    ItemStack itemstack = this.getHeldItem();
    int i = 5;

    if (itemstack != null)
    {
        i += itemstack.getDamageVsEntity(this);
    }

    return i;
}

protected void addRandomArmor()
{
    this.setCurrentItemOrArmor(0, new ItemStack(Item.stick));
}

public int getMaxHealth()//says that the mob will have a health of 20
{
return 20;
}

protected boolean isAIEnabled()//says that the tasks we told it to do before will be run
{
return true;
}

/**
 * Returns the sound this mob makes while it's alive.
 */
protected String getLivingSound()
{
    return "mob.zombiepig.zpig";
}

/**
 * Returns the sound this mob makes when it is hurt.
 */
protected String getHurtSound()
{
    return "mobs.grim";
}

/**
 * Returns the sound this mob makes on death.
 */
protected String getDeathSound()
{
    return "mob.zombiepig.zpigdeath";
}

}