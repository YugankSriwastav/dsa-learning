package sorting.string;

public class StringDivider {
    public StringBuilder[] stringDivider(String token){
        StringBuilder header = new StringBuilder();
        StringBuilder payload = new StringBuilder();
        StringBuilder signature = new StringBuilder();

        int dot = 0;

        for (int i = 0; i < token.length(); i++) {
            if (token.charAt(i) == '.') {
                dot++;
                continue; // dot ko kisi builder mein add nahi karna
            }

            if (dot == 0) {
                header.append(token.charAt(i));
            } else if (dot == 1) {
                payload.append(token.charAt(i));
            } else if (dot == 2) {
                signature.append(token.charAt(i));
            }
        }
        return new StringBuilder[]{header, payload, signature};
    }

    public static void main(String[] args) {
        StringDivider stringDivider = new StringDivider();
        StringBuilder [] returnedValue =
                stringDivider.stringDivider("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ5dWdhbmsifQ.xxxxx");
        for(StringBuilder result : returnedValue){
            System.out.println(result);
        }
    }
}
