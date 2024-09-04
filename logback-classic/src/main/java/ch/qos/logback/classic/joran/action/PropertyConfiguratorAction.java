/*
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2024, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.model.PropertyConfiguratorModel;
import ch.qos.logback.core.joran.action.ResourceAction;
import ch.qos.logback.core.model.IncludeModel;

/**
 * Build an {@link PropertyConfiguratorModel} instance from SAX events.
 *
 * @author Ceki G&uuml;lc&uuml;
 * @since 1.5.8
 */
public class PropertyConfiguratorAction extends ResourceAction {

    protected PropertyConfiguratorModel makeNewResourceModel() {
        return new PropertyConfiguratorModel();
    }

}