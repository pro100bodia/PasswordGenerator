package bod.algorithmic;

import static bod.Globals.*;

import java.util.*;

public class Calculate {
    public void calculation(){
        //alphabet filling
        List<CharGroup> alphabet = new ArrayList<>();
        byte val = 0;
        byte charsNum = (byte)ui.charactersNumSpinBox.value();
        

        byte groupsChecked = 0;
        //map to store charGroupId, requiredNum pairs
        Map<Byte, Byte> cryteria = new TreeMap<>();

        if(ui.numsChecBox.isChecked()){
            cryteria.put((byte)0, (byte)0);
            groupsChecked++;
        }
        if(ui.lowerCaseCheckBox.isChecked()){
            cryteria.put((byte)1, (byte)0);
            groupsChecked++;
        }
        if(ui.upperCaseCheckBox.isChecked()) {
            cryteria.put((byte)2, (byte)0);
            groupsChecked++;
        }
        if(ui.useSymbolsCheckBox.isChecked()) {
            cryteria.put((byte)3, (byte)0);
            groupsChecked++;
        }
        

        //distribute charSum
        for(byte i: cryteria.keySet())
        {
            cryteria.replace(i, (byte)(charsNum / groupsChecked));
        }

        //distribute the modulo
        for(byte i = 0; i < charsNum % groupsChecked; i++)
        {
            byte key = (byte)getRandomInt(0, cryteria.size() - 1);
            val = cryteria.get(key);
            cryteria.replace(key, ++val);
        }
        

        //generate collections
        byte genGroupPower = 0;
        CharGroup cg;
        for(byte i: cryteria.keySet())
        {
            val = cryteria.get(i);
            switch(i)
            {
                case 0:
                    cg = new NumCharGroup(val);
                    alphabet.add(cg);
                    genGroupPower += cg.groupPower;
                    break;
                case 1:
                case 2:
                    cg = new WordsCharGroup(val);
                    alphabet.add(cg);
                    genGroupPower += cg.groupPower;
                    break;
                case 3:
                    cg = new SymbCharGroup(val);
                    alphabet.add(cg);
                    genGroupPower += cg.groupPower;
                    break;
            }
        }
        //end alphabet filling
        
        

        //phrase generation
        String phrase = "";
        String phraseElem;
        String password = "";

        boolean pop =
                ui.sameCharsCheckBox.isChecked() &&
                        charsNum < genGroupPower;
        

        boolean notSequential = ui.sequentialCharsCheckBox.isChecked();
        

        int iteration = 0;
        for(CharGroup i: alphabet)//cryteria num
        {
            for(int j = 0; j < i.requiredNum; j++)//required num of each group
            {
                phraseElem = i.getElem(pop, notSequential);
                
                if(iteration == 2){
                    String newPhrase = phraseElem.toUpperCase(Locale.ROOT);
                    phrase += newPhrase + " ";
                    password += newPhrase.charAt(0);
                }else {
                    phrase += phraseElem + " ";
                    password += phraseElem.charAt(0);
                }

            }
            iteration++;
        }

        ui.simplePhraseLineEdit.setText(phrase);
        //end phrase generation

        //output the password
        ui.passLineEdit.setText(password);
    }
}
