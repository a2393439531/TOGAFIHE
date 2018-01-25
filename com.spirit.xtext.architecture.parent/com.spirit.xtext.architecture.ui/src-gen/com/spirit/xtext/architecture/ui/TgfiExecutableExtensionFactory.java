/*
 * generated by Xtext 2.12.0
 */
package com.spirit.xtext.architecture.ui;

import com.google.inject.Injector;
import com.spirit.xtext.architecture.ui.internal.ArchitectureActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TgfiExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ArchitectureActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ArchitectureActivator.getInstance().getInjector(ArchitectureActivator.COM_SPIRIT_XTEXT_ARCHITECTURE_TGFI);
	}
	
}
