/**
 * generated by Xtext 2.12.0
 */
package com.spirit.xtext.architecture;

import com.spirit.xtext.architecture.TgfiStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class TgfiStandaloneSetup extends TgfiStandaloneSetupGenerated {
  public static void doSetup() {
    new TgfiStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
