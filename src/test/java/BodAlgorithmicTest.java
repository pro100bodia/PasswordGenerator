import bod.algorithmic.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

class BodAlgorithmicTest{
    private int i;
    /*Function for arguments generation for CharGroupClassTest method.
     *  It generates sets like (int className, int pop, int notSequential), where
     *  className is a CharGroup class to be tested
     *    0 is for NumCharGroup, 1 - for SymbCharGroup and 2 is for WordsCharGroup
     *  pop specifies whether to pop the elements - 1 or not - 0
     *  notSequential specifies should the result word contain sequential characters (abc) - 0 or not - 1
     */
    private static Stream<Arguments> charGroupsArpeggio(){
        List<Arguments> args = new LinkedList<>();
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                for(int k = 0; k < 2; k++)
                {
                    args.add(Arguments.of(i, j, k));
                }
            }
        }

        return args.stream();
    }

    @ParameterizedTest
    @MethodSource("charGroupsArpeggio")
    @Disabled
    void CharGroupClassTest(int className, int pop, int notSequential) {
        System.out.println("running test with parameters:  " + className + " " + pop + " " + notSequential);
        int requiredNum = 0;
        CharGroup cg = null;

        switch(className)
        {
            case 0:
                requiredNum = 12;
                cg = new NumCharGroup<Byte>(requiredNum);
                break;
            case 1:
                requiredNum = 42;
                cg = new SymbCharGroup<String>(requiredNum);
                break;
            case 2:
                requiredNum = 24;
                cg = new WordsCharGroup<Character>(requiredNum);
                break;
        }

        for(i = 0; i < requiredNum; i++)
        {
            System.out.println("NumCharGroup collection: ");
            for(Object o: cg.getSubAlphabet())
            {
                System.out.print(o + " ");
            }
            System.out.println();

            try {
                System.out.println("output in the test: " + cg.getElem((pop == 1), (notSequential == 1)));
            }catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}