
/*
This problem was asked by Google ,HARD level

Given array consisting of characters  'R', 'G' and 'B', 
we need to convert the array into order wise with R's at beginning , G's in the middle 
and B's at last.

Need to do in Linear time and in-place

Ex:

       //char[] ch = {'G','B','R','R','B','G','R'}; // Expected output {'R', 'R', 'R', 'G', 'G', 'B', 'B'};
        //char[] ch = {'R','G','B','G','G','G','R'}; // Expected output {'R', 'R', 'G', 'G', 'G', 'G', 'B'};

        char[] ch = {'R','B','B','G','R','G','R'}; // Expected output {'R', 'R', 'R', 'G', 'G', 'B', 'B'};

*/
public class GoogleReplaceBGR {
    public static void main(String args[]){
        //char[] ch = {'G','B','R','R','B','G','R'}; // Expected output {'R', 'R', 'R', 'G', 'G', 'B', 'B'};
        //char[] ch = {'R','G','B','G','G','G','R'}; // Expected output {'R', 'R', 'G', 'G', 'G', 'G', 'B'};

        char[] ch = {'R','B','B','G','R','G','R'}; // Expected output {'R', 'R', 'R', 'G', 'G', 'B', 'B'};
        //R>G>B 

        replaceChar(ch);
    }
    
    static char[] replaceChar(char[] ch){
        // first check if the first char is R or not,
        // if not then replace that with the last char 
        int n = ch.length;
        for(int i=0,j=i+1;i<n-1; ){
           
            if(ch[i]!='R'){

                if(j>n-1){ // We need to reiterate to make sure elements are sorted
                    j=j-2;
                    i++;
                }

                if(i>j){ // Break the loop once we know all are sorted
                    break;
                }

                if((int) ch[i]-'0' < (int) ch[j]-'0'){
                    
                    // swap the elements, since B should be last , so we need to swap the elements
                    char temp = ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                    
            
        } else{
            j++;
        }
    } else{
        i++;
    }

    }
    System.out.print(ch);
    return ch;
    }
}

