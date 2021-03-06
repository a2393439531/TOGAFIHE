/*
 * generated by Xtext 2.12.0
 */
package com.spirit.xtext.architecture.ide

import com.google.inject.Guice
import com.spirit.xtext.architecture.TgfiRuntimeModule
import com.spirit.xtext.architecture.TgfiStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class TgfiIdeSetup extends TgfiStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new TgfiRuntimeModule, new TgfiIdeModule))
	}
	
}
