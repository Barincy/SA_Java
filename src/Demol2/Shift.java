package Demol2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Shift {
    private ArrayList<String> kwicList = new ArrayList<String>();
    private ArrayList<String>lineTxt;

    public Shift(ArrayList<String> lineTxt) {
        this.lineTxt = lineTxt;
    }

    public ArrayList<String> getKwicList() {
        return kwicList;
    }

    public ArrayList<String> getLineTxt(){
        return lineTxt;
    }

    public void shift() {
        Iterator<String> it = lineTxt.iterator();
        while (it.hasNext()) {
            StringTokenizer token = new StringTokenizer(it.next());
            ArrayList<String> tokens = new ArrayList<String>();
            int i = 0;
            int count = token.countTokens();
            while (i < count) {
                tokens.add(token.nextToken());
                i++;
            }

            for ( i = 0; i < count; i++){
                StringBuffer lineBuff = new StringBuffer();
                int index = i;
                for (int f = 0; f < count; f++){
                    if (index >= count){
                        index = 0;
                    }

                    lineBuff.append(tokens.get(index));
                    lineBuff.append(" ");
                    index++;
                }
                String tmp = lineBuff.toString();
                kwicList.add(tmp);
            }
        }
    }
}
