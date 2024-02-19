package com.projectmanager;

import com.pages.FrontPage_POM;


public class ProjectManager {

	private FrontPage_POM frontpage;
	public FrontPage_POM getFrontPage() {
		if(frontpage == null)
			return frontpage = new FrontPage_POM();
		else 
			return frontpage;
		
		System.out.println("Hello");


	}



}

