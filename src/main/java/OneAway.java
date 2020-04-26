class OneAway{
	public static void main (final String[] args) {
        System.out.println("P1.5 :: Simple Program to check if two strings are one character apart");
        if(args.length!=2){
            System.err.println( "Incorrect input. Input two Strings to compare.");
            return;
        }
       System.out.println("Result is ::" + isOneAway(args[0], args[1]));
    }

    private static boolean isOneAway(final String s1, final String s2) {
        if(Math.abs(s1.length()-s2.length())>1){
            return false;
        }
        String  largerString;
        String smallerString;
        boolean mismatchFound = false;
        boolean sameLengthStrings = false;
        if(s1.length()>s2.length()){
          largerString = s1;
          smallerString = s2;
        }else{
           largerString = s2;
           smallerString = s1;
        }
        if(s1.length()==s2.length()){
            sameLengthStrings = true;
        }
        for (int lIndex=0,sIndex=0 ;sIndex<smallerString.length();lIndex++) {
            if(smallerString.charAt(sIndex)!=largerString.charAt(lIndex)){
                if(!mismatchFound){
                    mismatchFound=true;
                    //if strings are of same length,advance index of smaller string otherwise don't.
                    if (!sameLengthStrings){
                        continue;
                    }                   
                }else
                    return false;
            }
            sIndex++;
        }        
        return true;
        }

    }
