package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.EntityHorse
@TrapTag
public interface EntityHorse {
	public java.lang.String getName();
	public int getType();
	public void p(boolean arg0);
	public boolean c(ItemStack arg0);
	public boolean h(EntityHuman arg0);
	public void h();
	public void m(boolean arg0);
	public void cs();
	public boolean cb();
	public int getVariant();
	public void b(NBTTagCompound arg0);
	public void k(boolean arg0);
	public void j(boolean arg0);
	public void e();
	public void e(float arg0, float arg1);
	public void e(boolean arg0);
	public void a(boolean arg0);
	public GroupDataEntity a(GroupDataEntity arg0);
	public void a(InventorySubcontainer arg0);
	public boolean a(EntityHuman arg0);
	public void a(NBTTagCompound arg0);
	public void d(ItemStack arg0);
	public void g(EntityHuman arg0);
	public int v(int arg0);
	public boolean damageEntity(DamageSource arg0, float arg1);
	public void die(DamageSource arg0);
	public void n(boolean arg0);
	public void o(boolean arg0);
	public void w(int arg0);
	public int bB();
	public boolean h_();
	public int q();
	public int aU();
	public boolean canSpawn();
	public void ab();
	public boolean R();
	public double getJumpStrength();
	public int getMaxDomestication();
	public boolean hasChest();
	public EntityAgeable createChild(EntityAgeable arg0);
	public boolean mate(EntityAnimal arg0);
	public void setTame(boolean arg0);
	public boolean co();
	public void setHasChest(boolean arg0);
	public boolean cu();
	public void cK();
	public int cl();
	public boolean isTame();
	public boolean cB();
	public boolean cC();
	public java.lang.String getOwnerUUID();
	public void cJ();
	public boolean cn();
	public boolean cp();
	public boolean bM();
	public float ci();
	public void setTemper(int arg0);
	public boolean cj();
	public boolean cF();
	public void loadChest();
	public void setType(int arg0);
	public void setOwnerUUID(java.lang.String arg0);
	public void setVariant(int arg0);
	public int getTemper();
	public boolean cr();
	public boolean cE();
	public boolean cm();
	public boolean cg();
}
