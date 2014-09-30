/*
	
	Copyright 2014 Caspar Isemer, Eva Krueger and IDEAL Group Inc.(http://www.ideal-group.org), http://easyaccess.org
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
		http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License. 
 */
package org.easyaccess;

import android.view.View;
import android.view.WindowManager.LayoutParams;

public class LayoutParamsAndViewUtils {

	private LayoutParams layoutParams;
	private View view;

	public LayoutParamsAndViewUtils(LayoutParams layoutParams, View view) {
		this.setLayoutParams(layoutParams);
		this.setView(view);
	}

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}

	public LayoutParams getLayoutParams() {
		return layoutParams;
	}

	public void setLayoutParams(LayoutParams layoutParams) {
		this.layoutParams = layoutParams;
	}

}
