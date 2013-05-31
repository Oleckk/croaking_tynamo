package de.webtech2.croaking.pages.annotated;

import org.apache.shiro.authz.annotation.RequiresRoles;

import de.webtech2.croaking.pages.AccessiblePage;

@RequiresRoles("user")
public class Index extends AccessiblePage {

}
