import java.util.Scanner;
import java.util.HashMap;
public class characterCounter{
    public static boolean isCharacter(char ch){
        if(ch>='a' && ch<='z'){
            return true;
        }
        return false;
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int space=0,tab=0,vowel=0;
        HashMap<Character,Integer> character = new HashMap<>();
        System.out.print("Taking Input (Double click the Enter to Stop) :- ");
        while(true){
            String currentLine=in.nextLine();
            if(currentLine.isEmpty()){
                break;
            }
            for(char ch : currentLine.toLowerCase().toCharArray()){
                if(ch==' '){
                    space++;
                }else if(ch=='\t'){
                    tab++;
                }else if((Character.isLetterOrDigit(ch) || !Character.isLetterOrDigit(ch)) && ch!='\n'){
                    if(isCharacter(ch) && isVowel(ch)){
                        vowel++;
                    }
                    character.put(ch,character.getOrDefault(ch,0)+1);
                }
            }
        }
        System.out.println("Total Spaces :- "+space);
        System.out.println("Total Tab :- "+tab);
        System.out.println("Total Vowel :- "+vowel);
        System.out.println("Special Character :- ");
        for(char ch : character.keySet()){
            System.out.println(ch+" "+character.get(ch));
        }
        in.close();
    }
}