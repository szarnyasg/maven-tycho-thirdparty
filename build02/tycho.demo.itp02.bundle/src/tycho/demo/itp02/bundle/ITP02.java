/*******************************************************************************
 * Copyright (c) 2008, 2011 Sonatype Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sonatype Inc. - initial API and implementation
 *******************************************************************************/
package tycho.demo.itp02.bundle;

import org.codehaus.plexus.util.StringUtils;

public class ITP02 {

	public static void main(String[] args) {
		System.out.println(StringUtils.abbreviate("hello", 4));
	}
	
}
