package net.horizonexpand.world_expansion.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.horizonexpand.world_expansion.world.inventory.MultiCraftingTableGUIAstilbaMenu;
import net.horizonexpand.world_expansion.network.MultiCraftingTableGUIAstilbaButtonMessage;
import net.horizonexpand.world_expansion.WorldExpansionMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MultiCraftingTableGUIAstilbaScreen extends AbstractContainerScreen<MultiCraftingTableGUIAstilbaMenu> {
	private final static HashMap<String, Object> guistate = MultiCraftingTableGUIAstilbaMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_cyan_dye_craft_gui;
	ImageButton imagebutton_light_blue_dye_craft_gui;
	ImageButton imagebutton_magenta_dye_craft_gui;
	ImageButton imagebutton_orange_dye_craft_gui;
	ImageButton imagebutton_pink_dye_craft_gui;
	ImageButton imagebutton_yellow_dye_craft_gui;
	ImageButton imagebutton_copper_horn_craft_gui_tab;
	ImageButton imagebutton_astilba_multicolored_craft_gui_t;

	public MultiCraftingTableGUIAstilbaScreen(MultiCraftingTableGUIAstilbaMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("world_expansion:textures/screens/multi_crafting_table_gui_astilba.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 87 && mouseX < leftPos + 102 && mouseY > topPos + 16 && mouseY < topPos + 31)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_astilba.tooltip_cyan_dye"), mouseX, mouseY);
		if (mouseX > leftPos + 105 && mouseX < leftPos + 121 && mouseY > topPos + 16 && mouseY < topPos + 32)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_astilba.tooltip_light_blue_dye"), mouseX, mouseY);
		if (mouseX > leftPos + 123 && mouseX < leftPos + 139 && mouseY > topPos + 16 && mouseY < topPos + 32)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_astilba.tooltip_magenta_dye"), mouseX, mouseY);
		if (mouseX > leftPos + 141 && mouseX < leftPos + 156 && mouseY > topPos + 16 && mouseY < topPos + 32)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_astilba.tooltip_orange_dye"), mouseX, mouseY);
		if (mouseX > leftPos + 105 && mouseX < leftPos + 121 && mouseY > topPos + 34 && mouseY < topPos + 49)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_astilba.tooltip_pink_dye"), mouseX, mouseY);
		if (mouseX > leftPos + 123 && mouseX < leftPos + 139 && mouseY > topPos + 34 && mouseY < topPos + 50)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_astilba.tooltip_yellow_dye"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("world_expansion:textures/screens/astilba_border.png"), this.leftPos + 34, this.topPos + 35, 0, 0, 16, 16, 16, 16);

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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_astilba.label_inventory"), 6, 75, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_astilba.label_multicrafting_table"), 6, 7, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_cyan_dye_craft_gui = new ImageButton(this.leftPos + 87, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_cyan_dye_craft_gui.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIAstilbaButtonMessage(0, x, y, z));
				MultiCraftingTableGUIAstilbaButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_cyan_dye_craft_gui", imagebutton_cyan_dye_craft_gui);
		this.addRenderableWidget(imagebutton_cyan_dye_craft_gui);
		imagebutton_light_blue_dye_craft_gui = new ImageButton(this.leftPos + 105, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_light_blue_dye_craft_gui.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIAstilbaButtonMessage(1, x, y, z));
				MultiCraftingTableGUIAstilbaButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_light_blue_dye_craft_gui", imagebutton_light_blue_dye_craft_gui);
		this.addRenderableWidget(imagebutton_light_blue_dye_craft_gui);
		imagebutton_magenta_dye_craft_gui = new ImageButton(this.leftPos + 123, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_magenta_dye_craft_gui.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIAstilbaButtonMessage(2, x, y, z));
				MultiCraftingTableGUIAstilbaButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_magenta_dye_craft_gui", imagebutton_magenta_dye_craft_gui);
		this.addRenderableWidget(imagebutton_magenta_dye_craft_gui);
		imagebutton_orange_dye_craft_gui = new ImageButton(this.leftPos + 141, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_orange_dye_craft_gui.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIAstilbaButtonMessage(3, x, y, z));
				MultiCraftingTableGUIAstilbaButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_orange_dye_craft_gui", imagebutton_orange_dye_craft_gui);
		this.addRenderableWidget(imagebutton_orange_dye_craft_gui);
		imagebutton_pink_dye_craft_gui = new ImageButton(this.leftPos + 105, this.topPos + 34, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_pink_dye_craft_gui.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIAstilbaButtonMessage(4, x, y, z));
				MultiCraftingTableGUIAstilbaButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_pink_dye_craft_gui", imagebutton_pink_dye_craft_gui);
		this.addRenderableWidget(imagebutton_pink_dye_craft_gui);
		imagebutton_yellow_dye_craft_gui = new ImageButton(this.leftPos + 123, this.topPos + 34, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_yellow_dye_craft_gui.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIAstilbaButtonMessage(5, x, y, z));
				MultiCraftingTableGUIAstilbaButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_yellow_dye_craft_gui", imagebutton_yellow_dye_craft_gui);
		this.addRenderableWidget(imagebutton_yellow_dye_craft_gui);
		imagebutton_copper_horn_craft_gui_tab = new ImageButton(this.leftPos + 172, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_copper_horn_craft_gui_tab.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIAstilbaButtonMessage(6, x, y, z));
				MultiCraftingTableGUIAstilbaButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_copper_horn_craft_gui_tab", imagebutton_copper_horn_craft_gui_tab);
		this.addRenderableWidget(imagebutton_copper_horn_craft_gui_tab);
		imagebutton_astilba_multicolored_craft_gui_t = new ImageButton(this.leftPos + 172, this.topPos + 34, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_astilba_multicolored_craft_gui_t.png"), 16, 32,
				e -> {
				});
		guistate.put("button:imagebutton_astilba_multicolored_craft_gui_t", imagebutton_astilba_multicolored_craft_gui_t);
		this.addRenderableWidget(imagebutton_astilba_multicolored_craft_gui_t);
	}
}
