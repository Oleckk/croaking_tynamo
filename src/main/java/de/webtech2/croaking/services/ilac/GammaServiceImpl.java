package de.webtech2.croaking.services.ilac;

import de.webtech2.croaking.services.impl.Invoker;

public class GammaServiceImpl implements GammaService {
	public String invokeRequiresPermissionsILACSuccessIfArgumentAllows(
			Object object) {
		return Invoker.invoke(getClass(), object);
	}

	public String invokeRequiresPermissionsILACSuccessWithoutArguments() {
		return Invoker.invoke(getClass());
	}
}