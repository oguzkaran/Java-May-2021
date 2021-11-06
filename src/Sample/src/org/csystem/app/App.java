/*----------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.application.company.*;

class App {
	public static void main(String [] args)
	{
		HumanResources humanResources = new HumanResources();
		Manager m = new Manager();
		Worker w = new Worker();
		SalesManager sm = new SalesManager();
		ProjectWorker pw = new ProjectWorker();

		//...

		humanResources.payInsurance(m);
		humanResources.payInsurance(w);
		humanResources.payInsurance(sm);
		humanResources.payInsurance(pw);
	}
}
