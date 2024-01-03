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
	ImageButton imagebutton_copper_horn;
	ImageButton imagebutton_copper_horn1;
	ImageButton imagebutton_copper_horn2;
	ImageButton imagebutton_copper_horn3;
	ImageButton imagebutton_copper_horn4;
	ImageButton imagebutton_copper_horn5;
	ImageButton imagebutton_copper_horn6;
	ImageButton imagebutton_copper_horn7;
	ImageButton imagebutton_copper_horn8;
	ImageButton imagebutton_copper_horn9;
	ImageButton imagebutton_copper_horn_craft_gui_tab;
	ImageButton imagebutton_astilba_multicolored_craft_gui_t;

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
		if (mouseX > leftPos + 87 && mouseX < leftPos + 103 && mouseY > topPos + 16 && mouseY < topPos + 32)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_copper_horn.tooltip_copper_horn_0"), mouseX, mouseY);
		if (mouseX > leftPos + 105 && mouseX < leftPos + 121 && mouseY > topPos + 16 && mouseY < topPos + 32)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_copper_horn.tooltip_copper_horn_1"), mouseX, mouseY);
		if (mouseX > leftPos + 123 && mouseX < leftPos + 139 && mouseY > topPos + 16 && mouseY < topPos + 32)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_copper_horn.tooltip_copper_horn_2"), mouseX, mouseY);
		if (mouseX > leftPos + 141 && mouseX < leftPos + 156 && mouseY > topPos + 16 && mouseY < topPos + 31)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_copper_horn.tooltip_copper_horn_3"), mouseX, mouseY);
		if (mouseX > leftPos + 87 && mouseX < leftPos + 104 && mouseY > topPos + 34 && mouseY < topPos + 49)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_copper_horn.tooltip_copper_horn_4"), mouseX, mouseY);
		if (mouseX > leftPos + 105 && mouseX < leftPos + 121 && mouseY > topPos + 34 && mouseY < topPos + 50)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_copper_horn.tooltip_copper_horn_5"), mouseX, mouseY);
		if (mouseX > leftPos + 123 && mouseX < leftPos + 139 && mouseY > topPos + 34 && mouseY < topPos + 49)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_copper_horn.tooltip_copper_horn_6"), mouseX, mouseY);
		if (mouseX > leftPos + 141 && mouseX < leftPos + 156 && mouseY > topPos + 34 && mouseY < topPos + 50)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_copper_horn.tooltip_copper_horn_7"), mouseX, mouseY);
		if (mouseX > leftPos + 105 && mouseX < leftPos + 121 && mouseY > topPos + 52 && mouseY < topPos + 67)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_copper_horn.tooltip_copper_horn_8"), mouseX, mouseY);
		if (mouseX > leftPos + 123 && mouseX < leftPos + 139 && mouseY > topPos + 52 && mouseY < topPos + 67)
			guiGraphics.renderTooltip(font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_copper_horn.tooltip_copper_horn_9"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("world_expansion:textures/screens/horn_border.png"), this.leftPos + 34, this.topPos + 26, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("world_expansion:textures/screens/ingot_border.png"), this.leftPos + 52, this.topPos + 26, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("world_expansion:textures/screens/ingot_border.png"), this.leftPos + 16, this.topPos + 26, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("world_expansion:textures/screens/ingot_border.png"), this.leftPos + 34, this.topPos + 44, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_copper_horn.label_multicrafting_table"), 6, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.world_expansion.multi_crafting_table_gui_copper_horn.label_inventory"), 6, 75, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_copper_horn = new ImageButton(this.leftPos + 87, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_copper_horn.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIButtonMessage(0, x, y, z));
				MultiCraftingTableGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_copper_horn", imagebutton_copper_horn);
		this.addRenderableWidget(imagebutton_copper_horn);
		imagebutton_copper_horn1 = new ImageButton(this.leftPos + 105, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_copper_horn1.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIButtonMessage(1, x, y, z));
				MultiCraftingTableGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_copper_horn1", imagebutton_copper_horn1);
		this.addRenderableWidget(imagebutton_copper_horn1);
		imagebutton_copper_horn2 = new ImageButton(this.leftPos + 123, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_copper_horn2.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIButtonMessage(2, x, y, z));
				MultiCraftingTableGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_copper_horn2", imagebutton_copper_horn2);
		this.addRenderableWidget(imagebutton_copper_horn2);
		imagebutton_copper_horn3 = new ImageButton(this.leftPos + 141, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_copper_horn3.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIButtonMessage(3, x, y, z));
				MultiCraftingTableGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_copper_horn3", imagebutton_copper_horn3);
		this.addRenderableWidget(imagebutton_copper_horn3);
		imagebutton_copper_horn4 = new ImageButton(this.leftPos + 87, this.topPos + 34, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_copper_horn4.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIButtonMessage(4, x, y, z));
				MultiCraftingTableGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_copper_horn4", imagebutton_copper_horn4);
		this.addRenderableWidget(imagebutton_copper_horn4);
		imagebutton_copper_horn5 = new ImageButton(this.leftPos + 105, this.topPos + 34, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_copper_horn5.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIButtonMessage(5, x, y, z));
				MultiCraftingTableGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_copper_horn5", imagebutton_copper_horn5);
		this.addRenderableWidget(imagebutton_copper_horn5);
		imagebutton_copper_horn6 = new ImageButton(this.leftPos + 123, this.topPos + 34, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_copper_horn6.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIButtonMessage(6, x, y, z));
				MultiCraftingTableGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_copper_horn6", imagebutton_copper_horn6);
		this.addRenderableWidget(imagebutton_copper_horn6);
		imagebutton_copper_horn7 = new ImageButton(this.leftPos + 141, this.topPos + 34, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_copper_horn7.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIButtonMessage(7, x, y, z));
				MultiCraftingTableGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_copper_horn7", imagebutton_copper_horn7);
		this.addRenderableWidget(imagebutton_copper_horn7);
		imagebutton_copper_horn8 = new ImageButton(this.leftPos + 105, this.topPos + 52, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_copper_horn8.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIButtonMessage(8, x, y, z));
				MultiCraftingTableGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_copper_horn8", imagebutton_copper_horn8);
		this.addRenderableWidget(imagebutton_copper_horn8);
		imagebutton_copper_horn9 = new ImageButton(this.leftPos + 123, this.topPos + 52, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_copper_horn9.png"), 16, 32, e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIButtonMessage(9, x, y, z));
				MultiCraftingTableGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_copper_horn9", imagebutton_copper_horn9);
		this.addRenderableWidget(imagebutton_copper_horn9);
		imagebutton_copper_horn_craft_gui_tab = new ImageButton(this.leftPos + 172, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_copper_horn_craft_gui_tab.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_copper_horn_craft_gui_tab", imagebutton_copper_horn_craft_gui_tab);
		this.addRenderableWidget(imagebutton_copper_horn_craft_gui_tab);
		imagebutton_astilba_multicolored_craft_gui_t = new ImageButton(this.leftPos + 172, this.topPos + 34, 16, 16, 0, 0, 16, new ResourceLocation("world_expansion:textures/screens/atlas/imagebutton_astilba_multicolored_craft_gui_t.png"), 16, 32,
				e -> {
					if (true) {
						WorldExpansionMod.PACKET_HANDLER.sendToServer(new MultiCraftingTableGUIButtonMessage(11, x, y, z));
						MultiCraftingTableGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
					}
				});
		guistate.put("button:imagebutton_astilba_multicolored_craft_gui_t", imagebutton_astilba_multicolored_craft_gui_t);
		this.addRenderableWidget(imagebutton_astilba_multicolored_craft_gui_t);
	}
}
