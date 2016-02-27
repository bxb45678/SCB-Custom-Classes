package FJI.plugins.TestClass;


import FJI.plugins.SCB.main.Utils;
import FJI.plugins.SCB.objects.SCBClass;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ExampleClass extends SCBClass{
    @Override
    public String id() {
        return "example";
    }

    @Override
    public String DisplayName() {
        return ChatColor.GOLD+"[Example]";
    }

    @Override
    public String permission() {
        return "scb.classes.example";
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.CHICKEN;
    }

    @Override
    public ItemStack Icon() {
        ItemStack icon = new ItemStack(Material.DIRT, 1);
        ItemMeta im = icon.getItemMeta();
        im.setDisplayName(ChatColor.GOLD+"Example");
        icon.setItemMeta(im);
        return icon;
    }

    public void ShootBow(EntityShootBowEvent e){
    }

    @Override
    public void Spawn(Player p) {
        List<ItemStack> l = Utils.setColorArmor(Color.BLUE);
        p.getInventory().setHelmet(Utils.getPlayerHead("bxb45678"));

        ItemStack i1 = new ItemStack(Material.DIAMOND_SWORD, 1);
        i1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 10);
        i1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
        i1.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 10);
        p.getInventory().addItem(i1);
        p.getInventory().setChestplate(l.get(0));
        p.getInventory().setLeggings(l.get(1));
        p.getInventory().setBoots(l.get(2));
    }

    public void ProjectileHit(ProjectileHitEvent e){        //What to do when their launched projectile hits something/someone
    }
}
