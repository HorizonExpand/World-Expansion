package net.horizonexpand.world_expansion.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.horizonexpand.world_expansion.world.inventory.TheCoordinateTemplateForSnowCannonGUIMenu;
import net.horizonexpand.world_expansion.network.TheCoordinateTemplateForSnowCannonGUIButtonMessage;
import net.horizonexpand.world_expansion.WorldExpansionMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TheCoordinateTemplateForSnowCannonGUIScreen extends AbstractContainerScreen<TheCoordinateTemplateForSnowCannonGUIMenu> {
	private final static HashMap<String, Object> guistate = TheCoordinateTemplateForSnowCannonGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox X;
	EditBox Y;
	EditBox Z;
	Button button_accept;

	public TheCoordinateTemplateForSnowCannonGUIScreen(TheCoordinateTemplateForSnowCannonGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 134;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		X.render(guiGraphics, mouseX, mouseY, partialTicks);
		Y.render(guiGraphics, mouseX, mouseY, partialTicks);
		Z.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("world_expansion:textures/screens/the_coordinate_template_for_snow_cannon_gui_overlay.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 134, 166, 134, 166);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (X.isFocused())
			return X.keyPressed(key, b, c);
		if (Y.isFocused())
			return Y.keyPressed(key, b, c);
		if (Z.isFocused())
			return Z.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		X.tick();
		Y.tick();
		Z.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.label_the_coordinate_template_for_snow"), 8, 7, -1315964, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.label_for_snow_cannon"), 8, 16, -1315964, false);
	}

	@Override
	public void init() {
		super.init();
		X = new EditBox(this.font, this.leftPos + 49, this.topPos + 35, 34, 18, Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.X")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.X").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.X").getString());
				else
					setSuggestion(null);
			}
		};
		X.setSuggestion(Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.X").getString());
		X.setMaxLength(32767);
		guistate.put("text:X", X);
		this.addWidget(this.X);
		Y = new EditBox(this.font, this.leftPos + 49, this.topPos + 68, 34, 18, Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.Y")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.Y").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.Y").getString());
				else
					setSuggestion(null);
			}
		};
		Y.setSuggestion(Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.Y").getString());
		Y.setMaxLength(32767);
		guistate.put("text:Y", Y);
		this.addWidget(this.Y);
		Z = new EditBox(this.font, this.leftPos + 49, this.topPos + 101, 34, 18, Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.Z")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.Z").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.Z").getString());
				else
					setSuggestion(null);
			}
		};
		Z.setSuggestion(Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.Z").getString());
		Z.setMaxLength(32767);
		guistate.put("text:Z", Z);
		this.addWidget(this.Z);
		button_accept = Button.builder(Component.translatable("gui.world_expansion.the_coordinate_template_for_snow_cannon_gui.button_accept"), e -> {
			if (true) {
				WorldExpansionMod.PACKET_HANDLER.sendToServer(new TheCoordinateTemplateForSnowCannonGUIButtonMessage(0, x, y, z));
				TheCoordinateTemplateForSnowCannonGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 39, this.topPos + 133, 54, 20).build();
		guistate.put("button:button_accept", button_accept);
		this.addRenderableWidget(button_accept);
	}
}
