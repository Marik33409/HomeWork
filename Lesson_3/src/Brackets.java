public class Brackets {

    private String code;
    private CharStack stack;

    public Brackets(String code) {
        this.code = code;
        this.stack = new CharStack(code.length());
    }

    public void check() {
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            switch (ch) {
                case '[':
                case '{':
                case '(':
                    stack.push(ch);
                    break;
                case ']':
                case '}':
                case ')':
                    if (!stack.isEmpty()) {
                        char valueFromStack = stack.pop();
                        if ((ch == '}' && valueFromStack != '{')
                                || (ch == ']' && valueFromStack != '[')
                                || (ch == ')' && valueFromStack != '('))
                            System.out.println("Error: " + ch + " at " + i);
                    }
                    else {
                        System.out.println("Error: " + ch + " at " + i);
                    }
                    break;
                default:
                    break;
            }
        }

        if ( !stack.isEmpty() ) {
            System.out.println("Error: missing right delimiter");
        }
    }
}
