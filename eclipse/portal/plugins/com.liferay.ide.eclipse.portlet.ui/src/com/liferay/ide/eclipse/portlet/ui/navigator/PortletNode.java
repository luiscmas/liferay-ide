/*******************************************************************************
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * Contributors:
 * 		Kamesh Sampath - initial implementation
 * 		Gregory Amerson - initial implementation review and ongoing maintenance
 *******************************************************************************/

package com.liferay.ide.eclipse.portlet.ui.navigator;

import com.liferay.ide.eclipse.portlet.core.model.IPortlet;

import org.eclipse.sapphire.modeling.CapitalizationType;
import org.eclipse.sapphire.modeling.IModelElement;
import org.eclipse.sapphire.modeling.Value;

/**
 * @author <a href="mailto:kamesh.sampath@hotmail.com">Kamesh Sampath</a>
 * @author Gregory Amerson
 */
public class PortletNode
{

    final private PortletsNode parent;
    final private IPortlet portlet;

    public PortletNode( PortletsNode portletsNode, IPortlet portlet )
    {
        this.parent = portletsNode;
        this.portlet = portlet;
    }

    public PortletsNode getParent()
    {
        return this.parent;
    }

    public String getName()
    {
        String retval = "";

        if( this.portlet != null )
        {
            final Value<String> label = this.portlet.getPortletName();

            retval = label.getLocalizedText( CapitalizationType.TITLE_STYLE, false );
        }

        return retval;
    }

    public IModelElement getModel()
    {
        return this.portlet;
    }

}
