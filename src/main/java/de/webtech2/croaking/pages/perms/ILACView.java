package de.webtech2.croaking.pages.perms;

import org.apache.shiro.authz.annotation.RequiresPermissions;

import de.webtech2.croaking.pages.AccessiblePage;

@RequiresPermissions("ilac:view")
public class ILACView extends AccessiblePage {

}
