package co.com.koombea.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ApplicationElementsPage {

    public static final Target OPEN_NAVIGATION = Target.the("Open navigation drawer")
            .located(By.className("android.widget.ImageButton"));

    public static final Target LENGTH_NUMBER = Target.the("choose number to convert length")
            .located(By.id("com.ba.universalconverter:id/buttons_row_3"));

    public static final Target LENGTH_RESULT = Target.the("result returned to length")
            .located(By.id("com.ba.universalconverter:id/target_value"));

    public static final Target SELECT_AREA = Target.the("select area option")
            .located(By.id("com.ba.universalconverter:id/buttons_row_1"));

    public static final Target CLEAN_NUMBER = Target.the("select button to clean number")
            .located(By.id("android:id/statusBarBackground"));

    public static final Target AREA_NUMBER = Target.the("choose number to convert area")
            .located(By.id("com.ba.universalconverter:id/buttons_row_2"));


}
