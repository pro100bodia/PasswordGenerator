package bod.algorithmic;

import bod.Entire;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;

import java.util.LinkedList;

import static bod.Globals.getRandomInt;

public class WordsCharGroup<T> extends CharGroup<T> {
    protected void generate(){
        this.subAlphabet = new LinkedList<Character>();
        this.reservedAlphabet = new LinkedList<Character>();
        this.groupPower = 26;
        for(int i = 0; i < this.groupPower; i++)
        {
            this.subAlphabet.add((char)(65 + i));
        }
    }

    public WordsCharGroup(int requiredNum){
        super(requiredNum);
    }

    private String getWordFromJson(String key) throws  IOException{
        JsonReader reader = new JsonReader(new InputStreamReader(Entire.class.getResourceAsStream("/dictionary.json"), "UTF-8"));
        int subKey;
        String word = null;

        reader.beginObject();
        //System.out.println("accepted Key: " + key);
        while(reader.hasNext()){
            word = reader.nextName();
            //System.out.println("letter: " + word);
            if(word.equals(key)){
                reader.beginObject();

                String capacity = reader.nextName();
                //System.out.println("capacity property: " + capacity);

                int cap = reader.nextInt();
                //System.out.println("capacity : " + cap);
                subKey = getRandomInt(0, cap - 1);
                //System.out.println("subKey: " + subKey);

                while(reader.hasNext()){
                    word = reader.nextName();
                    //System.out.println("word property: " + word);
                    if(word.equals("word" + subKey)){
                        return reader.nextString();
                    }else{
                        reader.skipValue();
                    }
                }

                break;
            }else {
                reader.skipValue();
            }
        }

        reader.endObject();
        reader.close();
        return word;
    }

    @Override
    public String getElem(boolean pop, boolean notSequential){
        String letter = super.getElem(pop, notSequential);
        String val = null;

        try {
            val = getWordFromJson("letter" + letter);
        }catch(IOException e){
            e.printStackTrace();
        }catch (IllegalStateException i){
            i.printStackTrace();
        }

        return val;
    }
}
