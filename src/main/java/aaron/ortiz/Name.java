package aaron.ortiz;

public class Name {
    private String chainCharacters;
    private int lenght;
    private String word;



    public Name(String word) {
        this.word = word;
    }

    public String getWord() {

        return word;
    }

    public void setWord(String word) {

        this.word = word;
    }

    public Name(String chainCharacters, int lenght) {
        this.chainCharacters = chainCharacters;
        this.lenght=lenght;


    }
    public String getChainCharacters() {

        return chainCharacters;
    }

    public void setChainCharacters(String chainCharacters) {

        this.chainCharacters = chainCharacters;
    }

    public int getLenght() {

        return lenght;
    }

    public void setLenght(int lenght) {

        this.lenght = lenght;
    }


    public int numberOfCharacters(){

        return this.lenght=this.chainCharacters.length();
    }

    public String capitalLetters(){

        return this.word=this.word.toUpperCase();
    }





    }


