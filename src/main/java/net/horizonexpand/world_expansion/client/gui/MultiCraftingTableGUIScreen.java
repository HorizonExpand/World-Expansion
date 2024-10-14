package net.horizonexpand.world_expansion.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.horizonexpand.world_expansion.world.inventory.MultiCraftingTableGUIMenu;
import net.horizonexpand.world_expansion.network.MultiCraftingTableGUIButtonMessage;
import net.horizonexpand.world_expansion.WorldExpansionMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MultiCraftingTableGUIScreen extends AbstractContainerScreen<MultiCraftingTableGUIMenu> {
	private final static HashMap<String, Object> guistate = MultiCraftingTableGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_change;

	public MultiCraftingTableGUIScreen(MultiCraftingTableGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("world_expansion:textures/screens/multi_crafting_table_gui_copper_horn.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_copper_horn.label_inventory"), 6, 75, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_copper_horn.label_multicrafting_table"), 6, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_change = new ImageButton(this.leftPos + 132, this.topPos + 43, 8, 8, 0, 0, 8, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_change.png"), 8, 16, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIButtonMessage(0, x, y, z));
				MultiCraftingTableGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_change", imagebutton_change);
		this.addRenderableWidget(imagebutton_change);
	}
}
