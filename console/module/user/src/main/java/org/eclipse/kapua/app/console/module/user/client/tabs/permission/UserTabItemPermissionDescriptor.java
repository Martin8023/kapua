/*******************************************************************************
 * Copyright (c) 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.app.console.module.user.client.tabs.permission;

import org.eclipse.kapua.app.console.commons.client.views.AbstractTabDescriptor;
import org.eclipse.kapua.app.console.commons.shared.model.GwtSession;
import org.eclipse.kapua.app.console.module.user.client.UserView;
import org.eclipse.kapua.app.console.module.user.shared.model.user.GwtUser;

public class UserTabItemPermissionDescriptor extends AbstractTabDescriptor<GwtUser, UserTabItemPermission, UserView> {

    @Override
    public UserTabItemPermission getTabViewInstance(UserView view, GwtSession currentSession) {
        return new UserTabItemPermission(currentSession);
    }

    @Override
    public String getViewId() {
        return "user.permissions";
    }

    @Override
    public Integer getOrder() {
        return 300;
    }

    @Override
    public Boolean isEnabled(GwtSession currentSession) {
        return true;
    }
}
