package bod;

import bod.algorithmic.Calculate;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QWidget;

public class Entire extends QWidget {
    public VisualEffects ve = new VisualEffects();

    public Entire(){
        Globals.ui.setupUi(this);

        ve.hideShowAddParams();
        Globals.ui.dropDownPushButton.clicked.connect(ve, "hideShowAddParams()");
        Globals.ui.chooseAllCheckBox.stateChanged.connect(ve, "checkEverything()");

        Calculate mathPart = new Calculate();
        Globals.ui.generateButton.clicked.connect(mathPart, "calculation()");
        show();
    }

    public static void main(String[] args) {
        QApplication.initialize(args);

        new Entire();

        QApplication.exec();
    }
}
