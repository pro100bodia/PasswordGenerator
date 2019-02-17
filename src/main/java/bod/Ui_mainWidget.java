package bod;
/********************************************************************************
 ** Form generated from reading ui file 'layout.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_mainWidget implements com.trolltech.qt.QUiForm<QWidget>
{
    public QGridLayout gridLayout;
    public QFrame mainFrame;
    public QFrame formFrame;
    public QLabel numCharsLabel;
    public QSpinBox charactersNumSpinBox;
    public QLabel addParamsLabel;
    public QPushButton dropDownPushButton;
    public QFrame paramsFrame;
    public QLineEdit SymbolsLineEdit;
    public QCheckBox upperCaseCheckBox;
    public QCheckBox chooseAllCheckBox;
    public QCheckBox numsChecBox;
    public QCheckBox lowerCaseCheckBox;
    public QCheckBox useSymbolsCheckBox;
    public QCheckBox sameCharsCheckBox;
    public QCheckBox sequentialCharsCheckBox;
    public QFrame finalFrame;
    public QPushButton generateButton;
    public QLabel simplePhraseLabel;
    public QLineEdit simplePhraseLineEdit;
    public QLabel passLabel;
    public QLineEdit passLineEdit;
    public QLabel mainTitleLabel;
    public QLabel lozungLabel;

    public Ui_mainWidget() { super(); }

    public void setupUi(QWidget mainWidgetTest)
    {
        mainWidgetTest.setObjectName("mainWidgetTest");
        mainWidgetTest.setWindowIcon(new QIcon("src\\main\\resources\\img\\icon.png"));
        mainWidgetTest.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.ApplicationModal);
        mainWidgetTest.resize(new QSize(1055, 830).expandedTo(mainWidgetTest.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Fixed, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy.setHorizontalStretch((byte)105);
        sizePolicy.setVerticalStretch((byte)84);
        sizePolicy.setHeightForWidth(mainWidgetTest.sizePolicy().hasHeightForWidth());
        mainWidgetTest.setSizePolicy(sizePolicy);
        QFont font = new QFont();
        font.setFamily("Bitter");
        mainWidgetTest.setFont(font);
        mainWidgetTest.setWindowTitle("Password Generator");
        mainWidgetTest.setStyleSheet("color: #d2c608;\n"+
"background: #181714;");
        gridLayout = new QGridLayout(mainWidgetTest);
        gridLayout.setObjectName("gridLayout");
        mainFrame = new QFrame(mainWidgetTest);
        mainFrame.setObjectName("mainFrame");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Fixed, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(mainFrame.sizePolicy().hasHeightForWidth());
        mainFrame.setSizePolicy(sizePolicy1);
        mainFrame.setMinimumSize(new QSize(871, 741));
        mainFrame.setMaximumSize(new QSize(871, 741));
        mainFrame.setStyleSheet("border: none;");
        formFrame = new QFrame(mainFrame);
        formFrame.setObjectName("formFrame");
        formFrame.setEnabled(true);
        formFrame.setGeometry(new QRect(0, 180, 871, 561));
        QFontDatabase.addApplicationFont("src\\main\\resources\\fonts\\roboto\\Roboto-Regular.ttf");
        QFont font1 = new QFont();
        font1.setFamily("Roboto");
        font1.setBold(false);
        font1.setItalic(false);
        font1.setWeight(50);
        formFrame.setFont(font1);
        formFrame.setStyleSheet("font: 24px \"Roboto\"; border: 2px solid #d2c608;\n" +
                                "QSpinBox{background: red;}");
        formFrame.setLineWidth(2);
        numCharsLabel = new QLabel(formFrame);
        numCharsLabel.setObjectName("numCharsLabel");
        numCharsLabel.setGeometry(new QRect(20, 20, 241, 21));
        QFont font2 = new QFont();
        font2.setFamily("Roboto");
        font2.setBold(false);
        font2.setItalic(false);
        font2.setWeight(50);
        numCharsLabel.setFont(font2);
        numCharsLabel.setStyleSheet("border: none;");
        charactersNumSpinBox = new QSpinBox(formFrame);
        charactersNumSpinBox.setObjectName("charactersNumSpinBox");
        charactersNumSpinBox.setGeometry(new QRect(270, 20, 50, 22));
        QFont font3 = new QFont();
        font3.setFamily("Roboto");
        font3.setBold(false);
        font3.setItalic(false);
        font3.setWeight(50);
        charactersNumSpinBox.setFont(font3);
        charactersNumSpinBox.setStyleSheet("border: none;\n"+
"border-bottom: 2px solid yellow;\n"+
"\n");
        charactersNumSpinBox.setWrapping(false);
        charactersNumSpinBox.setFrame(false);
        charactersNumSpinBox.setMinimum(6);
        charactersNumSpinBox.setMaximum(20);
        addParamsLabel = new QLabel(formFrame);
        addParamsLabel.setObjectName("addParamsLabel");
        addParamsLabel.setGeometry(new QRect(20, 50, 251, 41));
        QFont font4 = new QFont();
        font4.setFamily("Roboto");
        font4.setBold(false);
        font4.setItalic(false);
        font4.setWeight(50);
        addParamsLabel.setFont(font4);
        addParamsLabel.setStyleSheet("border: none;");
        dropDownPushButton = new QPushButton(formFrame);
        dropDownPushButton.setObjectName("dropDownPushButton");
        dropDownPushButton.setGeometry(new QRect(260, 60, 93, 28));
        dropDownPushButton.setStyleSheet("background-image: url(:/img/drop-down-arrow.png);\n"+
"border: none;\n"+
"");
        paramsFrame = new QFrame(formFrame);
        paramsFrame.setObjectName("paramsFrame");
        paramsFrame.setGeometry(new QRect(10, 90, 831, 321));
        paramsFrame.setStyleSheet("border: none;");
        paramsFrame.setLineWidth(2);
        SymbolsLineEdit = new QLineEdit(paramsFrame);
        SymbolsLineEdit.setObjectName("SymbolsLineEdit");
        SymbolsLineEdit.setGeometry(new QRect(190, 170, 351, 36));
        SymbolsLineEdit.setStyleSheet("border-bottom: 2px solid yellow;");
        SymbolsLineEdit.setFrame(false);
        upperCaseCheckBox = new QCheckBox(paramsFrame);
        upperCaseCheckBox.setObjectName("upperCaseCheckBox");
        upperCaseCheckBox.setGeometry(new QRect(11, 132, 141, 33));
        upperCaseCheckBox.setChecked(true);
        chooseAllCheckBox = new QCheckBox(paramsFrame);
        chooseAllCheckBox.setObjectName("chooseAllCheckBox");
        chooseAllCheckBox.setGeometry(new QRect(11, 12, 138, 33));
        QFont font5 = new QFont();
        font5.setFamily("Roboto");
        font5.setBold(false);
        font5.setItalic(false);
        font5.setWeight(50);
        chooseAllCheckBox.setFont(font5);
        chooseAllCheckBox.setStyleSheet("border: none;\n"+
"chooseAllCheckBox::indicator{	\n"+
"	border: none;	\n"+
"}");
        chooseAllCheckBox.setIconSize(new QSize(40, 40));
        chooseAllCheckBox.setChecked(true);
        chooseAllCheckBox.setTristate(false);
        numsChecBox = new QCheckBox(paramsFrame);
        numsChecBox.setObjectName("numsChecBox");
        numsChecBox.setGeometry(new QRect(11, 52, 196, 33));
        numsChecBox.setChecked(true);
        lowerCaseCheckBox = new QCheckBox(paramsFrame);
        lowerCaseCheckBox.setObjectName("lowerCaseCheckBox");
        lowerCaseCheckBox.setGeometry(new QRect(11, 92, 225, 33));
        lowerCaseCheckBox.setChecked(true);
        useSymbolsCheckBox = new QCheckBox(paramsFrame);
        useSymbolsCheckBox.setObjectName("useSymbolsCheckBox");
        useSymbolsCheckBox.setGeometry(new QRect(11, 172, 165, 33));
        useSymbolsCheckBox.setChecked(true);
        sameCharsCheckBox = new QCheckBox(paramsFrame);
        sameCharsCheckBox.setObjectName("sameCharsCheckBox");
        sameCharsCheckBox.setGeometry(new QRect(11, 212, 523, 33));
        sameCharsCheckBox.setChecked(true);
        sequentialCharsCheckBox = new QCheckBox(paramsFrame);
        sequentialCharsCheckBox.setObjectName("sequentialCharsCheckBox");
        sequentialCharsCheckBox.setGeometry(new QRect(11, 252, 517, 33));
        sequentialCharsCheckBox.setChecked(true);
        finalFrame = new QFrame(formFrame);
        finalFrame.setObjectName("finalFrame");
        finalFrame.setGeometry(new QRect(20, 420, 831, 121));
        finalFrame.setStyleSheet("border: none;");
        finalFrame.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        finalFrame.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        generateButton = new QPushButton(finalFrame);
        generateButton.setObjectName("generateButton");
        generateButton.setGeometry(new QRect(360, 0, 171, 28));
        generateButton.setStyleSheet("background: #d2c608;\n"+
"color: #181714;\n"+
"border: none;\n"+
"");
        generateButton.setDefault(false);
        generateButton.setFlat(false);
        simplePhraseLabel = new QLabel(finalFrame);
        simplePhraseLabel.setObjectName("simplePhraseLabel");
        simplePhraseLabel.setGeometry(new QRect(2, 74, 292, 32));
        simplePhraseLabel.setStyleSheet("border: none;\n"+
"");
        simplePhraseLineEdit = new QLineEdit(finalFrame);
        simplePhraseLineEdit.setObjectName("simplePhraseLineEdit");
        simplePhraseLineEdit.setGeometry(new QRect(294, 74, 531, 36));
        QSizePolicy sizePolicy2 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Fixed, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy2.setHorizontalStretch((byte)0);
        sizePolicy2.setVerticalStretch((byte)0);
        sizePolicy2.setHeightForWidth(simplePhraseLineEdit.sizePolicy().hasHeightForWidth());
        simplePhraseLineEdit.setSizePolicy(sizePolicy2);
        simplePhraseLineEdit.setStyleSheet("border: none;\n"+
"border-bottom: 2px solid yellow;");
        simplePhraseLineEdit.setFrame(false);
        simplePhraseLineEdit.setReadOnly(true);
        passLabel = new QLabel(finalFrame);
        passLabel.setObjectName("passLabel");
        passLabel.setGeometry(new QRect(2, 32, 194, 32));
        passLabel.setStyleSheet("border: none;");
        passLineEdit = new QLineEdit(finalFrame);
        passLineEdit.setObjectName("passLineEdit");
        passLineEdit.setGeometry(new QRect(210, 30, 291, 36));
        passLineEdit.setStyleSheet("border: none;\n"+
"border-bottom: 2px solid yellow;");
        passLineEdit.setFrame(false);
        passLineEdit.setReadOnly(true);
        mainTitleLabel = new QLabel(mainFrame);
        mainTitleLabel.setObjectName("mainTitleLabel");
        mainTitleLabel.setEnabled(true);
        mainTitleLabel.setGeometry(new QRect(1, 11, 862, 120));
        QSizePolicy sizePolicy3 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Fixed, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy3.setHorizontalStretch((byte)0);
        sizePolicy3.setVerticalStretch((byte)0);
        sizePolicy3.setHeightForWidth(mainTitleLabel.sizePolicy().hasHeightForWidth());
        mainTitleLabel.setSizePolicy(sizePolicy3);
        mainTitleLabel.setMinimumSize(new QSize(0, 120));
        QFontDatabase.addApplicationFont("src\\main\\resources\\fonts\\bitter\\Bitter-Bold.otf");
        QFont font6 = new QFont();
        font6.setFamily("Bitter");
        font6.setPointSize(48);
        font6.setBold(true);
        font6.setWeight(75);
        mainTitleLabel.setFont(font6);
        mainTitleLabel.setStyleSheet("border-bottom: 2px solid #dbe9de;\n"+
"padding-bottom: 8px;");
        lozungLabel = new QLabel(mainFrame);
        lozungLabel.setObjectName("lozungLabel");
        lozungLabel.setEnabled(true);
        lozungLabel.setGeometry(new QRect(1, 131, 871, 36));
        QSizePolicy sizePolicy4 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy4.setHorizontalStretch((byte)0);
        sizePolicy4.setVerticalStretch((byte)0);
        sizePolicy4.setHeightForWidth(lozungLabel.sizePolicy().hasHeightForWidth());
        lozungLabel.setSizePolicy(sizePolicy4);
        lozungLabel.setStyleSheet("font-size: 30px;\n"+
"color: #dbe9de;\n"+
"text-align: center;\n"+
"width: 100%;\n"+
"");
        lozungLabel.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));

        gridLayout.addWidget(mainFrame, 0, 0, 1, 1);
        retranslateUi(mainWidgetTest);

        mainWidgetTest.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget mainWidgetTest)
    {
        numCharsLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "Number of characters", null));
        addParamsLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "Additional parameters", null));
        dropDownPushButton.setText("");
        SymbolsLineEdit.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "`~!@#$%^&*()_+=-\\/|{}[]:;\"'<>,.?", null));
        upperCaseCheckBox.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "Uppercase", null));
        chooseAllCheckBox.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "Choose all", null));
        numsChecBox.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "Numbers(1234)", null));
        lowerCaseCheckBox.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "Lowercase(abcde)", null));
        useSymbolsCheckBox.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "Use symbols", null));
        sameCharsCheckBox.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "Don`t use the same character more than ones", null));
        sequentialCharsCheckBox.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "Don't use sequential characters, e.g. abc, 789", null));
        generateButton.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "GENERATE", null));
        simplePhraseLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "Simple phrase to remeber :", null));
        simplePhraseLineEdit.setText("");
        passLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "Your password is:", null));
        passLineEdit.setText("");
        mainTitleLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "Password generator", null));
        lozungLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("mainWidgetTest", "generate your strong password", null));
    } // retranslateUi

}

