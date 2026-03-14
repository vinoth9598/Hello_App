public class HelloApp_UC7 {
    public static void main(String[] args) {
        String names = "World";
        if(args.length > 0){
            names = String.join(", ", args);
        }
        System.out.println(names);

        /* 
            run comments 
            - javac HelloApp_UC7.java
            - java HelloApp_UC7 java python javascript
        */
    }
}