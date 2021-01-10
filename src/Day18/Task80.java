package Day18;

public class Task80 {
    public static void main(String[] args) {

    }

    enum Color {
        White, Red, Blue
    }

    enum Type {
        Rare, Ordinary
    }

    static class ColorException extends Exception {
        public ColorException(String name) {
            super(name);
        }
    }

    static class TypeException extends Exception {
        public TypeException(String name) {
            super(name);
        }
    }

    class Plant {
        private final String name;
        private final Color color;
        private final Type type;

        public Plant(String type, String color, String name) throws Exception {
            this.name = name;

            try {
                this.color = Color.valueOf(color);
            } catch (Exception ex) {
                throw new ColorException("ColorException");
            }

            try {
                this.type = Type.valueOf(type);
            } catch (Exception ex) {
                throw new TypeException("TypeException");
            }
        }

        @Override
        public String toString() {
            return "{type: " + type.name() + ", color: " + color.name() + ", name: " + name + "}";
        }
    }
}
