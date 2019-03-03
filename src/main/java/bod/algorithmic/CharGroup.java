package bod.algorithmic;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import bod.Globals;

public abstract class CharGroup<T>{
    protected int groupPower, requiredNum;
    List subAlphabet;
    List reservedAlphabet;

    abstract void generate();

    CharGroup(int requiredNum){
        this.requiredNum = requiredNum;

        generate();
    }

    void restoreSubalphabet(){
        this.groupPower = this.reservedAlphabet.size();

        this.subAlphabet = new LinkedList<T>( this.reservedAlphabet.subList(0, this.reservedAlphabet.size()) );
        Collections.sort(this.subAlphabet);
        this.reservedAlphabet.clear();
    }

    public List getSubAlphabet(){
        return this.subAlphabet;
    }

    public String getElem(boolean pop, boolean notSequential){
        if(this.groupPower == 0)
            this.restoreSubalphabet();

        int key = Globals.getRandomInt(0, this.groupPower - 1);

        String val = this.subAlphabet.get(key).toString();

        //delete neighbouring elements
        if(notSequential){
            try{
                //pop left
                this.reservedAlphabet.add( this.subAlphabet.remove(key - 1) );
                this.groupPower--;

                //pop right
                this.reservedAlphabet.add( this.subAlphabet.remove(key) );
                key--;//to pop got element
                this.groupPower--;
            }catch (IndexOutOfBoundsException e){
                if(key == 0){
                    if(this.groupPower == 1){
                        this.reservedAlphabet.add( this.subAlphabet.remove(key) );
                        this.groupPower--;
                    }else {
                        this.reservedAlphabet.add(this.subAlphabet.remove(key + 1));
                        this.groupPower--;
                    }
                }else{
                    key--;
                }
            }
        }

        //delete existed element
        if(pop){
            try {
                this.subAlphabet.remove(key);
                this.groupPower--;
            }catch (IndexOutOfBoundsException e){
                //who cares
            }
        }

        return val;
    }
}