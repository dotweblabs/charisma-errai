/**
 * 	
 * Copyright 2013 Pagecrumb
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *  
 */
package com.pagecrumb.charismaerrai.client.local;

import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.inject.Inject;
/**
 * @author kerymart
 * @version 0.0.1
 * @since 0.0.1
 */
@Templated
public class TrayBar extends Composite {
	
	  @Inject @DataField Anchor home;
	  @Inject @DataField Anchor ui;
	  @Inject @DataField Anchor forms;
	  
	  @Inject TransitionTo<WelcomePage> homeTab;
	  @Inject TransitionTo<UiPage> uiTab;
	  @Inject TransitionTo<FormsPage> formsTab;
	  

	  @EventHandler("home")
	  public void onHomeButtonClick(ClickEvent e) {  
	    homeTab.go(); 
	  }	  
	  
	  @EventHandler("ui")
	  public void onUiButtonClick(ClickEvent e) {  
	    uiTab.go(); 
	  }	  	  

	  @EventHandler("forms")
	  public void onFormsButtonClick(ClickEvent e) {  
	    formsTab.go(); 
	  }	 
	  
}
