/*
* generated by Xtext
*/
package aom.scripting.xs;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class XSUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return aom.scripting.xs.ui.internal.XSActivator.getInstance().getInjector("aom.scripting.xs.XS");
	}
	
}