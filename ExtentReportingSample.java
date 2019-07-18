import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ExtentTest;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ExtentReportingSample {
    static ExtentReports reports;
    static ExtentTest logger;

    public static void main(String[] args) {
        String fileName = new SimpleDateFormat("'SampleDemo('yyyyMMddHHmm'.html'").format(new Date());
        String path = "C:\\Users\\kamal\\Desktop\\ExtentReport\\"+fileName;
        reports = new ExtentReports(path);
        logger = reports.startTest("Login page Test case results");
        logger.log(LogStatus.INFO, "Enter username successfully");
        logger.log(LogStatus.INFO, "Enter password successfully");
        logger.log(LogStatus.INFO, "Enter login successfully");
        logger.log(LogStatus.PASS, "Login Page Testcase Passed Successfully");
        reports.endTest(logger);
        reports.flush();

    }
}
