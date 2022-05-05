public class sabakOP {
        public class Student {
            private String name;
            private String email;
            private int jashy;

            String setName(String a) {
                return name = a;
            }

            String setEmail(String s) {
                return email = s;
            }
         int setJashy(int f) {
             if (f < 0) {
                 System.out.println("jasy ters bolboosu kerek");

             } else {
                 return jashy = f;
             }


             return f;
         }
}
}
