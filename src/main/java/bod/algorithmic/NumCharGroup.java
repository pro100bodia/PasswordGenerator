package bod.algorithmic;


import java.util.LinkedList;
public class NumCharGroup<T> extends CharGroup<T>{
    protected void generate(){
        this.groupPower = 10;
        this.subAlphabet = new LinkedList<T>();
        this.reservedAlphabet = new LinkedList<T>();

        for(int i = 0; i < this.groupPower; i++)
        {
            subAlphabet.add(i);
        }
    }

    public NumCharGroup(int requiredNum){
        super(requiredNum);
    }


}