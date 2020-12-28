package Day14;

public class Task62 {
    public static String drawLine(LineType lineType) {
        return "The line is " + lineType.getType().toLowerCase() + " type";
    }

    enum LineType {
        SOLID("solid") {
            String getType() {
                return type;
            }
        },
        DOTTED("dotted") {
            String getType() {
                return type;
            }
        },
        DASHED("dashed") {
            String getType() {
                return type;
            }
        },
        DOUBLE("double") {
            String getType() {
                return type;
            }
        };

        String type;

        LineType(String type) {
            this.type = type;
        }

        String getType() {
            return null;
        }
    }
}
