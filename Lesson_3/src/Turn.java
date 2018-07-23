public class Turn {
    private String word;
    private CharStack queue;


    public Turn(String word) {
        this.word = word;
        this.queue = new CharStack(word.length());
    }

    public void expand() {

        while (!queue.isFull()) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                queue.push(ch);
            }
        }
            for (int i = 0; i < word.length(); i++) {
                char nch = queue.pop();
                System.out.println(nch);
            }


        }
    }


