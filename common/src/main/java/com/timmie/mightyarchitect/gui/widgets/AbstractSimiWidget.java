package com.timmie.mightyarchitect.gui.widgets;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.network.chat.Component;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractSimiWidget extends AbstractWidget {

	protected List<Component> toolTip;
	
	public AbstractSimiWidget(int xIn, int yIn, int widthIn, int heightIn) {
		super(xIn, yIn, widthIn, heightIn, Component.empty());
		toolTip = new LinkedList<>();
	}
	
	public List<Component> getToolTip() {
		return toolTip;
	}
	
	@Override
	public void renderButton(PoseStack matrixStack, int p_renderButton_1_, int p_renderButton_2_, float p_renderButton_3_) {
	}
}
