package io.bootique.help;

public class Driver {
	public void runall() {
		io.bootique.help.DefaultHelpGeneratorTest class1 = new io.bootique.help.DefaultHelpGeneratorTest();
		class1.testGenerate_Name();
		class1.testGenerate_Name_Description();
		class1.testGenerate_Name_Options();
		class1.testGenerate_Name_ShortOptions();
		class1.testGenerate_Name_Options_ShortNameConflict();
		class1.testGenerate_Name_Options_ShortAliases();
		class1.testGenerate_Name_Command_ShortAliases();
		class1.testGenerate_TrimSpace();
		class1.testGenerate_LineFolding();
		class1.testGenerate_LineFolding_VeryLongWord();
		class1.testGenerate_LineFolding_BigDisplay();
		class1.testGenerate_EnvironmentSection();
		io.bootique.help.ConsoleAppenderTest class2 = new io.bootique.help.ConsoleAppenderTest();
		class2.testConstructorMinWidth();
		class2.testPrintln();
		class2.testPrintln_Offset();
		class2.testPrintln_Long();
		class2.testFoldPrintln();
		class2.testFoldPrintln_Long();
		class2.testFoldPrintln_Long_NoSpace();
		class2.testFoldPrintln_OffsetInt();
		class2.testFoldPrintln_OffsetString();
		class2.testFoldPrintln_FullLine();
	}
}