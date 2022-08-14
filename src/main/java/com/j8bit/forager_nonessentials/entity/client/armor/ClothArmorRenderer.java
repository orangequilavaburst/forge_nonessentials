package com.j8bit.forager_nonessentials.entity.client.armor;

import com.j8bit.forager_nonessentials.item.ItemClothArmor;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.IAnimatableModel;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ClothArmorRenderer<T extends ArmorItem & IAnimatable> extends GeoArmorRenderer<ItemClothArmor> {

    protected T currentArmorItem;
    private final AnimatedGeoModel<T> modelProvider;

    public ClothArmorRenderer(AnimatedGeoModel modelProvider) {
        super(modelProvider);
        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
        this.modelProvider = modelProvider;
    }

    @Override
    public ClothArmorRenderer applySlot(EquipmentSlot slot) {
        this.modelProvider.getModel(this.modelProvider.getModelLocation(this.currentArmorItem));
        IBone headBone = this.getAndHideBone(this.headBone);
        IBone bodyBone = this.getAndHideBone(this.bodyBone);
        IBone rightArmBone = this.getAndHideBone(this.rightArmBone);
        IBone leftArmBone = this.getAndHideBone(this.leftArmBone);
        IBone rightLegBone = this.getAndHideBone(this.rightLegBone);
        IBone leftLegBone = this.getAndHideBone(this.leftLegBone);
        IBone rightBootBone = this.getAndHideBone(this.rightBootBone);
        IBone leftBootBone = this.getAndHideBone(this.leftBootBone);
        switch (slot) {
            case HEAD:

                break;
            case CHEST:
                if (headBone != null) {
                    headBone.setHidden(false);
                }

                if (bodyBone != null) {
                    bodyBone.setHidden(false);
                }

                if (rightArmBone != null) {
                    rightArmBone.setHidden(false);
                }

                if (leftArmBone != null) {
                    leftArmBone.setHidden(false);
                }

                if (rightLegBone != null) {
                    rightLegBone.setHidden(false);
                }

                if (leftLegBone != null) {
                    leftLegBone.setHidden(false);
                }

                if (rightBootBone != null) {
                    rightBootBone.setHidden(false);
                }

                if (leftBootBone != null) {
                    leftBootBone.setHidden(false);
                }
                break;
            case LEGS:
                break;
            case FEET:
                break;
        }

        return this;
    }
}
