package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/resources/FEATURES/backPACKS.feature",
				    "src/test/resources/FEATURES/Boots.feature",
				    "src/test/resources/FEATURES/duffleBAGandSTROLLEYS.feature",
				    "src/test/resources/FEATURES/footwareCOMBOS.feature",
				    "src/test/resources/FEATURES/formalSHOES.feature",
				    "src/test/resources/FEATURES/handbagANDclutches.feature",
				    "src/test/resources/FEATURES/mensFOOTWARE.feature",
				    "src/test/resources/FEATURES/sandelANDslippers.feature",
				    "src/test/resources/FEATURES/sportsSHOES.feature",
				    "src/test/resources/FEATURES/travelANDutilityBAGS.feature",
				    "src/test/resources/FEATURES/womenFASHIONbag.feature",
				    "src/test/resources/FEATURES/womenFOOTWARE.feature",
				    "src/test/resources/FEATURES/womenSANDELS.feature"},
		glue = "steps")
		
		

public class runner extends AbstractTestNGCucumberTests {

	
	
}
