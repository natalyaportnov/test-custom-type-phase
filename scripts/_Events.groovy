import org.codehaus.groovy.grails.test.junit4.JUnit4GrailsTestType

// 1. add the name of your phase to this variable with this event handler
eventAllTestsStart = {
	        phasesToRun << "custom"
}

// 2. Create a custom test type
    def testTypeName = "custom"
	    def testDirectory = "custom"
		    def customTestType = new JUnit4GrailsTestType(testTypeName, testDirectory)

	// 3. Create a «phase name»Tests variable containing a list of test types (more on this later)
	// You could use String like this:: customTests = ["custom"]
	customTests = [customTestType]

	// 4. Create pre and post closures
	customTestPhasePreparation = {
		    // called at the start of the phase
		    unitTestPhasePreparation()
	}
customTestPhaseCleanUp = {
	    // called at the end of the phase
	    unitTestPhaseCleanUp()
}

