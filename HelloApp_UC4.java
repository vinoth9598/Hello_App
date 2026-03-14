public class HelloApp_UC4 {
    public static void main(String[] args) {
        
        // using stringBuilder concepts
        StringBuilder name = new StringBuilder();

        for (int i=0; i<args.length; i++){
            name.append(args[i]);

            if(i < args.length - 1){
                name.append(", ");
            }
        }

        System.out.println(name.toString());

    }
}