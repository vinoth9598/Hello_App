public class HelloApp_UC5 {
    public static void main(String[] args) {
        
        StringBuilder name = new StringBuilder();
        boolean first = true ;
       
       for (String names : args){
            name.append(", ");
            if(!first){
                name.append(". ");
            }
            name.append(names);
            first = false ;
       }
       
    }
}