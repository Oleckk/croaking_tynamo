package de.webtech2.croaking.pages.perms;

import org.apache.shiro.authz.annotation.RequiresPermissions;

import de.webtech2.croaking.pages.AccessiblePage;

@RequiresPermissions("ilac:edit")
public class ILACEdit extends AccessiblePage {

}
