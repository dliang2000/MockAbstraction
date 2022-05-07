package io.bootique.help;

public class Driver {
	public void runall() {
		io.bootique.help.ConsoleAppenderTest class1 = new io.bootique.help.ConsoleAppenderTest();
		class1.testConstructorMinWidth();
		class1.testPrintln();
		class1.testPrintln_Offset();
		class1.testPrintln_Long();
		class1.testFoldPrintln();
		class1.testFoldPrintln_Long();
		class1.testFoldPrintln_Long_NoSpace();
		class1.testFoldPrintln_OffsetInt();
		class1.testFoldPrintln_OffsetString();
		class1.testFoldPrintln_FullLine();
		io.bootique.help.DefaultHelpGeneratorTest class2 = new io.bootique.help.DefaultHelpGeneratorTest();
		class2.testGenerate_Name();
		class2.testGenerate_Name_Description();
		class2.testGenerate_Name_Options();
		class2.testGenerate_Name_ShortOptions();
		class2.testGenerate_Name_Options_ShortNameConflict();
		class2.testGenerate_Name_Options_ShortAliases();
		class2.testGenerate_Name_Command_ShortAliases();
		class2.testGenerate_TrimSpace();
		class2.testGenerate_LineFolding();
		class2.testGenerate_LineFolding_VeryLongWord();
		class2.testGenerate_LineFolding_BigDisplay();
		class2.testGenerate_EnvironmentSection();
	}
}