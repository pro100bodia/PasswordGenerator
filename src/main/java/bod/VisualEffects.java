package bod;

import com.trolltech.qt.core.QRect;
import com.trolltech.qt.gui.QIcon;
import static bod.Globals.isOpened;
import static bod.Globals.ui;


public class VisualEffects{
    public void validateUI(){
        ui.dropDownPushButton.setIcon(new QIcon("src\\main\\resources\\img\\drop-down-arrow-down.png"));

        //ui.paramsFrame.setGeometry(10, 90, 831, 0);//set height to 0
        //ui.generateButton.setGeometry(360, 116, 171, 28);
    }

    //hide/show additional parameters
    public void hideShowAddParams(){
        //rotate an arrow
        isOpened *= -1;
        String arrowDirection;
        arrowDirection = (isOpened < 0) ?  "src\\main\\resources\\img\\drop-down-arrow-down.png" : "src\\main\\resources\\img\\drop-down-arrow-up.png";
        ui.dropDownPushButton.setIcon(new QIcon(arrowDirection));

        //increase/decrease paramsFrame height

        int paramsFrameHeight = (isOpened < 0) ? 0 : 321;
        int formFrameHeight = (isOpened < 0) ? 250 : 561;
        int finalFrameTop = (isOpened < 0) ? 119 : 420;

        ui.paramsFrame.setGeometry(new QRect(10, 90, 831, paramsFrameHeight));
        ui.formFrame.setGeometry(new QRect(0, 180, 871, formFrameHeight));
        ui.finalFrame.setGeometry(new QRect(20, finalFrameTop, 831, 113));

    }

    public void checkEverything(){
        boolean checkState = (ui.chooseAllCheckBox.isChecked()) ? true : false;

        ui.numsChecBox.setChecked(checkState);
        ui.lowerCaseCheckBox.setChecked(checkState);
        ui.upperCaseCheckBox.setChecked(checkState);
        ui.useSymbolsCheckBox.setChecked(checkState);
        ui.sameCharsCheckBox.setChecked(checkState);
        ui.sequentialCharsCheckBox.setChecked(checkState);
    }
}
