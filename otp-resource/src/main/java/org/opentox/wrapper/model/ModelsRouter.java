package org.opentox.wrapper.model;

import net.idea.restnet.c.routers.MyRouter;

import org.restlet.Context;


public class ModelsRouter extends MyRouter {
	public ModelsRouter(Context context) {
		super(context);
		attachDefault(ModelResource.class);
		attach(String.format("/{%s}",ModelResource.resourceKey), ModelResource.class);
		attach(String.format("/{%s}/predicted", ModelResource.resourceKey), ModelFeaturesResource.class);
	}
}
