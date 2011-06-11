package org.eclipse.symfony.core.codeassist;

import org.eclipse.php.core.codeassist.ICompletionContext;
import org.eclipse.php.core.codeassist.ICompletionContextResolver;
import org.eclipse.php.internal.core.codeassist.contexts.CompletionContextResolver;
import org.eclipse.symfony.core.codeassist.contexts.AnnotationCompletionContext;
import org.eclipse.symfony.core.codeassist.contexts.ServiceContainerContext;

/**
 * 
 * @author Robert Gruendler <r.gruendler@gmail.com>
 *
 */
@SuppressWarnings("restriction")
public class AnnotationCompletionContextResolver extends CompletionContextResolver 
	implements ICompletionContextResolver {


	@Override
	public ICompletionContext[] createContexts() {
		
		return new ICompletionContext[] { 
				new AnnotationCompletionContext(),
				new ServiceContainerContext()
		};
		
	}

}
