package klaus_gdi2009;

public class Aufgabe10 {

    public class Cat {
        private String name;
        private int age;

        public Cat(String name, int age) {
            if (age < 1 || age > 199 ||age % 2 == 0)
                System.exit(0);
            this.name = name;
            this.age = age;
        }

        public void meow() {
            System.out.print( name + " *meow*");
        }

        public void meow(int x) {
            for (int i = 0; i < x; i++)
                    meow();
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
