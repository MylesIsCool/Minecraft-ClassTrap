package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.TileEntityHopper
@TrapTag
public interface TileEntityHopper {
	public int getSize();
	public void c(int arg0);
	public void h();
	public void update();
	public void b(NBTTagCompound arg0);
	public boolean b(int arg0, ItemStack arg1);
	public boolean j();
	public void a(java.lang.String arg0);
	public boolean a(EntityHuman arg0);
	public void a(NBTTagCompound arg0);
	public boolean i();
	public java.lang.String getInventoryName();
	public boolean k_();
	public void l_();
	public ItemStack getItem(int arg0);
	public double aC();
	public ItemStack splitStack(int arg0, int arg1);
	public void setItem(int arg0, ItemStack arg1);
	public double aE();
	public double aD();
	public ItemStack splitWithoutUpdate(int arg0);
	public void setMaxStackSize(int arg0);
	public void startOpen();
	public ItemStack[] getContents();
	public java.util.List getViewers();
	public void onOpen(us.myles.cb.entity.CraftHumanEntity arg0);
	public void onClose(us.myles.cb.entity.CraftHumanEntity arg0);
	public int getMaxStackSize();
}
