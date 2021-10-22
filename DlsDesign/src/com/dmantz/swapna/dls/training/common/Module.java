package com.dmantz.swapna.dls.training.common;

import java.util.ArrayList;


public class Module{
	    
	    private int moduleId;
	    private String moduleName;
		private ArrayList<Topic> topics;
		
		public int getModuleId() {
			return moduleId;
		}
		public void setModuleId(int moduleId) {
			this.moduleId = moduleId;
		}
		public String getModuleName() {
			return moduleName;
		}
		public void setModuleName(String moduleName) {
			this.moduleName = moduleName;
		}
		
		
		
}
