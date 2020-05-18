public class ReverseStringBuilder {
    public String original;

    ReverseStringBuilder(){
        this.original = null;
    }

    void setString(String input){
        this.original = input;
    }

    public String getString(){
        return this.original;
    }

    public String produceReverse(){
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        return reverse;
    }
}
