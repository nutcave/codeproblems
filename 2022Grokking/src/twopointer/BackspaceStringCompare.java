package twopointer;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {

        char[] sArr= s.toCharArray();
        char[] tArr= t.toCharArray();

        int i=sArr.length-1;
        int j=tArr.length-1;

        while( i >= 0 || j >= 0){

            i=getNextValidChar(sArr,i);
            j=getNextValidChar(tArr,j);

            if(i < 0  && j <0){
                return true;
            }

            if(i < 0  || j <0){
                return false;
            }

            if( sArr[i] != tArr[j]){
                return false;
            }
            i--;
            j--;



        }

        return true;

    }

    public int getNextValidChar(char[] arr, int i){

        int backSpaceCount=0;
        while(i>=0){
            if(arr[i] == '#'){
                backSpaceCount++;
            }else if(backSpaceCount>0){
                backSpaceCount--;
            }else{
                break;
            }

            i--;
        }

        return i;
    }

    public static void main(String[] args) {
        new BackspaceStringCompare().backspaceCompare("bbbextm", "bbb#extm");



    }
}
