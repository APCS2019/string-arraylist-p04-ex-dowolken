/** @param str the string to encode using the master string
     *  Precondition: all of the characters in str appear in the master string;
     *  str.length() > 0
     *  @return a string part in the master string that matches the beginning of str.
     *  The returned string part has length at least 1 and largest 5. 
     *  The method gives prefernce to return the longer matches.
     */
    private StringPart findPart(String str){
        int index=1;
        if(str.length()<=5){
            length=str.length();
        while(index!=length)
            {if(masterString.indexOf(str.substring(0,length-index))!=-1)
               {return new StringPart(masterPart.indexOf(str.substring(0,length-index)),length-index);}
             index++;
            }
        return null;
            
        if(str.length()<=5)
            int n=str.length();
        for(int m=n; m> 0:m--)
           {if(masterString.indexOf(str.substring(0,m))!=-1) 
               {return new StringPart(masterPart.indexOf(str.substring(0,m)),m);}
           }
        return null;
