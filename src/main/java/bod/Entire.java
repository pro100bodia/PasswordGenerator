package bod;

import bod.algorithmic.Calculate;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QWidget;
import static bod.Globals.ui;

public class Entire extends QWidget {
    public VisualEffects ve = new VisualEffects();
    //TODO one more try to style spin buttons and checkboxes
    //TODO convert to exe

    public Entire(){
        ui.setupUi(this);
        //this.setStyleSheet("src\\main\\resources\\styles\\main.qss");
        ve.hideShowAddParams();
        ui.dropDownPushButton.clicked.connect(ve, "hideShowAddParams()");
        ui.chooseAllCheckBox.stateChanged.connect(ve, "checkEverything()");

        Calculate mathPart = new Calculate();
        ui.generateButton.clicked.connect(mathPart, "calculation()");
        show();
    }

    public static void main(String[] args) {
        QApplication.initialize(args);

        new Entire();

        QApplication.exec();
    }
}
