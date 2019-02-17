package bod.algorithmic;

import bod.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SymbCharGroup<T> extends CharGroup<T> {
    protected void generate() {
        String SymbFieldVal = Globals.ui.SymbolsLineEdit.text();
        this.groupPower = SymbFieldVal.length();
        String[] chars = SymbFieldVal.split("");
        this.subAlphabet = new LinkedList<String>(Arrays.asList(chars));
        Collections.sort(this.subAlphabet);
        this.reservedAlphabet = new LinkedList<String>();
    }

    public SymbCharGroup(int requiredNum){
        super(requiredNum);
    }


}
