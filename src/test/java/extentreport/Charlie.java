package extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Charlie {
	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter report = new ExtentSparkReporter(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\Charlie.html");
		extent.attachReporter(report);

		// Modifying the Text in the Report//
		ExtentTest Test_1 = extent.createTest("Test_1");
		Test_1.log(Status.PASS, "<I><B>The TestCase is Passed<B><I>");

		// Adding Xml type of Data
		String value1 = "<dependencies>\r\n"
				+ "		<!-- https://mvnrepository.com/artifact/org.testng/testng -->\r\n" + "		<dependency>\r\n"
				+ "			<groupId>org.testng</groupId>\r\n" + "			<artifactId>testng</artifactId>\r\n"
				+ "			<version>7.8.0</version>\r\n" + "			<scope>test</scope>\r\n"
				+ "		</dependency>\r\n" + "\r\n" + "		<!--\r\n"
				+ "		https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->\r\n"
				+ "		<!--\r\n"
				+ "		https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->\r\n"
				+ "		<dependency>\r\n" + "			<groupId>org.seleniumhq.selenium</groupId>\r\n"
				+ "			<artifactId>selenium-java</artifactId>\r\n" + "			<version>4.12.0</version>\r\n"
				+ "		</dependency>\r\n" + "\r\n" + "\r\n"
				+ "		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->\r\n" + "		<dependency>\r\n"
				+ "			<groupId>org.apache.poi</groupId>\r\n" + "			<artifactId>poi</artifactId>\r\n"
				+ "			<version>5.2.3</version>\r\n" + "		</dependency>\r\n"
				+ "		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->\r\n"
				+ "		<dependency>\r\n" + "			<groupId>org.apache.poi</groupId>\r\n"
				+ "			<artifactId>poi-ooxml</artifactId>\r\n" + "			<version>5.2.3</version>\r\n"
				+ "		</dependency>\r\n" + "\r\n"
				+ "		<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->\r\n"
				+ "		<dependency>\r\n" + "			<groupId>com.aventstack</groupId>\r\n"
				+ "			<artifactId>extentreports</artifactId>\r\n" + "			<version>5.1.0</version>\r\n"
				+ "		</dependency>\r\n" + "";

		extent.createTest("Test_2").pass(MarkupHelper.createCodeBlock(value1, CodeLanguage.XML));

		String value2 = "{\r\n" + "    \"glossary\": {\r\n" + "        \"title\": \"example glossary\",\r\n"
				+ "		\"GlossDiv\": {\r\n" + "            \"title\": \"S\",\r\n" + "			\"GlossList\": {\r\n"
				+ "                \"GlossEntry\": {\r\n" + "                    \"ID\": \"SGML\",\r\n"
				+ "					\"SortAs\": \"SGML\",\r\n"
				+ "					\"GlossTerm\": \"Standard Generalized Markup Language\",\r\n"
				+ "					\"Acronym\": \"SGML\",\r\n" + "					\"Abbrev\": \"ISO 8879:1986\",\r\n"
				+ "					\"GlossDef\": {\r\n"
				+ "                        \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\r\n"
				+ "						\"GlossSeeAlso\": [\"GML\", \"XML\"]\r\n" + "                    },\r\n"
				+ "					\"GlossSee\": \"markup\"\r\n" + "                }\r\n" + "            }\r\n"
				+ "        }\r\n" + "    }\r\n" + "}";

		ExtentTest Test_3 = extent.createTest("Test_3");
		Test_3.pass(MarkupHelper.createCodeBlock(value2, CodeLanguage.JSON));

		// Highlighing
		extent.createTest("Test_4").pass(MarkupHelper.createLabel("The text is modified", ExtentColor.INDIGO));
		
		
		//Exception
		try {
		int i=5/0;
		}catch(Exception e) {
			extent.createTest("Test_5").pass(e);
		}
		
		
		
		
		
		extent.flush();
	}
}
